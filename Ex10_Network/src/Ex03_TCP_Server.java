import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP ���
//192.168.0.161
//port : 9999;
public class Ex03_TCP_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket  serverSocket = new ServerSocket(9999);
		String str = "��ö�� ��� ���ո� ";
		System.out.println("��������  :" + serverSocket.getInetAddress());
		System.out.println("���� ���� ����� ....");
		
		Socket socket = serverSocket.accept(); //2�� (������ , ���� socket ����)
		//�̷��� ������ Ŭ���̾� Ʈ ���� ��
		
		//���� -> Ŭ���̾�Ʈ ���� (write)
		//socket �� socket//////////////////////////////////////////////////////
		OutputStream out= socket.getOutputStream();
		DataOutputStream dos  = new DataOutputStream(out);
		dos.writeUTF(str);
		//////////////////////////////////////////////////////////////////////
		System.out.println("��������");
		
		dos.close();
		out.close();
		socket.close();
		serverSocket.close();
	}
}