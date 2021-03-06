//Thread 상태 제어
//Thread 함수 활용
//sleep () , 
// join () <--앤 가끔 잘 쓴다고 함
// Main , th, th2 
// 복잡한 계산을 여러개의 쓰레드로 나누어서 각각의  
//계산 결과를 모두 참조하여 최종적인 결과 
//join 함수 사용

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
			//main Thread 가 요청 (join)
			//main 나 기달꺼야 너희가 끝나는 때 까지.
			th.join();
			th2.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for(int i = 0; i<3000 ; i++){
			System.out.println("&&&&&&&&&");
		}
		System.out.println("3개의 쓰레드가 걸린 총 시간 :");
		System.out.println(System.currentTimeMillis() -starttime);
		System.out.println("Main END");
	}
}
