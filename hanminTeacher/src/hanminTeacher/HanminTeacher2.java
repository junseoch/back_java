package hanminTeacher;

import java.io.BufferedReader;
import java.util.Scanner;

public class HanminTeacher2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String num1 = null, num2 = null; 
		int result1 = 0, result2 = 0, result = 0;;
		
		System.out.println("2개의 값을 입력하세요 ex) 5 2");
		
		num1 = scan.next();
		System.out.println("다음 값을 입력하세요");
		num2 = scan.next();
		
		result1 = Integer.parseInt(num1);
		result2 = Integer.parseInt(num2);
		
		result = result1 - result2;
		
		System.out.printf("%d - %d = %d", result1,result2, result);
	}
}
