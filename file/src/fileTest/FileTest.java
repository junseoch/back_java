package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	컴파일러한테 에러를 날림
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
//		new FileWriter("경로", "이어쓰기 여부"); // 이어 쓸건지 덮어쓸건지

		 try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
			bufferedWriter.write("수정 내용\n");
			bufferedWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
		
//		while문 : 파일의 내용이 어느정도일지 모름
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		
		bufferedReader.close();
	}
}
