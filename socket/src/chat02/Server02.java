package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class Server02 {

	public static void main(String[] args) {
		// 서버 소켓
		ServerSocket serverSocket = null;
		// 클라이언트 소켓
		Socket socket = null;
		
		// 서버에서 클라이언트에게 내용을 써서 보낼수도 있고 읽어서 가져올 수도 있음
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			// 7777포트로 서버열기
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다. 연결 대기중...");
			
			// socket에 담아야 읽어올 수 있음
			// 클라이언트가 연결을 수락하면 socket을 통해 통신할 수 있음
			socket = serverSocket.accept();
			System.out.println("연결되었습니다");
			
			// stream을 거쳤다가 옴
			
			// 1. 클라이언트가 소켓으로 보낸 데이터를 stream통로로 가져와서
			// 2. InputStreamReader로 읽는다
			// 3. BufferedReader를 통해서 전체를 가져온다
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 서버에서 클라이언트로 
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 클라이언트에서 보낸 데이터를 읽을 때 값의 크기를 모름 -> while
			while(true) {
//				클라이언트가 보낸 데이터를 readLine()으로 다 읽어옴
				String inMessage = in.readLine();
				System.out.println("클라이언트 > " + inMessage);
				
				System.out.println("서버에서 클라이언트로 메세지 전송 >>");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) {
					socket.close();
				}
				
				if(serverSocket != null) {
					serverSocket.close();
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
