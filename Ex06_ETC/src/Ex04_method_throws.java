import java.io.FileInputStream;
import java.io.FileNotFoundException;

import kr.or.kosta.Person;

//메서드 예외 던지기
//throws ArithmeticException 의미
//call 함수를 하는 사람은 throws ArithmeticException 로  날릴 수 있는 예외 처리
class Test{
					// 예외
	void call() throws ArithmeticException , IndexOutOfBoundsException{
		System.out.println("Call 함수 시작");
		//try{} 하면 복잡해짐
		int i  =1/0;
		System.out.println("Call 함수 끝");
	}
}

public class Ex04_method_throws {
	public static void main(String[] args) {
		Test t = new Test();
		//t.call(); 이 함수가 오류가 날지 안날지 모름
		try {
			t.call();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");
		
		//java 설계
		//자바에서 트라이 캐치를 하지않으면 되지 않도록 설정한 예시
//		FileInputStream  f = new FileInputStream("C:\\temp\\a.txt");
		try {
			FileInputStream  f = new FileInputStream("C:\\temp\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Person p = new Person(100);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
