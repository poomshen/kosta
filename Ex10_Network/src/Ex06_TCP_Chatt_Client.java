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
			System.out.println("������ ���� �Ǿ����ϴ�");
			
			new ClientSend().start();
			new ClientReceive().start();
			
		}catch(Exception e){
			System.err.println("���� : " + e.getMessage());
		}
		
	}
		class ClientSend extends Thread {
			 @Override
			 public void run() {
				 try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					 
					 PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
					 while(true){
						String data = br.readLine();//console �� �Է��� �� read
						if(data.equals("exit"))break;
						pw.println(data);
					 }
					 System.out.println("client Send �۾� ����");
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
							 System.out.println("server ���� ���� �޽��� :" +data);
						 }
						System.out.println("Clidnt �۾� ����");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	
	
	public static void main(String[] args) {
		Ex06_TCP_Chatt_Client client = new Ex06_TCP_Chatt_Client();
	}
}
