package methodTest;

import java.util.Scanner;

// 1~n까지 출력해주는 메서드
public class MethodPractice3 {

	void printOntToN(int num) {
		for(int i = 0; i < num ; i++) {
			System.out.println(i + 1);
		}
	}
	
	public static void main(String[] args) {
		
		MethodPractice3 mt3 = new MethodPractice3();
		Scanner sc = new Scanner(System.in);
		int inputN = sc.nextInt();
		mt3.printOntToN(inputN);
		
	}
}
