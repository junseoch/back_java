package controlStatement;

import java.util.Scanner;

public class ForTask4 {
	public static void main(String[] args) {
//      해당 문자와 반복할 횟수를 입력하면 전체 문자열을 만들어주는 프로그램
//      입력 예시) a1 b3 d2 c4
//      출력 예시) abbbddcccc
//      단 횟수는 0을 입력하지 않는다.
//		단 횟수는 1~9
		
//		a 1 b 3 d 2 c 4
//      출력 예시) a bbb dd cccc
		
// 알파벳 26개
// 짝수 : 문자 개수
// 홀수 : 문자 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		String num = sc.next(); // 입력한 문자열
//		
//		// string -> char
//		for(int i = 0; i < (int)num.length(); i++) {
//			char c = num.charAt(i);
////			System.out.println(c);
//			
//		}
		

		
      Scanner sc = new Scanner(System.in);
      String message = "문자와 반복할 횟수를 붙여서 입력하세요.\nex)a1b2",
            input = null, result = "";
      
      System.out.println(message);
      input = sc.next();
      
//      for(int i = 0; i < input.length(); i++) {
//         if(i % 2 == 0) {
//            char c = input.charAt(i);
//            int count = input.charAt(i + 1) - 48;
//            
//            for(int j = 0; j < count; j++) {
//               result += c;
//            }
//         }
//      }
//      System.out.println(result);
      
      for(int i = 0; i < input.length(); i += 2) {
         char c = input.charAt(i);
         int count = input.charAt(i + 1) - 48;
         
         for(int j = 0; j < count; j++) {
            result += c;
         }
      }
      System.out.println(result);
		
	}
}
