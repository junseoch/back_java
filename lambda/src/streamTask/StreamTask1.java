package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask1 {

	public static void main(String[] args) {
		
		
//      요구사항
//      모두 stream문법으로 사용한다.
		
//		for, while, if 불가
      
//      1. 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(datas1::add);
		datas1.forEach(System.out::println);
		
//      2. ABCDEF를 각각 문자별로 출력
		IntStream.range(0, 6)
        .mapToObj((n) -> (char)('A' + n))
        .collect(Collectors.toCollection(ArrayList::new))
        .forEach(System.out::println);
		
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> datas3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 50).map((n) -> n * 2 - 1).forEach(System.out::println);
		
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
		 IntStream
         .range(0, 5)
         .mapToObj((n) -> (char)(n > 2 ? 'A' + n + 1 : 'A' + n))
         .collect(Collectors.toList())
         .forEach(System.out::println);
      
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
		 ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
		 datas5.stream().map((n) -> n.toLowerCase()).forEach(System.out::println);
		 
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
		 ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
	      datas6.stream()
	         .filter((s) -> s.charAt(0) >= 65)
	         .filter((s) -> s.charAt(0) <= 90)
	         .forEach(System.out::println);
		 
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
	      String hangle = "공일이삼사오육칠팔구";
	      String input = "일공이사";
	      input.chars().map(hangle::indexOf).forEach(System.out::println);
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"
      
		
		
		
		
		
////      1. 1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> data1 = new ArrayList<Integer>();
//		IntStream.rangeClosed(0, 10).forEach((n) -> data1.add(n));
////		System.out.println(data1);
//		
////      2. ABCDEF를 각각 문자별로 출력
//		ArrayList<String> data2 = new ArrayList<String>();
//		data2.add("ABCDEF");
//		
////		System.out.println(data2);
//		
////		data2.stream().map((n) -> n.charAt(0)).forEach((n) -> System.out.println(n));
//		
////		3. 1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> data3 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 1).forEach(data3::add);
//		System.out.println(data3);
//		
////      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
//		ArrayList<String> data4 = new ArrayList<String>();
//		data4.add("ABCDEF");
////		data4.stream().map((n) -> n.toCharArray()).forEach((n)-> System.out.println(n));
//		
//		// 
//		
////		5. 5개의 문자열을 모두 소문자로 변경 후 출력
////      "Black", "WHITE", "reD", "yeLLow", "PInk"
//		ArrayList<String> data5 = new ArrayList<String>();
//		data5.add("Black");
//		data5.add("WHITE");
//		data5.add("reD");
//		data5.add("yeLLow");
//		data5.add("PInk");
//		
//		data5.stream().map((n) -> n.toLowerCase()).forEach((n) -> System.out.println(n));
//		
////		6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
//
////		6. 강사님 풀이
//		
//		ArrayList<String> data6 = new ArrayList<>();
//		data6.add("Apple");
//		data6.add("banana");
//		data6.add("Melon");
//		data6.add("orange");
//		
////
////		data6.stream().filter(word -> Character.isUpperCase(word.charAt(0))) // 첫 글자가 대문자인지 확인
////		     .forEach(System.out::println);
//		
////		7. 한글을 정수로 변경 "공칠이삼" -> 0723
////		ArrayList<String> data7 = new ArrayList<String>();
//		
////		Map<String, String> map = Map.of(
////			    "공","0","일","1","이","2","삼","3","사","4",
////			    "오","5","육","6","칠","7","팔","8","구","9"
////			);
////		
////			String korean = "공칠이삼";
////			String result = Arrays.stream(korean.split(""))
////			                      .map(map::get)  // 한글 → 숫자 변환
////			                      .collect(Collectors.joining());
//
////			System.out.println(result); // 0723
//		
////		        String korean = "공칠이삼";
////
////		        String result = korean.replace("공", "0")
////		                              .replace("일", "1")
////		                              .replace("이", "2")
////		                              .replace("삼", "3")
////		                              .replace("사", "4")
////		                              .replace("오", "5")
////		                              .replace("육", "6")
////		                              .replace("칠", "7")
////		                              .replace("팔", "8")
////		                              .replace("구", "9");
////
////		        System.out.println(result); // 0723
////		    }
////	  ArrayList<String> data7 = new ArrayList<>(Arrays.asList(
////	            "공","일","이","삼","사","오","육","칠","팔","구"
////	        ));
////
////	        String korean = "공칠이삼";
////
////	        // 문자열를 인덱스로 변환
////	        String result7 = Arrays.stream(korean.split("")).map(ch -> String.valueOf(data7.indexOf(ch)))
////	        		.collect(Collectors.joining());
////
////	        System.out.println(result7); // 0723
//		
//		String hangle = "공일이삼사오육칠팔구";
//		String input = "일공이사";
//		
//		
//		// 7. 강사님 풀이
//		
//		
////      8. 정수를 한글로 변경 0723 -> "공칠이삼"
//	        
//	        // 숫자 문자열
//	        String number = "0723";
//
//	        // 숫자를 인덱스로 사용해 한글로 변환
//	        String result8 = Arrays.stream(number.split(""))
//	                               .map(ch -> data7.get(Integer.parseInt(ch))).collect(Collectors.joining());
//
//	        System.out.println(result8); // 공칠이삼
//	        
	        
	        
	        
	}
}
