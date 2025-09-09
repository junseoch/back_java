package chatPractice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		// 서버 소켓
		ServerSocket serverSocket = null;
		
		// 클라이언트 소켓
		Socket socket = null;
		
		BufferedReader reader = null;
		String message = null;
		
		try {
			serverSocket = new ServerSocket(1200);
			System.out.println("서버가 시작되었습니다, 클라이언트를 기다리는 중..");
			
			// 서버에 요청이 들어오면 수락
			socket = serverSocket.accept();
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			message = reader.readLine();
			System.out.println("클라이언트로부터 받은 메세지");
			System.out.println(message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
