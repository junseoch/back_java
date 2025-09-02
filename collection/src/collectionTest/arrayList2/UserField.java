package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
//	컴파일러가 이미 users를 올려놓음
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
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
		public boolean login(User user) {
//      아이디를 검사
			User userInDb = checkId(user.getId());  // 아이디 검사부터 
				if(userInDb != null) {
//         비밀번호 검사
				if(userInDb.getPassword().equals(user.getPassword())) { // 화면에서 뿌려주는 비번이랑 유저의 비번이랑 equals로 비교
            userId = userInDb.getId(); // 세션에 담아놓음
            	return true;
         }
      }
				return false;
   }
		
//		로그아웃
		public void logout() {
			userId = null;
		}
		
//		암호화 - 아스키코드 이용
		
		// 유저의 비밀번호를 받음
		// 반복문을 돌면서 받은 문자열을 char로 변환
		// 아스키코드
		
		public void security(String password) {
			
		}
		
		
//		비밀번호 변경(마이페이지)
//		비밀번호 변경(비밀번호 변경 30일)
//		인증번호 전송
//		인증번호 생성
//		인증번호 확인
		
		
		public static void main(String[] args) {
			
		}
		
}
