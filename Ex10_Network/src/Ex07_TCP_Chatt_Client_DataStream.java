import java.net.Socket;

public class Ex07_TCP_Chatt_Client_DataStream {
	public static void main(String[] args) { 
		Socket socket = null;
		try{
			socket = new Socket("192.168.0.126",9999);
			System.out.println("������ ���� �Ǿ����ϴ�");
			
			//Ex07_TCP_Chatt_Server_DataStream ������ �ִ� Sender , Receiver Ŭ���� ����
			 Sender sen = new Sender(socket);
			 Receiver rec = new Receiver(socket);
			 
			 sen.start();
			 rec.start();
		}catch(Exception e){
			System.out.println("���� " + e.getMessage());
		}
 
	}
 
}
