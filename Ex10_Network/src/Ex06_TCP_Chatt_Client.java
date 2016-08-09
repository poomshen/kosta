import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Ex06_TCP_Chatt_Client {
	Socket socket;
	public Ex06_TCP_Chatt_Client() {
		try{
			socket = new Socket("192.168.0.133", 9999);
			System.out.println("서버와 연결 되었습니다");
			
			new ClientSend().start();
			new ClientReceive().start();
			
		}catch(Exception e){
			System.err.println("예외 : " + e.getMessage());
		}
		
	}
		class ClientSend extends Thread {
			 @Override
			 public void run() {
				 try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					 
					 PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
					 while(true){
						String data = br.readLine();//console 에 입력한 값 read
						if(data.equals("exit"))break;
						pw.println(data);
					 }
					 System.out.println("client Send 작업 종료");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			 }
		 }
		class ClientReceive extends Thread{
				BufferedReader br2;
			 	@Override
				public void run() {
			 		InputStream in;
					try {
						br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						 String data = null;
						 while((data = br2.readLine()) != null){
							 System.out.println("server 부터 받은 메시지 :" +data);
						 }
						System.out.println("Clidnt 작업 종료");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	
	
	public static void main(String[] args) {
		Ex06_TCP_Chatt_Client client = new Ex06_TCP_Chatt_Client();
	}
}
