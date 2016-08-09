//����ȭ (Multi Thread)
//Thread (���ÿ� : �����ڿ� )
//ȭ��� (���� ) >�����ġ (ȭ��ǿ��� ���� ��״� �� lock)

//����ȭ�� ������ �ִ� ��ġ 
class Wroom {
	public synchronized void OpenDoor(String name){
//		public  void OpenDoor(String name){
		System.out.println(name  + "�� ȭ��� ���� ^^");
		for(int i = 0 ; i<10000 ; i++){
			if(i == 1000){
				System.out.println(name + "��  �� !");
			}
		}
		System.out.println(name + "�� �ÿ��Ͻ��� ..");
	}
}

class Users extends Thread{
	private  Wroom  wr ;
	private String who;
	
	public Users(String  name , Wroom wr) {
		this.who = name;
		this.wr = wr;
	}
	
	@Override
	public void run() {
		wr.OpenDoor(this.who);
	}
}
 
public class Ex09_Sysnc_Thread {
	public static void main(String[] args) {
		
		//�Ѱ� ��ġ
		Wroom w = new Wroom();
		Users  kin = new Users("�达", w);
		Users  park = new Users("�ھ�", w);
		Users  lee = new Users("�̾�", w);
		Users  houn = new Users("ȫ��", w);
		
		kin.start();
		park.start();
		lee.start();
		houn.start();
	}
}
