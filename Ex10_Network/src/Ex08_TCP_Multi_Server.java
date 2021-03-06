import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

//사용된 기술 : ServerSocket , Socket , Stream(I/O)(read,write) , Thread 
//서버 : read , write 동시
//클라이언트 : read, write 동시
//Thread 사용 (Read )
//Thread 사용 (Write)
//Socket 자원 (Inner Class)
////////////////////////////////
//다중 채팅

//서버 
//클_1
//클_2
//클_3

//각가 read , write 작업
//서버 : socket 3개
//서버가 [생성된 socket 를 관리]

public class Ex08_TCP_Multi_Server {
	HashMap<String, DataOutputStream> ClientMap ;
	ServerSocket serverSocket = null;
	Socket  socket = null;
	
	public Ex08_TCP_Multi_Server() {
		//각 클라이언트 (Socket 의 출력 객체 관리)
		ClientMap = new HashMap<String , DataOutputStream>();
	}
	
	//1.초기화 (서버 소켓)
	public void init(){
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("[서버가 실행 되었습니다]");
			while(true){
				socket  = serverSocket.accept();//접속이 되면
				System.out.println("[" +socket.getInetAddress()+"/"+socket.getPort() + "]");
				//코드 작업
				//클라이언트 접속시 마다...
				new MultiServer(socket).start();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//2.접속된 모든 클라이언트에게 (socket 메시지 전달 기능 함수구현
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
	
	//3.접속된 목록 리스트 관리 
	public String showUserList(String name){
		StringBuilder output = new StringBuilder("<<접속자 목록>>\r\n");
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
		output.append("<<" +ClientMap.size() +">>"+"명 접속중");
		return output.toString();
	}
	
	//4.귓속말
	public void SendToMsg(String fromname, String toname , String toMsg){
		try {
			ClientMap.get(toname).writeUTF("귓속말 ("+fromname +") => "+toMsg);
			ClientMap.get(fromname).writeUTF("귓속말 ("+toname +") => "+toMsg);
		} catch (Exception e) {
			System.out.println("send ToMsg" + e.getMessage());
		}
	}
	
	//Thread 사용(접속 Client read, write)
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
				out.writeUTF("이름을 입력하세요");
				name= in.readUTF();
				out.writeUTF("현재 채팅방에 입장");
				SendAllMsg(name +"님 입장 하였습니다.");
				////////////////////////////////////////
				
				//key point(사용자를 Map에 넣기)
				ClientMap.put(name, out); // Map<"홍길동" , 데이터 출력객체> 
				System.out.println("서버 모니터링 : 현재 접속자"+ClientMap.size());
				
				//추가 기능(대화 기능 )
				while(true){
					
				String msg2 = in.readUTF();
				SendAllMsg(msg2);
					if(msg2.equals("/목록")){
					String namelist = showUserList(name);
					out.writeUTF(namelist);
					}else if(msg2.startsWith("/귓속말")){
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
