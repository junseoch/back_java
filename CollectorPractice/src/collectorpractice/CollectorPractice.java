package collectorpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorPractice {

	public static void main(String[] args) {
		
//		1 ~ 10중에 1부터 5까지만 배열에 ArrayList에 담아라
		
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		
		datas1 = IntStream.rangeClosed(1, 10)
		.filter(n -> n < 6)
		.mapToObj(Integer::valueOf)
		.collect(Collectors.toCollection(ArrayList::new));
		
//		System.out.println(datas1);
		
//		2. 이름 리스트에서 길이가 3 이상인 이름만 필터링해 출력하라
//		["Kim", "Lee", "Song", "Choi", "Na"]

		ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("Kim", "Lee", "Song", "Choi", "Na"));
		
		datas2.stream().filter(n -> n.length() >= 3).collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(datas2);
		
//		Kim
//		Park
//		Choi
		
	}
	
}
