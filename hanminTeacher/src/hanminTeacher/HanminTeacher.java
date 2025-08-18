package hanminTeacher;

import java.util.Scanner;

public class HanminTeacher {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		
		System.out.println("계산기 프로그램입니다 숫자를 입력하세요 ex) 3 4");
		String num1 = null, num2 = null , num3 = null;
		double result = 0.0, result1 = 0.0, result2 = 0.0;
		
		System.out.println("첫번째 숫자를 입력하세여");
		num1 = sc.next();
		System.out.println("두번째 숫자를 입력하세여");
		num2 = sc.next();
		
		result1 = Double.parseDouble(num1);
		result2 = Double.parseDouble(num2);
		
		result = result1/result2;
		
		System.out.printf("%.2f",result);
		
		
	}
}
