package methodTest;

import java.util.Scanner;

public class MethodTask6 {

	// 1. 문자열 입력받고 원하는 문자의 개수를 구하는 메서드
	// scanner로 입력
	// 매개변수 String으로 받아야 함
	// abcd -> 개수 
	// "aabcd"에서 a의 개수
	//  문자열 -> char으로 바꿈
	// 'a', 'a' 'b' 'c'
	//  'a'의 아스키 코드 : 97
	//  'A'의 아스키 코드 : 65
	//  65이상 97이하면 count에 누적합
	//  아니면 누적X
	
	
	// replace, replaceAll 메서드 사용
	
	int getCount(String value, char c) {
		return value.length() - value.replaceAll(String.valueOf(c), "").length();
	}
	 
	public static void main(String[] args) {
		MethodTask6 mt = new MethodTask6();
		int count = 0 ;
		count = mt.getCount("abcdeaaa", 'a');
		System.out.println(count);
	}

	
}
