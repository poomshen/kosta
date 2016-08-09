//Thread ���� ����
//Thread �Լ� Ȱ��
//sleep () , 
// join () <--�� ���� �� ���ٰ� ��
// Main , th, th2 
// ������ ����� �������� ������� ����� ������  
//��� ����� ��� �����Ͽ� �������� ��� 
//join �Լ� ���

class Thread_Join extends Thread{
	@Override
	public void run() {
		for(int i= 0 ; i<3000 ; i++){
			System.out.println("=-----=");
		}
	}
}
class Thread_Join2 extends Thread{
	@Override
	public void run() {
		for(int i= 0 ; i<3000 ; i++){
			System.out.println("************");
		}
	}
}

public class Ex08_Thread_State {
	
	public static void main(String[] args) {
		Thread_Join th = new Thread_Join();
		Thread_Join2 th2 = new Thread_Join2();
		
		th.start();
		th2.start();
		
		long starttime = System.currentTimeMillis();
		try {
			//main Thread �� ��û (join)
			//main �� ��޲��� ���� ������ �� ����.
			th.join();
			th2.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for(int i = 0; i<3000 ; i++){
			System.out.println("&&&&&&&&&");
		}
		System.out.println("3���� �����尡 �ɸ� �� �ð� :");
		System.out.println(System.currentTimeMillis() -starttime);
		System.out.println("Main END");
	}
}