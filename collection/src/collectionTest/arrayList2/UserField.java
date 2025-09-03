package collectionTest.arrayList2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeMessage.RecipientType;

public class UserField {
//	컴파일러가 이미 users를 올려놓음
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
	public static String code;
	final int KEY = 300; //상수 표기

//		아이디 검사
		public User checkId(String id) {
//		 	id를 받아서 db에 아이디가 있는지 아닌지를 검사한다.
			for(User user : users) {
				if(user.getId().equals(id)) {
					return user;
				}
			}
			return null;
		}
		
//		회원 가입
		public void join(User user) {
			User userInDb = checkId(user.getId());
			if(userInDb == null) { // 값이 있는지 없는지를 null로 판단
				// 데이터가 안 들어왔으면 null
				users.add(user);
			}
		}
		
		// 회원가입
		// 이미 아이디, 비밀번호가 중복되지 않는 걸 확인했음
		
//		로그인 
		// 회원가입(join)을 먼저 진행 후 해야 함
		// User 클래스를 받음
		// 내가 입력한 아이디와 DB에 회원가입 해놓은 아이디가 같은지 판단
		// 내가 입력한 비밀번호와 DB에 회원가입 해놓은 비밀번호가 같은지 판단
		// 아이디 판단 && 비밀번호 판단을 둘 다 만족해야 로그인을 할 수 있음
		// 입력받은 아이디, 비밀번호가 db에서 검사 후 null을 return 해야 함
		
		
		// 아이디가 틀렸는지 비밀번호가 틀렸는지 알기 위해서 각각 검사해야 함
		// 아이디를 검사 : checkId
		// id가 있으면 userInDb에 담을 것
		
		
//      로그인
		// 객체로 일괄로 받음
		public boolean login(User user) {
//      아이디를 검사
//			있으면 유저가 있는거니까 유저가 있을 때는 비번 검사
			User userInDb = checkId(user.getId());  
				if(userInDb != null) { // null이 아님 : db에 user객체가 들어있는 것
//         			비밀번호 검사
					if(userInDb.getPassword().equals(user.getPassword())) { // Db에 있는 비번과 입력받은 user의 비번 비교
						// 세션에 로그인 정보를 넣어서 어디서든 그 정보를 쓸 수 있도록 함
						userId = userInDb.getId(); 
						return true; // 성공
				}
			}
				return false; // 실패
		}
		
//		로그아웃
		public void logout() {
			userId = null;
		}
		
//		암호화
	public String encrypt(String password) {
		String encryptPassword = "";
		for(int i = 0; i < password.length(); i++) {
			encryptPassword += (char)(password.charAt(i) * KEY);
		}
		return encryptPassword;
	}
		
//		비밀번호 변경(마이페이지)

	// 프론트엔드에서 비밀번호가 유효한지 판단함
	// 여기서는 비밀번호를 바꾸기만 하면 됨
	
	
	// user을 받으면 재사용이 가능함
	// update를 통해서 password말고 다른 것들도 바꿀 수 있음
	// 화면쪽에서 이미 바꾼 password를 입력했음
	// 암호화만 하면 됨
	public void update(User user) {
		
		// Db에 있는 password를 새로 입력한 password로 바꾸기만 하면 됨
		  User userInDb = checkId(user.getId());
	      if(userInDb != null) {
	         userInDb.setPassword(encrypt(user.getPassword()));
	      }
	   }
	
	
//		비밀번호 변경(비밀번호 변경 30일)
//	    이미 로그인 된 상태이기 때문에 변경만 하면 된다
	    
	public void update(String newPassword) {
	      User userInDb = checkId(userId);
	      if(userInDb != null) {
	         userInDb.setPassword(encrypt(newPassword));
	      }
	   }
	
	
//		인증번호 생성
	public String randomNumber() {
		String code = "";
		for(int i = 0; i < 6; i++) {
			code += (int)(Math.random() * 10);
			this.code = code;
		}
		return code;
	}

	
	
//		인증번호 전송
	public void sendEmail(String toMemberEmail) {
		
		 final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
	        
	        //원하는 메일 제목 작성
	        String subject = "메일 발송 테스트";
	        
	        //보낸 이메일 작성
	        String fromEmail = "ljs862200@gmail.com";
	        String fromUsername = "최준서";
	        
	        String toEmail = toMemberEmail; // 콤마(,)로 여러개 나열
	        
	        //도메인 사용할 필요 없다
	        //앱비밀번호
	        final String username = "ljs862200@gmail.com";         
	        final String password = "sbvk hyqa ywwc fxnx";
	        
	        // 랜덤 코드 생성
	        this.randomNumber();
	        
	        // 메일에 출력할 텍스트
	        String html = null;
	        StringBuffer sb = new StringBuffer();
	        sb.append("<h3>인증번호 발송</h3>\n");
	        
	        sb.append("<h4>[인증번호 6자리]</h4>\n");    
	        
	        sb.append("<h4>" + code + "</h4>\n");    
	        
	        sb.append("<h4>테스트 발송</h4>\n");    
	        html = sb.toString();
	        
	        // 메일 옵션 설정
	        Properties props = new Properties();    
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	        
	        try {
	          // 메일 서버 인증 계정 설정
	          Authenticator auth = new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	              return new PasswordAuthentication(username, password);
	            }
	          };
	          
	          // 메일 세션 생성
	          Session session = Session.getDefaultInstance(props, auth);
	          
	          // 메일 송/수신 옵션 설정
	          Message message = new MimeMessage(session);
	          message.setFrom(new InternetAddress(fromEmail, fromUsername));
	          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
	          message.setSubject(subject);
	          message.setSentDate(new Date());
	          
//	          // 메일 콘텐츠 설정
	          Multipart mParts = new MimeMultipart();
	          MimeBodyPart mTextPart = new MimeBodyPart();
	          MimeBodyPart mFilePart = null;
	 
//	          // 메일 콘텐츠 - 내용
	          mTextPart.setText(html, bodyEncoding, "html");
	          mParts.addBodyPart(mTextPart);
//	                
//	          // 메일 콘텐츠 설정
	          message.setContent(mParts);
	     
	          // 메일 발송
	          Transport.send( message );
	          System.out.println("인증번호 발송 완료");
	          
	        } catch ( Exception e ) {
	          e.printStackTrace();
	        }
		}
		
		
//		인증번호 확인 
	public boolean checkCode(String inputCode) {
		return code.equals(inputCode);
	}
	
		public static void main(String[] args) {
			UserField uf = new UserField();
			Scanner sc = new Scanner(System.in);
			String message = "인증번호를 입력하세요", inputCode = null;
			int errorCount = 0;
			
			uf.randomNumber();
			uf.sendEmail("ljs862200@gmail.com");
//			이메일 인증번호 확인
			System.out.println(message);
			inputCode = sc.nextLine().trim();
			
			do{
				if(errorCount == 0) {
					System.out.println(message);
					inputCode = sc.nextLine().trim(); 
				} else if(errorCount > 0 && errorCount < 3) {
					errorCount++;
					System.out.println("다시 입력하세요");
					inputCode = sc.nextLine().trim();
				} else if(errorCount > 3){
					System.out.println("처음부터 다시 인증해주세요");
					break;
				}
				errorCount++;
				
			} while(!uf.checkCode(inputCode));
			
			if(uf.checkCode(inputCode)) {
				System.out.println("인증 완료");
			} else {
				System.out.println("인증 실패");
			}
			
		}
		
}
