import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//TCP Client
//socket 객체
//기본 정보 : 서버  Ip ,port

public class Ex03_TCP_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.161", 9999);
		//서버 연결 하려면 포트 번호와 IP번호가 필요하다. 해서 소켓
		System.out.println("서버와 연결 되었습니다.");
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String string = dis.readUTF();
		System.out.println("서버로부터 받은 메시지 :" + string);
		
		dis.close();
		in.close();
		socket.close();
	}
}
