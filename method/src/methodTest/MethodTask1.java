package methodTest;

public class MethodTask1 {
	
	void printNum() { // 메서드 선언
		for(int i = 0; i < 10; i++) {
		System.out.println(i + 1);
	  }
	}
	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1(); // 클래스 선언
		mt.printNum(); // 클래스.메서드 
	}
}
