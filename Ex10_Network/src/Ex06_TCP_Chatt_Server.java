import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//서버: 클라이언트 간에 1:1 통신
//서버 : read/ write 구현
//클라이언트 : read / write 구현
//Ex01 ~ Ex05  까지 read,Write (순차적으로 처리)
//동시에 read/ Write 작업 이루어 졌으면 ...
//Thread 사용
//Client : read (Thread) , Write (Thread) 
//Server : read (Thread) , Write (Thread) 

public class Ex06_TCP_Chatt_Server {
	
	public static void main(String[] args) {
		ServerSocket serverSocket =null;
		
		
		try {
		 serverSocket =	new ServerSocket(9999);
		 System.out.println("클라이언트 접속 대기중...");
		 Socket socket= serverSocket.accept();
		 System.out.println("클라이언트 접속 완료...");
		 //socket.getoutputString
		 class ServerSend extends Thread {
			 @Override
			 public void run() {
				 try {
					///Console 에서 입력한  값을 read
					 //DataOutputStream
					 
					 //Scanner 대신
					 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					 
					 PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
					 while(true){
						String data = br.readLine();//console 에 입력한 값 read
						if(data.equals("exit"))break;
						pw.println(data);
					 }
					 System.out.println("Server Send 작업 종료");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			 }
		 }
		 //socket.getInputStrem
		 class ServerReceive extends Thread{
				BufferedReader br2;
			 	@Override
				public void run() {
			 		InputStream in;
					try {
						br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						 String data = null;
						 while((data = br2.readLine()) != null){
							 System.out.println("Client 부터 받은 메시지 :" +data);
						 }
						System.out.println("ServerReceive 작업 종료");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		 //기존
		 //inputStream , outPutStream 을 socket 으로 부터 얻기
		 ServerSend sd = new ServerSend();
		 ServerReceive sr = new ServerReceive();
		 sd.start();
		 sr.start();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
//class ServerSend extends Thread{
//	Socket socket;
//	public ServerSend(Socket socket) {
//		this.socket = socket;
//	}
//	
//	@Override
//	public void run() {
//		
//	}
//}

//class ServerReceive extends Thread{
//	@Override
//	public void run() {
//		
//	}
//}