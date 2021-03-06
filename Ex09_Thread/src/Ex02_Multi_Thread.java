/*
	1.프로그램 실행 가능한 : -> exe 실행  -> 프로세스(실행중)
	2.프로세는 (method 단위 동작) -> 최소 하나 이상의 Thread 가지고 있다.
	3.Thread  : 프로세스에서 하나의최소 실행 단위 => 함수(method)
	4.Thread 가지고 놀기
	5.만드는 방법
		두가지
		- Thread 클래스를 상속 : class Test extends Thead 상속 
		class Test extends Thread{
	
		}
		** 반드시 Thread 가지는 run() 함수 재정의 (구현) **
		
		- runnable 인터 페이스를 구현  : ( run()함수 강제 구현 )
		class Test implements Runnable{
	
		}
		
	두가지가 된 이유 인터페이스로 다른 자원을 상속 받을 수 있고 딱히 다른 자원 상속을 하지 않으면 상속을 해라 
	
	//java 특징
	-단일 상속 원칙
	-Thread 상속하면 다른 클래스 상속 ...
	-인터페이스를 통해서 사용하면 다른 클래스를 상속 가능
	-확장성
	-class T extends person implements Runnable{}

*/
//Thread 생성하기 (상속 )
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
//run() 함수는 다른 Stack main 함수와 같은 역할 을 해준다
public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		Thread_1 t = new Thread_1();
		t.start();//새로운 스택을 메모리를 만들고 그 새로생성된 스택에 run() 함수를 올리는 작업까지
		
		//Runnable 인터페이스를 구현한 경우
		//별도의 Thread 생성해서 runnable 구현한 객체 정보를 넘겨 주어야 한다.
//		Thread_2 thread_2 =new Thread_2();
//		Thread t2 = new Thread(thread_2);
		Thread t2 = new Thread(new Thread_2());
		t2.start();   //start() -> stack memory 생성 > 생성된  stack > run()
		
		for(int i =0 ;i<100; i++){
			System.out.println("Main_Thread"+i);
		}
		System.out.println("end Main");
	}
}
