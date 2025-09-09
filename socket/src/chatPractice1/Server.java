package chatPractice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
	
		Socket socket = null;
		ServerSocket serverSocket = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Scanner sc = new Scanner(System.in);
		
		// 2222포트로 서버열기
		// 서버 시작됨, 클라이언트의 연결 대기함
		try {
			serverSocket = new ServerSocket(2222);
			System.out.println("서버가 시작되었습니다. 클라이언트의 연결을 대기중입니다");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				
				String inMessage = null;
				String outMessage = null;
				
				inMessage = in.readLine();
				System.out.println("클라이언트가 보낸 데이터 > " + inMessage);
				
				System.out.println("서버에서 클라이언트에게 보내는 데이터 >");
				outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {  // 위에 코드와 상관없이 무조건 실행
			
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
