package chatPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Provider.Service;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			serverSocket = new ServerSocket(4444);
			System.out.println("서버가 시작됨, 클라 연결 대기중");
			
			socket = serverSocket.accept();
			System.out.println("연결되었습니다");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				
				String inMessage = in.readLine();
				System.out.println("클라이언트의 데이터 > " + inMessage);
				
				String outMessString = sc.nextLine();
				out.write(outMessString + "\n");
				out.flush();
			}
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
				if(serverSocket != null) {
					serverSocket.close();
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
