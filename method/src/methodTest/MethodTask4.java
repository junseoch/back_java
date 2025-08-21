package methodTest;

import java.util.Scanner;

public class MethodTask4 {

	// 사용자에게 이름과 반복 횟수를 받음 
	void PrintName(String name, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask4 mt4 = new MethodTask4();
		
		Scanner sc = new Scanner(System.in);
		int num2 = 0;
		String stringNum = null;
		
		stringNum = sc.next();
		num2 = sc.nextInt();
		mt4.PrintName(stringNum, num2);
	}
}
