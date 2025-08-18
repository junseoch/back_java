package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		
//      사용자에게 정수를 2개 입력 받고,
//      두 수를 더해서 출력하기
//      30 
//      50
//      출력: 80
//      단, 메서드는 .next()만 사용
		Scanner sc = new Scanner(System.in);
		
		String num1 = null, num2 = null, message = "";
		int result1 = 0 , result2 = 0, result3 = 0; // 초기화!
		
		message = "정수 2개를 입력하세요!";
		System.out.println(message); // 물어보는 message
		
		num1 = sc.next(); // 문자열값!(String)
		num2 = sc.next();
		result1 = Integer.parseInt(num1); // 문자열 값을 int로 변경해서 연산
		result2 = Integer.parseInt(num2);
		
		result3 = result1 + result2; // 연산
		System.out.printf("정답 : %d",result3);
		
	
	}
}
