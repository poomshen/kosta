import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP 통신
//192.168.0.161
//port : 9999;
public class Ex03_TCP_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket  serverSocket = new ServerSocket(9999);
		String str = "명철이 언니 세균맨 ";
		System.out.println("서버정보  :" + serverSocket.getInetAddress());
		System.out.println("서버 접속 대기중 ....");
		
		Socket socket = serverSocket.accept(); //2번 (응답대기 , 연결 socket 생성)
		//이러면 서버와 클라이언 트 연결 됨
		
		//서버 -> 클라이언트 에게 (write)
		//socket 과 socket//////////////////////////////////////////////////////
		OutputStream out= socket.getOutputStream();
		DataOutputStream dos  = new DataOutputStream(out);
		dos.writeUTF(str);
		//////////////////////////////////////////////////////////////////////
		System.out.println("서버종료");
		
		dos.close();
		out.close();
		socket.close();
		serverSocket.close();
	}
}
