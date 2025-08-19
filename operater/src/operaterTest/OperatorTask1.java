package operaterTest;

import java.util.Scanner;

public class OperatorTask1 {
	public static void main(String[] args) {
		
//      사용자가 입력한 값이 정수인지 실수인지 확인하여 결과를 출력하시오.
//      단 next() 사용
//      입력 결과) 1.1
//      출력 결과) 실수
		
//		num1 == 1.1 이면 "실수" 출력
//		num1 == 1.1 ? "실수" : ""; 
//		입력한 값 == true ? "실수" : "정수"
//		num1 : 입력한 문자열 값 
		
		
//		// 2.7 % 1 == 0  이면  
//		Scanner sc = new Scanner(System.in);
//		String num1 = null;	
//		double doubleNum = 0;
//		System.out.println("숫자를 입력하세요");
//		num1 = sc.next(); // 입력한 문자열값
//	
//		double num2 = Double.parseDouble(num1); // 입력한 문자열 값을 실수로 변환
//		
//		// 3.2
		
		
	     Scanner sc = new Scanner(System.in);
	      String message = "실수 또는 정수를 입력하세요.\nex)1.7", 
	            expression = null, integerResult = "",
	            result = "입력값: %s\n%s입니다.", intMessage = "정수", floatMessage = "실수";
	      double num1 = 0.0;
	      int num2 = 0;
	      
	      System.out.println(message);
	      expression = sc.next();
	      num1 = Double.parseDouble(expression);
	      num2 = (int)num1;
	      integerResult = num1 - num2 == 0 ? intMessage : floatMessage;
	      System.out.printf(result, expression, integerResult);
		
	}
}
