package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePractice {

	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
//		try {
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Practice.txt", true));
//			bufferedWriter.write("bufferedWriter 내용 추가");
//			bufferedWriter.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		파일 읽어오기
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("Practice.txt"));
		bufferedReader.readLine();
		
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
	}
	
}
