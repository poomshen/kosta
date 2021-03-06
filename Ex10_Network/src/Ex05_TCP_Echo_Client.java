import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex05_TCP_Echo_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.161", 9999);
		System.out.println("서버와 연결 되었습니다.");
		
		//server 보낸 메시지 read
		DataInputStream  dis = new DataInputStream(socket.getInputStream());
		
		
		//server 에게 메시지 write
		DataOutputStream  dos = new DataOutputStream(socket.getOutputStream());
		
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("서버에 전송할 메시지 입력 :");
			String  msg = sc.nextLine();
			//서버에 전송
			dos.writeUTF(msg);
			dos.flush();
			
			if(msg.equals("exit"))break;
			
			//서버에서 전송된 메시지 read 
		    String rmsg  = dis.readUTF();
		    System.out.println("Echo 메시지 : "+ rmsg );
		}
		System.out.println("클라이언트 종료");
		dis.close();
		dos.close();
		socket.close();
	}
}
