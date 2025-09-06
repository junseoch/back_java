package streamTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2Answer {
   public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//         - 1. Arrays.asList() 초기값으로 넣는 방법
	   
	   ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//			  stream intStream
	   datas1.stream().mapToInt(Integer::intValue).sum();
	   
	   
	   
//      ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//      datas1.stream().mapToInt(Integer::intValue).sum();
	   	
      
//         - 2. IntStream
//      IntStream
      int total = IntStream
         .rangeClosed(1, 6) // IntStream
         .map(n -> n * 10) // IntStream
         .mapToObj(Integer::valueOf) // Stream<Integer>
         .collect(Collectors.toCollection(ArrayList::new)) // ArrayList<Integer>
         .stream() // Stream<Integer>
         .mapToInt(Integer::intValue) // IntStream
         .sum(); // int
      
      
      // 1부터 100까지 홀수만 ArrayList 담아서 출력
      ArrayList<Integer> data = new ArrayList<Integer>();
      
      IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 1).forEach((n) -> data.add(n));
      System.out.println(data);
      
      
//      Stream<T>
//      .mapToObj(): IntStream -> Stream<T>
//      .mapToInt(): Stream<T> -> IntStream
//      .mapToInt(Boolean::booleanValue): Boolean -> boolean
//      .mapToLong(Long::longValue): Long -> long
//      .mapToDouble(Double::doubleValue): Double -> double
      
      
   }
}
