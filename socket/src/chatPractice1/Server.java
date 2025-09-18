//package chatPractice1;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class Server {	


//  클라는 쓰는 것 부터, 서버는 받는 것 부터    



//
//	public static void main(String[] args) {
//	
//		Socket socket = null;
//		ServerSocket serverSocket = null;
//
//		BufferedReader in = null;
//		BufferedWriter out = null;
//		
//		Scanner sc = new Scanner(System.in);
//
//		
//		try {
//			serverSocket = new ServerSocket(6666);
//			System.out.println("서버가 시작되었습니다. 연결 대기중...");
//
//			socket = new ServerSocket().accept();
//			System.out.println("연결되었습니다");
//			
//			
//			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//					
//			while(true) {
//				
//				String inMessage = in.readLine();
//				System.out.println("클라이언트가 보낸 메세지 > ");
//				
//				System.out.println("서버에서 클라이언트로 메세지 전송");
//				String outMessage = sc.nextLine();
//				out.write(outMessage);
//				out.flush();
//				
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(socket != null) {
//					socket.close();
//				}
//				
//				if(serverSocket != null) {
//					serverSocket.close();
//				}
//				
//				if(in != null) {
//					in.close();
//				}
//				
//				if(out != null) {
//					out.close();
//				}
//				if(sc != null) {
//					sc.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
//	




//}
