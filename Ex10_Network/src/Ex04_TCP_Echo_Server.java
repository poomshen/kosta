import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_TCP_Echo_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket  serverSocket = new ServerSocket(9999);
		System.out.println("Ŭ���̾�Ʈ ���� ����� ");
		//���� �����
		Socket socket =  serverSocket.accept();
		
		
		//Ŭ���̾�  socket �� (read , write)
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		//Client message write �غ�
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		while(true){
			//Client read
			String clientmsg = dis.readUTF();
			System.out.println("Client Msg :" + clientmsg);
			
			//Client write (���� ������ Write)
			if(clientmsg.equals("exit")) break;
			
			dos.writeUTF(clientmsg);
			dos.flush();
		}
		System.out.println("Ŭ���̾�Ʈ ����  ����");
		dis.close();
		dos.close();
		socket.close();
	}
}
