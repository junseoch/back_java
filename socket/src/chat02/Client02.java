package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) {
		
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
//		 주최자인 '나'
//		"localhost"
		
		try {
//			내 IP, 7777포트로 클라이언트 서버를 열겠다
			socket = new Socket("localhost", 7777); // 내 IP, 7777포트
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 클라이언트에서 서버로 보내거나 받을 데이터의 크기를 모르기 때문에 while문
			while(true) {
				
				System.out.println("클라이언트에서 서버로 데이터 보내기 >>");
				String outMessage = sc.nextLine();
				
//				outMessage : 클라이언트에서 서버로 보낼 메세지
				out.write(outMessage + "\n");
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버 >>" + inMessage);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) {
					socket.close();
				}
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
				if(sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
