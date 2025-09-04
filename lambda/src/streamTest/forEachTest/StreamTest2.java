package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		
//		1 ~ 10까지 추가
		// 횟수를 먼저 만들어줘야함
		// map은 datas를 바꾸는 것
		// 범위를 먼저 지정
		IntStream.rangeClosed(1, 10).forEach((n) -> {datas1.add(n);});
		System.out.println(datas1);
		
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] -> toString이 재정의 되어있음

//		IntStream.rangeClosed(1, 10)  -> 1부터 10까지 나올 것이다 라고 생각

		
		// stream문법으로 datas1에서 1부터 5까지 삭제
		
		// 1부터 5까지의 배열로 수정 -> map
		// n : 1~10까지
		//   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 배열에서  [6, 7, 8, 9, 10]을 걸러야 함
		//  n : 1 ~ 10
		
//		IntStream.range(0, 5).forEach((n) -> {datas1.remove(0);});
		
//		참조할 수 없는 알고리즘
		IntStream.range(0, 5).forEach(datas1::remove);
		System.out.println(datas1);
		
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
//		10부터 1까지 추가 후 출력
		IntStream.range(0, 10).forEach((n) -> { datas2.add(10 - n); });
		
		// datas.forEach 하면 안 됨
		
		System.out.println(datas2);
		
		ArrayList<String> datas3 = new ArrayList<String>();
		
//		"ABCDEDFGHIJK"을 datas3에 각각 추가 후 출력
//		"A", "B", "C" ,..."K"
		
//		IntStream.range(0, 12).forEach((n) -> { datas3.add(n); });
		
//		"ABCDEDFGHIJK".chars().forEach((n) -> { 
//			datas3.add(String.valueOf((char)n));
//		});
//		datas3.forEach(System.out::print);
		
		
		ArrayList<String> datas4 = new ArrayList<String>();
		
//      "aBcDeFgHiJk"을 datas4에 소문자만 각각 한 글자씩 추가 후 출력하기
		
		// forEach는 기능이니까 if문 사용가능
//		"aBcDeFgHiJk".chars().forEach((n) -> {
//			if(n >= 97 && n <= 122) {
//				datas4.add(String.valueOf((char)n));
//			}
//		});
//		datas4.forEach(System.out::print);
		
		ArrayList<String> datas5 = new ArrayList<String>();
		
//      "aBcDeFgHiJk" datas5에 모두 대문자로 변경 후 추가, 그리고 모두 출력
		"aBcDeFgHiJk".chars().forEach((n) -> {
			datas5.add(String.valueOf((char)n).toUpperCase());
		});
//		datas5.forEach(System.out::print);
		datas5.forEach((data) -> {System.out.print(data);});
		
	}
}
