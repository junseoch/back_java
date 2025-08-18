package inputTest;

import java.util.Scanner;

// Ctrl + Shift + O
// 자동 import

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요.", name = null ,lastName = null, firstName = null;
		
//		System.out.println(message);
//		

//		nextLine()  // nextLine() : 공백까지를 하나의 값으로 봄
//		System.out.println(name + "님 환영합니다");
		
	      System.out.println(message);
//	      lastName = sc.next(); // sc.next() -> 홍길동 : 문자열값!
//	      firstName = sc.next(); // sc.next() : 공백문자를 기준으로 값을 따로 처리함
	      name = sc.nextLine();
	      
	      System.out.println(name + "님 환영합니다.");
		
	}
}
