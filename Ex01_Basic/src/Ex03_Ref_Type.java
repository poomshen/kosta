/*
	클래스 == 설계도 == 타입 
	*클래스는 타입니다.
	int age > int(타입,자료형) > 값을 담는다.
*/
class Apt{
	int door=10;
	int window = 2;
	
}
public class Ex03_Ref_Type {
	public static void main(String[] args) {
		Apt  ssang = new Apt();
		//Apt 타입  ssang 변수(객체)
		System.out.println(ssang);//주소값 (참조 값_)
		//참조 타입
		
		Apt sam = new Apt();
		sam =ssang;
		sam.door = 1000;
		System.out.println(ssang.door);
		
		
		int num = 100;
		//int 타입 num변수
		System.out.println("num :"+num);
		int you;
		you =num;
		num =1000;
		
	}
}	
