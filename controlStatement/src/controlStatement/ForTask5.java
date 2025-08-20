package controlStatement;

import java.util.Scanner;

public class ForTask5 {
	public static void main(String[] args) {
		

//      1. ACEG...Z 출력!
		// ABCDEFG
		// A C E G ...
		// 0 2 4 6 ...
//		'a': 97
//      'A': 65

		
		for(int i = 0; i < 26; i++) {
			if(i % 2 == 0) {
//				System.out.print((char)(65+i));
			}
			else {
				continue;
			}
		}
////		
//      2. 1 ~ N까지의 합 출력!
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		int result = 0;
//		
//		for(int i = 0 ; i < num; i++) {
//			result += (i + 1);
//		}
//		System.out.println(result);
		
//      3. 01234 01234 출력!
		
//		01234 01234
//		01234 56789
		// i가 5부터 -5
//		for(int i = 0; i < 10; i++) {
//			if(i >= 5) {
//				System.out.print(i-5);
//			} else {
//				System.out.print(i);
//			}
//		}
		// 강사님 풀이
		
		
//      4. 입력예시) a 1 b 22 c 357
//      abbbbbbbbbbbbbbccccccccccccccccccccccccccccccccc
//      사용자가 입력한 횟수가 얼마가 있을지 모르고, 
//      입력한 횟수만큼 반복해주는 프로그램 만들기
     
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		// 문자열 -> char
		
		// 'a': 97 
		
		for(int i = 0; i < 26; i++) {
			
		}
		
		
	}
}
