import java.net.Socket;

public class Ex07_TCP_Chatt_Client_DataStream {
	public static void main(String[] args) { 
		Socket socket = null;
		try{
			socket = new Socket("192.168.0.126",9999);
			System.out.println("서버와 연결 되었습니다");
			
			//Ex07_TCP_Chatt_Server_DataStream 가지고 있는 Sender , Receiver 클래스 재사용
			 Sender sen = new Sender(socket);
			 Receiver rec = new Receiver(socket);
			 
			 sen.start();
			 rec.start();
		}catch(Exception e){
			System.out.println("예외 " + e.getMessage());
		}
 
	}
 
}
