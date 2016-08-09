//다향성
//하나의 참조변수가 여러개의 객체를 참조할 수 있다.
//단 상속관계에서
//소방차 구현 > 공통기능  자동차라는 공통 기능 
class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("운전");
	}
	void stop(){
		System.out.println("정지");
	}
}
class FireCar extends Car{
	void water(){
		System.out.println("물을 뿌린다.");
	}
}


public class Ex12_Inherit_Poly {
	public static void main(String[] args) {
		FireCar f = new FireCar();
		f.drive();
		f.stop();
		f.water();
		
		Car c = null;
		c = f;//(Car)f;//부모(Car c) 자식( FireCar F)
		//자식은 부모에게 조건없이 주면 된다.
		//c라는 부모타입의 참조변수는 내것 만 받을 수 없다,
		// c= (car)f (up -castutin)
		FireCar  f2 = f ;
//		FireCar  = (FireCar) ; 명시적으로 (down -castring);FireCar
	}
}
