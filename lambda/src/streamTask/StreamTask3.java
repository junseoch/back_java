package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	
	// 메서드 만들어서 해보기
	public boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	public int mutipleBy10(int num) {
		return num * 10;
	}

	public static void main(String[] args) {
		
//		IntStream 으로 시작
//		10, 30, 50, 70, 90만 ArrayList 또는 List에 추가하기
//																		10   20  30  40   50	
		ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 30, 50, 70, 90));
		
		// 메서드 사용하기 위해 객체화 함
		StreamTask3  st = new StreamTask3();
		
		IntStream.rangeClosed(1, 9)
		.filter((n) -> n % 2 == 1)
		.map(n -> n * 10)
		.mapToObj(Integer::valueOf)
		.collect(Collectors.toCollection(ArrayList::new));
		
		List<Integer> datas = IntStream
		.rangeClosed(1, 9) // IntStream
		.filter(st::isOdd) // IntStream
		.map(st::mutipleBy10) // IntStream
		.boxed() // Stream<Integer>
		.collect(Collectors.toList()); // List<Integer>
		
		
//		forEach((n) -> System.out.println(n));
		
//		 mapToObj  : IntStream() -> stream() 
		
	}
	
}
