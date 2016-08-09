import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP Client
//socket ��ü
//�⺻ ���� : ����  Ip ,port

public class Ex03_TCP_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.161", 9999);
		//���� ���� �Ϸ��� ��Ʈ ��ȣ�� IP��ȣ�� �ʿ��ϴ�. �ؼ� ����
		System.out.println("������ ���� �Ǿ����ϴ�.");
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String string = dis.readUTF();
		System.out.println("�����κ��� ���� �޽��� :" + string);
		
		dis.close();
		in.close();
		socket.close();
	}
}
