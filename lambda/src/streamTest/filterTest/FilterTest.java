package streamTest.filterTest;

import java.util.List;
import java.util.stream.IntStream;

public class FilterTest {
	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).forEach(System.out::println);
		
		// 배열을 만들 때
		List<Integer> numbers = IntStream.rangeClosed(1, 10)
				.filter((n) -> n % 2 == 0 )
				.collect(null, null, null);
				
	}
}
