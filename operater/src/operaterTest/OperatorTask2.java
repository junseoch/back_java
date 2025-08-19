package operaterTest;

import java.util.Scanner;

public class OperatorTask2 {
	public static void main(String[] args) {
		
		// 숫자 3개중 중간값 찾기
//      3개의 입력값 중 중간값 찾기
//      17 25 35
//      10 3 8
//      sc.next();
//      sc.nextint();
//      입력예시: 10 3 8
//      출력예시: 중간값: 8
		
		// 11 3 2
		
		//  a b c
		// 1) a > b
		// a > b , a > c  a: max 
		// a > b , a
		// a > b , a > c  
		
//		3 7 9
		
		// 조건식 ?  true  :  false
		
//		result2 = (num1 > num2)? num1: num2;
//		  max = (num1 > num2) && (num1 > num3) ? num1 : (num3 > num2 ? num3 : num2);

//		  min = (num1 < num2) && (num1 < num3) ? num1 : (num3 < num2 ? num3 : num2);
		
		
//		입력한 값 - min - max = mid
		
		Scanner sc = new Scanner(System.in);
		String string1 = "", string2 = "", string3 = "";
		int maxNum = 0;
		
		System.out.println("숫자 3개를 입력하세요");
		
		string1 = sc.next();
		string2 = sc.next();
		string3 = sc.next();
		
		int num1 = Integer.parseInt(string1);
		int num2 = Integer.parseInt(string2);
		int num3 = Integer.parseInt(string3);
		
		int max = (num1 > num2) && (num1 > num3) ? num1 : (num3 > num2 ? num3 : num2);
		int min = (num1 < num2) && (num1 < num3) ? num1 : (num3 < num2 ? num3 : num2);
		int mid = num1 + num2 + num3 - max - min; // 입력한 num들 중에서 min, max 제외한 나머지
		
		System.out.printf("중간값 : %d",mid);
		
		sc.close();
		
	}
}
