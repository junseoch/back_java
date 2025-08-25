package methodTest;

// 1~10까지 출력해주는 메서드 선언
// 메서드 사용

public class MethodPractice2 {
	
	
	void printNumToTen() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	public static void main(String[] args) {
		
		MethodPractice2 mp2 = new MethodPractice2();
		mp2.printNumToTen();
		
	}
}
