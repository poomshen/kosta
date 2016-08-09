
class RunnableImpl  implements Runnable{
	int iv = 0;
	@Override
	public void run() {
		int lv = 0; // local variable(지역변수)
		String name = Thread.currentThread().getName();
		while(lv <3 ){
			System.out.println(name + " local var :" + ++lv);
			System.out.println(name + " instance var :" + ++iv);
			System.out.println();
		}
		
	}
	
}

public class Ex10_Sync_Thread {
	public static void main(String[] args) {
		/*
		스레드가 각각의 다른 메모리 사용
		RunnableImpl r = new RunnableImpl();
		RunnableImpl r2 = new RunnableImpl();
		Thread th = new Thread(r);
		Thread th2 = new Thread(r2 );
		th.start();
		th2.start();*/
		RunnableImpl r = new RunnableImpl();
		Thread th = new Thread(r);
		Thread th2 = new Thread(r);
		
		th.start();
		th2.start();
		/*
		Thread-0 local var : 1       Thread-1 local var : 1
		Thread-0 local var : 2       Thread-1 local var : 2
		Thread-0 local var : 3       Thread-1 local var : 3


		Thread-0 instance var : 1
		Thread-1 instance var : 2
		Thread-1 instance var : 3
		Thread-1 instance var : 4
		Thread-0 instance var : 5
		Thread-0 instance var : 6*/
		
	}
}
