import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//����: Ŭ���̾�Ʈ ���� 1:1 ���
//���� : read/ write ����
//Ŭ���̾�Ʈ : read / write ����
//Ex01 ~ Ex05  ���� read,Write (���������� ó��)
//���ÿ� read/ Write �۾� �̷�� ������ ...
//Thread ���
//Client : read (Thread) , Write (Thread) 
//Server : read (Thread) , Write (Thread) 

public class Ex06_TCP_Chatt_Server {
	
	public static void main(String[] args) {
		ServerSocket serverSocket =null;
		
		
		try {
		 serverSocket =	new ServerSocket(9999);
		 System.out.println("Ŭ���̾�Ʈ ���� �����...");
		 Socket socket= serverSocket.accept();
		 System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�...");
		 //socket.getoutputString
		 class ServerSend extends Thread {
			 @Override
			 public void run() {
				 try {
					///Console ���� �Է���  ���� read
					 //DataOutputStream
					 
					 //Scanner ���
					 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					 
					 PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
					 while(true){
						String data = br.readLine();//console �� �Է��� �� read
						if(data.equals("exit"))break;
						pw.println(data);
					 }
					 System.out.println("Server Send �۾� ����");
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
							 System.out.println("Client ���� ���� �޽��� :" +data);
						 }
						System.out.println("ServerReceive �۾� ����");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		 //����
		 //inputStream , outPutStream �� socket ���� ���� ���
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