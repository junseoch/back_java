package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	
		static public  void printOdd() {
			
		}

	public static void main(String[] args) {
//		0 ~ 9
		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.rangeClosed(0, 10).forEach((n) -> {
			datas.add(n);
		});
//		
//		IntStream
//		정수형 문법으로 stream을 쓰겠다
//		.range(시작, 끝) : 마지막을 포함하지 않는다
//		.rangeClosed(시작, 끝) : 마지막을 포함한다
		
//		System.out.println(datas);
		
//		1~5까지 스트림 문법으로 출력하기
//		IntStream.rangeClosed(1, 5).forEach((n) -> {
//			datas.add(n);
//		});
//		System.out.println(datas);
		
//		참조형 문법
//		.(소속 :: 메서드명)
//		IntStream.rangeClosed(1, 5).forEach(System.out::println);
		
		System.out.println(datas);
		
		// datas 짝수만 출력하기
		datas.forEach((n) -> { if(n % 2 == 0) { System.out.println(n); } });
		
		// datas 홀수만 출력하기
		datas.stream().filter((n) -> (n % 2 == 1)).forEach(System.out::println);
		
		
		datas.stream().map((n) -> {
			return n + 1;
		}).forEach(System.out::println);

//		.stream(): 컬렉션을 Stream 객체로 변경
//		.chars() : 문자열을 stream 문법으로 변경
		"ABCD".chars().forEach(System.out::print);
		
		System.out.println("");
		
		"ABCD".chars().forEach((c) -> {
			System.out.println((char)c);
		});
		
	}
	
}
