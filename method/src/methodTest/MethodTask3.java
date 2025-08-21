package methodTest;

public class MethodTask3 {
	
// 1 ~ n까지 출력해주는 함수
	
	void printN(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(i + 1);
		}
	}
	
	public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3();
		mt.printN(5);
	}
}

