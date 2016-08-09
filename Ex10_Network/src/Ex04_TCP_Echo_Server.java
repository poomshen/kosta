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
		System.out.println("클라이언트 접속 대기중 ");
		//접속 잡아줌
		Socket socket =  serverSocket.accept();
		
		
		//클라이언  socket 과 (read , write)
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		//Client message write 준비
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		while(true){
			//Client read
			String clientmsg = dis.readUTF();
			System.out.println("Client Msg :" + clientmsg);
			
			//Client write (같은 내용을 Write)
			if(clientmsg.equals("exit")) break;
			
			dos.writeUTF(clientmsg);
			dos.flush();
		}
		System.out.println("클라이언트 서버  종료");
		dis.close();
		dos.close();
		socket.close();
	}
}
