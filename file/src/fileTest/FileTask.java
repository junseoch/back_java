package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
//		음식 4개 작성 -> foods.txt
//		음식 1개당 1줄씩 사용
		
		String[] foods = {"리조또", "봉골레파스타", "피자", "스테이크"};
//		덮어쓰기 여부
		BufferedWriter bw = new BufferedWriter(new FileWriter("foods.txt", true));
		
		for(int i = 0; i < foods.length; i++) {
			bw.write(foods[i] + "\n");
		}
		
//		for(Food food : foods) {
//			bw.write(foods[i] + "\n");
//		}
		
		
		
//		값 수정
//		봉골레 파스타 -> 알리오올리오 파스타로 변경
		
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("foods.txt", false ));
		
//		for(int i = 0; i < foods.length; i++) {
//			bw2.write(foods[i] + "\n");
//		}
		
		bw2.write(foods[1] + "알리오올리오 파스타");
		
		BufferedReader br = new BufferedReader(new FileReader("foods.txt"));
//		br.read();
		
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		// 닫기 필수
		br.close();
	}
}
