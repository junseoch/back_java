package exceptionTask;

import java.util.Scanner;

// 사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직
// 만든 예외를 이용해서 메세지를 출력
// 나만의 예외 필요
public class ExceptionTask2 {
   public static void main(String[] args) {
      
	   Scanner sc = new Scanner(System.in);
	   String message = null;
	   
	   System.out.println("메세지 입력");
	   message = sc.nextLine();
	   
	   try {
		if(message.contains("!")) {
			   throw new WrongWordException("잘못된 입력입니다");
		   }
		   else if(message.contains("@")) {
			   throw new WrongWordException("잘못된 입력입니다");
		   }
		   else if(message.contains("#")) {
			   throw new WrongWordException("잘못된 입력입니다");
		   }
		   else {
			   System.out.println("문제 없음");
		   }
	} catch (WrongWordException e) {
		System.out.println("특수문자는 입력 불가능합니다");
		System.out.println(e.getMessage());
		System.out.println(e.getClass());
	}
	   
	   
	   
   }
}
