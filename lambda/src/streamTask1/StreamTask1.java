package streamTask1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTask1 {

	public static void main(String[] args) {
		
		
//      요구사항
//      모두 stream문법으로 사용한다.
		
//		for, while, if 불가
      
//      1. 1~10까지 ArrayList에 담고 출력
//      2. ABCDEF를 각각 문자별로 출력
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"
      
		
//      1. 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		IntStream.rangeClosed(0, 10).forEach((n) -> data1.add(n));
//		System.out.println(data1);
		
//      2. ABCDEF를 각각 문자별로 출력
		ArrayList<String> data2 = new ArrayList<String>();
		data2.add("ABCDEF");
		
//		System.out.println(data2);
		
//		data2.stream().map((n) -> n.charAt(0)).forEach((n) -> System.out.println(n));
		
//		3. 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> data3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 1).forEach(data3::add);
		System.out.println(data3);
		
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
		ArrayList<String> data4 = new ArrayList<String>();
		data4.add("ABCDEF");
//		data4.stream().map((n) -> n.toCharArray()).forEach((n)-> System.out.println(n));
		
//		5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
		ArrayList<String> data5 = new ArrayList<String>();
		data5.add("Black");
		data5.add("WHITE");
		data5.add("reD");
		data5.add("yeLLow");
		data5.add("PInk");
		
		
		data5.stream().map((n) -> n.toLowerCase()).forEach((n) -> System.out.println(n));
		
		
	}
	
}
