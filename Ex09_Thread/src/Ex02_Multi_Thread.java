/*
	1.���α׷� ���� ������ : -> exe ����  -> ���μ���(������)
	2.���μ��� (method ���� ����) -> �ּ� �ϳ� �̻��� Thread ������ �ִ�.
	3.Thread  : ���μ������� �ϳ����ּ� ���� ���� => �Լ�(method)
	4.Thread ������ ���
	5.����� ���
		�ΰ���
		- Thread Ŭ������ ��� : class Test extends Thead ��� 
		class Test extends Thread{
	
		}
		** �ݵ�� Thread ������ run() �Լ� ������ (����) **
		
		- runnable ���� ���̽��� ����  : ( run()�Լ� ���� ���� )
		class Test implements Runnable{
	
		}
		
	�ΰ����� �� ���� �������̽��� �ٸ� �ڿ��� ��� ���� �� �ְ� ���� �ٸ� �ڿ� ����� ���� ������ ����� �ض� 
	
	//java Ư¡
	-���� ��� ��Ģ
	-Thread ����ϸ� �ٸ� Ŭ���� ��� ...
	-�������̽��� ���ؼ� ����ϸ� �ٸ� Ŭ������ ��� ����
	-Ȯ�强
	-class T extends person implements Runnable{}

*/
//Thread �����ϱ� (��� )
class Thread_1  extends Thread {

	@Override
	public void run() {
		for(int i = 0 ; i<100 ; i++){
			System.out.println("Thread"+ i + this.getName()  );
		}
		System.out.println("Thread run End");
	}
	
}

class Thread_2 implements Runnable{

	@Override
	public void run() {
		for(int i =0 ; i<100 ;i++){
			System.out.println("runable"+i);
		}
		System.out.println("runnble run() END");
	}
	
	
}
//run() �Լ��� �ٸ� Stack main �Լ��� ���� ���� �� ���ش�
public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		Thread_1 t = new Thread_1();
		t.start();//���ο� ������ �޸𸮸� ����� �� ���λ����� ���ÿ� run() �Լ��� �ø��� �۾�����
		
		//Runnable �������̽��� ������ ���
		//������ Thread �����ؼ� runnable ������ ��ü ������ �Ѱ� �־�� �Ѵ�.
//		Thread_2 thread_2 =new Thread_2();
//		Thread t2 = new Thread(thread_2);
		Thread t2 = new Thread(new Thread_2());
		t2.start();   //start() -> stack memory ���� > ������  stack > run()
		
		for(int i =0 ;i<100; i++){
			System.out.println("Main_Thread"+i);
		}
		System.out.println("end Main");
	}
}