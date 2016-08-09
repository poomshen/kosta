//싱글 프로세스 + 싱글 스레드
//Single - Thread > JVM제공하는 [stack 메모리 하나]만 사용
//함수를 순차적으로 실행(call호출)
//IO전까지는  싱글 스레드를 사용
//
// Main 쓰레드를 가지고 놀았음
public class Ex01_Single_Thread {
	public static void main(String[] args) {
		System.out.println("Main Thread 시작");
	    woker();
	    woker2();
	    System.out.println("Main Thread 종료");
	}
	static void woker(){
		System.out.println("나 1번 일꾼이야");
	}
	static void woker2(){
		System.out.println("나 2번 일꾼이야");
	}
}
