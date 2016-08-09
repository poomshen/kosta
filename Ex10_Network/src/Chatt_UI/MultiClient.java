package Chatt_UI;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class MultiClient {
	
	Socket socket = null;
	DataInputStream in;
	DataOutputStream out;
	Scanner s = null;
	Thread readUnit = new Thread(new Runnable(){
		@Override
		public void run(){
			while (in != null) {
				try {
					String msg = in.readUTF();
					System.out.println(msg);
					if(msg.equals("�̸��� �Է��ϼ���")){
						view.openScreen(1);
					} else if(msg.startsWith("<<������ ���>>")){
						view.userListUpdate(msg);
					} else{
						if(msg.equals("���� ä�ù濡 ����") || (!msg.startsWith("[") && msg.endsWith("���� �����Ͽ����ϴ�"))){
							showUserList();
						}
						view.msgWindowUpdate(msg);
					}  
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	
	Thread writeUnit = new Thread(new Runnable(){
		@Override
		public void run(){
			while (out != null) {
				try {
					String msg = s.nextLine();
					out.writeUTF(msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	
	ClientUI view = null;
	public MultiClient(ClientUI view)
	{
		this.view = view;
	}
	/**
	 * �ʱ�ȭ
	 */
	void init(String args[]){
		String IP = "127.0.0.1"; //default : localhost
		int PORT = 9999;
		if(args.length==2){
			IP = args[0];
			PORT = Integer.parseInt(args[1]);
		}
		
		try {
			socket = new Socket(IP, PORT); //UnknownHostException, IOException
			System.out.println("[������ �����մϴ�]");
			// �Է� Stream , ��� Stream
			in = new DataInputStream(this.socket.getInputStream());
			out = new DataOutputStream(this.socket.getOutputStream());
			s = new Scanner(System.in);
			
			readUnit.start();
			writeUnit.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void connect(String ip, String port){
		boolean result = false;
		int PORT = Integer.parseInt(port);
		try {
			socket = new Socket(ip, PORT); //UnknownHostException, IOException
			System.out.println("[������ �����մϴ�]");
			// �Է� Stream , ��� Stream
			in = new DataInputStream(this.socket.getInputStream());
			out = new DataOutputStream(this.socket.getOutputStream());
			s = new Scanner(System.in);
			
			readUnit.start();
			writeUnit.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	/**
	 * �ӼӸ�
	 * @param to �ӼӸ� ���� ���� �̸�
	 * @param msg �ӼӸ� �޽���
	 */
	public void whisper(String to, String msg){
		send("/�ӼӸ� " + to + " " + msg);
	}
	
	/**
	 * ������ ���
	 */
	public void showUserList()
	{
		send("/������");
	}
	
	public void send(String msg){
		try {
			out.writeUTF(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
