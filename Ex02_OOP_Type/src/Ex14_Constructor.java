import kr.or.kosta.Book;
import kr.or.kosta.Book2;

//생성자(Constructor)
//함수(특수한 목적의 함수)
//함수의 이름 : class 이름과 동일 
//생성 시점  : return Type 을 갖지 못한다 (void(x))
//몇가지 규칙을 제회하면 함수와 동일 
//실행(생성) : new 연산자를 통해서 객체가 생성될때 생성됨
/*
 class car {
 	public car(){
 	
 	}
 }

*/
class Car2{
	int door;
	public Car2(){
		System.out.println("난 dafault 생성자");
		door = 100;
	}
	public Car2(int c){
		door = c;
	}
}
public class Ex14_Constructor {
	public static void main(String[] args) {
		Book b = new Book();
		b.bname = "홍길동전";//초기화
		b.witeAmount(10);//초기화
		
		//book타입의 객체를 만들면
		//초기화라는 작업을 한다.
		Car2  c= new Car2();
		System.out.println(c.door);
		
		Car2 c2 = new Car2(100);
		System.out.println(c2.door);
		
		Book2 b2 = new Book2("김유신전", 100);
		Book2 b3 = new Book2("김전", 500);
		Book2 b4 = new Book2("신전", 400);
		
	}

}
