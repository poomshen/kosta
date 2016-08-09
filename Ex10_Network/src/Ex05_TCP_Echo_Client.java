import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex05_TCP_Echo_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.161", 9999);
		System.out.println("������ ���� �Ǿ����ϴ�.");
		
		//server ���� �޽��� read
		DataInputStream  dis = new DataInputStream(socket.getInputStream());
		
		
		//server ���� �޽��� write
		DataOutputStream  dos = new DataOutputStream(socket.getOutputStream());
		
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("������ ������ �޽��� �Է� :");
			String  msg = sc.nextLine();
			//������ ����
			dos.writeUTF(msg);
			dos.flush();
			
			if(msg.equals("exit"))break;
			
			//�������� ���۵� �޽��� read 
		    String rmsg  = dis.readUTF();
		    System.out.println("Echo �޽��� : "+ rmsg );
		}
		System.out.println("Ŭ���̾�Ʈ ����");
		dis.close();
		dos.close();
		socket.close();
	}
}