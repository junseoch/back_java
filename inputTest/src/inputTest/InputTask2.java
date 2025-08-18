package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		
//      3개의 정수를 한 번에 입력 받은 후
//      세 정수의 곱셈을 출력
//      sc.next()만 사용
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = null, num2 = null, num3 = null, resultMessage = "첫번째 값 : %s, 두번째 값: %s , 세번째 값: %s, 정답 : %d ",
				message1 = null, message2 = null, message3 = null;
		int result1 = 0, result2 = 0, result3 = 0, result = 0;
		
		String message = "3개의 정수를 입력하세요!\n";
		System.out.println(message);
		
		
		message1 = "첫번째 정수를 입력하세요!";
		System.out.println(message1);
		num1 = sc.next(); // String값
		
		message2 = "두번쩨 정수를 입력하세요!";
		System.out.println(message2);
		num2 = sc.next();
		
		message3 = "세번째 정수를 입력하세요!";
		System.out.println(message3);
		num3 = sc.next();
		sc.close();
		
		result1 = Integer.parseInt(num1);
		result2 = Integer.parseInt(num2);
		result3 = Integer.parseInt(num3);
		
		result = result1 * result2 * result3;
		
		System.out.printf(resultMessage, num1, num2, num3, result);
		
	}
}
