//함수
//함수의 종류
//void , parameter(0)
//void , parameter(X)
//return Type , parameter(0)
//return Type , Parameter(x)
//돌려주는 값이 없다.
//return Type : 8가지 기본 타입 + 참조타입 +배열(Array) 등등
//parameter(인자, 인수, 매개변수 ): 8가지 기본 타입 +참조 타입 +배열(Array) 등등

class Fclass{
	//함수 호출에 의해서 실행
	void m(){
		System.out.println("일반 함수(void,paramter(x))");
	}
	void m2(int param){
		System.out.println("param vlue :"+ param);
		System.out.println("일반함수 (void, paramter(0))");
	}
	int m3(){
		System.out.println("리턴 함수(return , parmter(x))");
		return 3;
	}
	int m4(int param){
		System.out.println("param vlue :"+ param);
		System.out.println("리턴함수(return, parmter(0))");
		return 100;
	}
	
	int m5(int param, int param2){
		return param +param2;
	}
	
	//Quiz
	int max(int a, int b){

// 	리턴은 한번만 하는게 좋다.		
//		int result = 0;
//		if(a>b){
//			result = a;
//		}else{
//			result =b;
//		}return result;
		
		// a 와 b 둘중에 큰 값을 return 하는 로직
		//return을 보낼때는 변수에 담아주는것이 좋다.
//		return (a>b)? a:(a==b)? a:b;
		int max = (a>b) ?a:(a==b) ?a:b;
		return max;
	}
	String m6(String param1 ,String param2){
		return param1 +":"+param2;
	}
	
	
	//key point 
	//class 를 return Type 또는 Paramter
	//class도 Type이다.(명제)
	Car carmethod(){
		Car c=new Car();
		return c;
	}
	Car carmethod2(Car c){
		return c;
	}
}

class Car{
	int door=10;
	
}


public class Ex03_OOP_Method {
 
	
	public static void main(String[] args) {
		Fclass f = new Fclass();
		f.m();
		f.m2(4);
		int fm3 = f.m3();
		System.out.println("fm3이 실행되면 :"+fm3);
		int fm4 = f.m4(10);
		System.out.println("fm4이 실행되면 :"+fm4);
		
		int result = f.m5(110, 130);
		System.out.println("result value" + result);
		
		int su = f.max(10, 40);
		System.out.println("result max value :" + su);
		
		String  str = f.m6("홍길동", "손오공");
		System.out.println(str);
		
		Car c= f.carmethod();
		////////////////////////////////////////////////
		Car car2 = new Car();
		Car car3 = f.carmethod2(car2);
		//car 참조변수의 주소와  car2 참조변수의 주소는 같다
	}
}
