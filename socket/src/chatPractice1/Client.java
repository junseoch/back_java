package chatPractice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		Socket socket = null;

		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		// 서버 열어야 함
		try {
			socket = new Socket("localhost", 2222);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				// 클라에서 서버로 데이터 보내기
				
				String outMessage = null;
				String inMessage = null;
				
				outMessage = sc.nextLine();
				System.out.println("클라에서 서버로 데이터 보낼 데이터 >" + outMessage);
				out.write(outMessage);
				out.flush();
				
				inMessage = in.readLine();
				System.out.println("서버에서 클라로 보낸 데이터 > " + inMessage);
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) {
					sc.close();
				}
				
				if(socket != null) {
					socket.close();
				}
				
				if(in != null) {
					in.close();
				}
				
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
