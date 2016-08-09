import kr.or.kosta.Car;

public class Ex02_main2 {
	public static void main(String[] args) {
		//Ex01_main.java 가지고 있는 Test 클래스 사용가능
		Test t = new Test();
		Test2 t2 = new Test2();
		
		//다른 폴더 안에서 사용할 수 있다.
		Car c =new Car();
	}
}
