package methodTest;

import java.util.Scanner;

// 사용자에게 이름과 반복 횟수를 받아서 반복 횟수만큼 이름을 출력

public class MethodTask4Practice {
	
	
	void printName(String name, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		
		MethodTask4Practice mt4 = new MethodTask4Practice();
		Scanner sc = new Scanner(System.in);
		
		String inputName = sc.next();
		int inputCount = sc.nextInt();
		
		mt4.printName(inputName, inputCount);
		
	}
}
