import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

//���� ��� : ServerSocket , Socket , Stream(I/O)(read,write) , Thread 
//���� : read , write ����
//Ŭ���̾�Ʈ : read, write ����
//Thread ��� (Read )
//Thread ��� (Write)
//Socket �ڿ� (Inner Class)
////////////////////////////////
//���� ä��

//���� 
//Ŭ_1
//Ŭ_2
//Ŭ_3

//���� read , write �۾�
//���� : socket 3��
//������ [������ socket �� ����]

public class Ex08_TCP_Multi_Server {
	HashMap<String, DataOutputStream> ClientMap ;
	ServerSocket serverSocket = null;
	Socket  socket = null;
	
	public Ex08_TCP_Multi_Server() {
		//�� Ŭ���̾�Ʈ (Socket �� ��� ��ü ����)
		ClientMap = new HashMap<String , DataOutputStream>();
	}
	
	//1.�ʱ�ȭ (���� ����)
	public void init(){
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("[������ ���� �Ǿ����ϴ�]");
			while(true){
				socket  = serverSocket.accept();//������ �Ǹ�
				System.out.println("[" +socket.getInetAddress()+"/"+socket.getPort() + "]");
				//�ڵ� �۾�
				//Ŭ���̾�Ʈ ���ӽ� ����...
				new MultiServer(socket).start();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//2.���ӵ� ��� Ŭ���̾�Ʈ���� (socket �޽��� ���� ��� �Լ�����
	public void SendAllMsg(String msg){
		Iterator<String> ClientKeySet = ClientMap.keySet().iterator();
		while(ClientKeySet.hasNext()){
			try {
				DataOutputStream clientout = ClientMap.get(ClientKeySet.next());
				clientout.writeUTF(msg);
			} catch (Exception e) {
				System.out.println("SendAllMsg"+e.getMessage());
			}
		}
	}
	
	//3.���ӵ� ��� ����Ʈ ���� 
	public String showUserList(String name){
		StringBuilder output = new StringBuilder("<<������ ���>>\r\n");
		Iterator<String> users = ClientMap.keySet().iterator();
		while(users.hasNext()){
			try {
				String key = users.next();
				if(key.equals(name)){
					key +="(*)";
				}
				output.append(key+"\r\n");
			} catch (Exception e) {
				System.out.println("showUserList"+e.getMessage());
			}
		}
		output.append("<<" +ClientMap.size() +">>"+"�� ������");
		return output.toString();
	}
	
	//4.�ӼӸ�
	public void SendToMsg(String fromname, String toname , String toMsg){
		try {
			ClientMap.get(toname).writeUTF("�ӼӸ� ("+fromname +") => "+toMsg);
			ClientMap.get(fromname).writeUTF("�ӼӸ� ("+toname +") => "+toMsg);
		} catch (Exception e) {
			System.out.println("send ToMsg" + e.getMessage());
		}
	}
	
	//Thread ���(���� Client read, write)
	class MultiServer extends  Thread{
		Socket socket =null;
		DataOutputStream out;
		DataInputStream in;
		public MultiServer(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(this.socket.getInputStream());
				out = new DataOutputStream(this.socket.getOutputStream());
			} catch (Exception e) {
				System.out.println("MultiServer"+e.getMessage());
			}
		} 
		
		@Override
		public void run() {
			String name =" ";
			try {
				out.writeUTF("�̸��� �Է��ϼ���");
				name= in.readUTF();
				out.writeUTF("���� ä�ù濡 ����");
				SendAllMsg(name +"�� ���� �Ͽ����ϴ�.");
				////////////////////////////////////////
				
				//key point(����ڸ� Map�� �ֱ�)
				ClientMap.put(name, out); // Map<"ȫ�浿" , ������ ��°�ü> 
				System.out.println("���� ����͸� : ���� ������"+ClientMap.size());
				
				//�߰� ���(��ȭ ��� )
				while(true){
					
				String msg2 = in.readUTF();
				SendAllMsg(msg2);
					if(msg2.equals("/���")){
					String namelist = showUserList(name);
					out.writeUTF(namelist);
					}else if(msg2.startsWith("/�ӼӸ�")){
						 String toname=null; String toMsg=null;
						 System.out.println(toname);
						 SendToMsg(name,toname ,toMsg);
					}
				}
				
				
			} catch (Exception e) {
			 System.out.println("run"+ e.getMessage());
			}
//			showUserList();
//			SendToMsg();
			
		}
	}
	
	public static void main(String[] args) {
		Ex08_TCP_Multi_Server sv = new Ex08_TCP_Multi_Server();
		sv.init();
	}
}