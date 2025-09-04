package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MapTask1 {
//  아래의 4개의 URL을 List에 담은 후 모든 경로 앞에 /app을 붙여서 출력하기
//  /news, /game, /brand, /rank
	
	public String addRobot(String data) {
		return "/app" + data;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("/news, /game, /brand, /rank"));
		
//		datas.add("/news");
//		datas.add("/game");
//		datas.add("/brand");
//		datas.add("/rank");
		
		System.out.println(datas);
		
		MapTask1 mt = new MapTask1();
		datas.stream().map((n) -> "/app,"+ n).forEach((n) -> {System.out.println(n);});
//		                 map(mt::addRobot)
	}
}
