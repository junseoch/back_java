package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileTaskPractice {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		
//		운동 1개당 1줄씩 사용
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sport.txt", true));
		String[] sports = {"축구", "야구", "아이스하키", "농구"};
	      
		Arrays.asList(sports).stream().forEach((sport) -> {
			try {
				bufferedWriter.write(sport + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		bufferedWriter.close();
		
//		가져와서 콘솔에 출력하기
		BufferedReader bufferedReader = new BufferedReader(new FileReader("sport.txt"));
		
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		
		
//		아이스하키 -> 테니스로 수정
		
		
	}
}
