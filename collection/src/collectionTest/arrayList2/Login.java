package collectionTest.arrayList2;

public class Login {

	public static void main(String[] args) {
		UserField userField = new UserField();
		
//		회원가입
		//						이 데이터는 프론트에서 올 것이다
		User user = new User("abc1234", "홍길동", "1234", "01012341234");
		
		// 버튼 눌러서 join이 왔겠지
		userField.join(user);
		System.out.println(DBconnecter.users); 
		
//      로그인
      User userForLogin = new User("ksh1234", "김세환", "1234", "01000000000");
      	if(userField.login(userForLogin)) {
      		System.out.println("로그인 성공");
      	}else {
      		System.out.println("로그인 실패");
      	}
		
//      비밀번호 변경
      userForLogin.setPassword("12345");
      userField.update(userForLogin);
		
//      로그아웃
		userField.logout();
		System.out.println(userField.userId);
		
		// userFiled : 유저들의 각종 기능들을 수행하는 집합체, 여러 기능들이 있음
		// userForLogin : 로그인을 시도하는 유저 객체
	}
	
}
