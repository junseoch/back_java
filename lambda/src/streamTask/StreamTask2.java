package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;


public class StreamTask2 {

	static int sum;
	
	public static void main(String[] args) {
		
//		data5.stream().map((n) -> n.toLowerCase()).forEach((n) -> System.out.println(n));
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		
//		1. as.List() 초기값으로 넣는 방법
		// 초기값을 알고 있어야 함
		// forEach가 안 되면 for문
		Integer total;
//		for(total)
		
//		2. IntStream
		
		
		ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60));
		
//		datas1.add(10);
//		datas1.add(20);
//		datas1.add(30);
//		datas1.add(40);
//		datas1.add(50);
//		datas1.add(60);
		
		System.out.println(datas1);
		datas1.stream().forEach((data) -> sum += data);
		
		System.out.println(sum);
		
//		IntStream
//		수학과 관련된 메서드 있음
		IntStream.rangeClosed(1, 6).map(n -> n * 10).forEach(datas1::add);
		datas1.stream().mapToInt(Integer::intValue).sum();
		
		// mapToObj  : IntStream() -> stream() 
		// mapToObj(Integer::valueOf)
		
		
//		Stream<T>
//		수학과 관련된 메서드가 없음
		datas1.stream().map(null);
//		mapToLong(Long::longValue); Long -> long
//		mapToLong(Double::doubleValue); Double -> double
//		mapToInt , mapToDouble  :  stream() -> IntStream()
		
		
		
	}
	
}
