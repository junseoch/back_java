package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {	
	
	public static void main(String[] args) {
		
//		서버 소켓
		ServerSocket serverSocket = null;
//		클라이언트 소켓
		Socket socket = null;
		
//		사용자의 입력 스트림을 읽기 위한 BufferedReader
		BufferedReader reader = null;
		String message = null;
		
		try {
			serverSocket = new ServerSocket(1100);
			System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");
			
			socket = serverSocket.accept(); // 서버에 요청이 들어오면 요청을 수락, accept가 bind를 해줌
			System.out.println("클라이언트가 연결되었습니다.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			message = reader.readLine();
			System.out.println("클라이언트로부터 받은 메세지");
			System.out.println(message);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 필수로 닫아줘야 함
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(reader != null) {
					reader.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
