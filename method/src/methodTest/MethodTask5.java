package methodTest;

import java.util.Scanner;

public class MethodTask5 {

	// 메소드의 리턴 타입이 void가 아니면 사용한 부분 통채로가 값!
	
	// 1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
	int printNum(int num1) {
		return (num1 + (num1 + 1) / 2);
	}
	// 2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
	// 홀수, 짝수 판별 : 정수 % 2 == 0
	// 문자열 판별 : 문자열

	// scanner로 문자열로 받음 "1"  or "홍"
	// 문자열을 정수로 변환 -> 
	
//	String printOddOrEven(int num2, String str1) {
//		if() {
//		
//		}
//	}
	
	// 3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
	String stringToUpper(String stringInput) {
		return stringInput.toUpperCase();
	}
	
	// 4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
	// 입력 예시) abcdef  0 1 2 3 4 5  +1
	// 출력 예시) fedcba  5 4 3 2 1 0  -1
	
	// 문자열로 받아서 char로 형변환
			// 인덱스 5 4 3 2 1 -1 -2
	void printReverse(String str2) {
		for(int i = 5 ; i < str2.length(); i--) {
			if(i > 0) {
				char c = str2.charAt(i);
				System.out.print(c);
			}
		}
	}

	// 5. 1~4번까지 메서드 사용
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringNum = null, strNum = null;
		
		MethodTask5 mt5 = new MethodTask5();
//		System.out.println(mt5.printNum(5));
//		strNum = sc.next();
//		System.out.println(mt5.printOddOrEven("홍"));
//		stringNum = sc.next();
//		System.out.println(mt5.stringToUpper(stringNum));
		mt5.printReverse("abcdef");
	}
}

	