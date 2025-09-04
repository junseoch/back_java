package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
//		.sorted() : 오름차순 정렬
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		numbers.stream().sorted().forEach(System.out::println );
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println );
		
//		.collect() : 결과를 다양한 타입으로 리턴
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		
		// 내부적으로는 업케스팅 된 것
		List<Integer> newList = numbers2
				.stream()
				.map((n) -> n * 10)
				.collect(Collectors.toCollection(ArrayList::new)); // List -> ArrayList로 바

//		문자열로 결과 타입을 변경
		String newString = numbers2
				.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(", ")); // 어떤 타입으로 바꿀 것인가
		
		System.out.println(newString);
		System.out.println(newList);
		
//		List가 부모
		
	}
}
