package methodTest;

public class MethodPractice1 {

	// 3개 정수 받아서 모두 뺀 값을 반환 해주는 메서드 선언
	int printNum(int num1, int num2, int num3) {
		return(num1 + num2 + num3);
	}
	
	// 성과 이름을 붙여서 출력해주는 메서드 선언
	void addlastNameFirstName (String lastName, String firstName) {
		String fullName = lastName + firstName;
		System.out.println(fullName);  
	}
	
	
	public static void main(String[] args) {
		// 메서드를 쓰고 싶으면 클래스부터 찾아라!
		
		MethodPractice1 mp1 = new MethodPractice1();
		new MethodPractice1().printNum(0, 0, 0);
		
		
		mp1.addlastNameFirstName(null, null);
		
	}
	
}
