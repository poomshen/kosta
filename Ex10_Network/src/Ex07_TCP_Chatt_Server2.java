import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex07_TCP_Chatt_Server2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			ServerSocket  serverSocket = new ServerSocket(9999);
			 Socket socket = serverSocket.accept();
			 System.out.println("�ý��� ����");
			 
			 class ServerSend extends Thread {
				 DataOutputStream dos;
				 @Override
				public void run() {
					try {
						dos = new DataOutputStream(socket.getOutputStream());
							while(true){
								System.out.print("������ ������ �޽��� �Է� :");
								String  msg = sc.nextLine();
								//������ ����
								dos.writeUTF(msg);
								dos.flush();
								
								if(msg.equals("exit"))break;
							}
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				 }
			 }
		
			 class ServerReceive extends Thread{
				 
//				DataInputStream dis = new DataInputStream(socket.getInputStream());
				
			 }
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}