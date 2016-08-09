import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex07_TCP_Chatt_Server_DataStream {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try{
			serversocket = new ServerSocket(9999);
			System.out.println("Server Started ....");
			socket =  serversocket.accept();
			System.out.println("[" + socket.getInetAddress() + "]" +"입장");
			
			Sender sen = new Sender(socket);
			Receiver rec = new Receiver(socket);
			
			sen.start();
			rec.start();
			
		}catch(Exception e){
			System.out.println("실행 예외 :" + e.getMessage());
		}
	}

}
class Sender extends Thread{
	
	Socket socket;
	DataOutputStream out;
	String name;
	
	//생성자
	public Sender(Socket socket){
		this.socket = socket;
		try{
			out = new DataOutputStream(socket.getOutputStream());
			name = "**" + socket.getInetAddress() + ":" + socket.getPort()+"**";
		}catch(Exception e){
			System.out.println("Sender  예외: " +e.getMessage() );
		}
	}
	
	public void run(){
		Scanner s = new Scanner(System.in);
		while(out != null){
			try{
					out.writeUTF(name + " " + s.nextLine());
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
class Receiver extends Thread{
	Socket socket;
	DataInputStream in;
	
	//생성자
	public Receiver(Socket socket){
		this.socket = socket;
		try{
			in = new DataInputStream(socket.getInputStream());
		}catch(Exception e){
			System.out.println("Receiver 예외 :" + e.getMessage());
		}
	}
	
	public void run(){
		String msg = "";
		try{
			while((msg=in.readUTF()) != null){
				System.out.println(msg);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
