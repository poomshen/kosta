//인터페이스
//1.약속  , 표준 ,  규칙 ,  규약 등을 만드는 행위
//A 회사 신발 (3mm) -> 수출 (국제표준 :공통규칙)
//나사 
//ISO 표준(문서)
//회계
//A회사(x : 내부규정) , B회사 (x) , C회사(0) , D회사(0)

//소프트웨어 개발 > 인터페이스 가지고 ....
//소프트웨어 설계 최상위 인터페이스 : 표준 , 약속을 정의
//인터페이스 는 구현이 없다
//*[표준화된] 설계를 보장

//표준화를 얻는 이점 : 공통설계
//JAVA API 인터페이스 기반 설계
//인터페이스 상속이란 단어가 아닌 구현 (100%)
//예) 게임 설계 : add() 이름을 쓰면 Unit 이동
//               clear(String str) 규칙
///////////////////////////////////////////////////////////////
//JAVA (Interface) 
//생성방법 , 사용방법

//1.인터페이스 만드는 방법
//interface IA{
//    void up();
//}
//인터페이스  약속, 표준 , 규칙이기 때문에 구현을 가지지 않는다
//인터페이스는 추상자원을 가진다 > void Up();  > {}(x)

//인터페이스 상수를 제외하고는 변수를 가질 수 없다(상태정보를 가질 수 없다)

//result : 완벽하게 미완성(추상화) 코드 가지고 있다 (단 상수는 제외)

//1.스스로 객체 생성 불가 (why : 100% 미완성 코드)
//2.구현 (implements) 을 통해서만 사용 가능
//3.인터페이스가 가지는 추상자원 강제적 구현


//인터페이스 생성시
//인터페이스 이름 생성 
//관용적 표현
//java : 인터페이스 이름(~able) : Cloneable
//C#   : 인터페이스 이름 (I~)   : IClone

//ICloneable 이름

//Interface MyCloneable { 추상자원 }

//상속 : extends (class A extends B{})
//인터페이스는 : implements(class A implements B{})

//인터페이스는 만들떄
//여러개로 쪼개서 만든다 
//시스템 (안에 있는 설계도를 여러장으로)
//다중구현이 가능하다(다중상속)
//class A implements able , bable , cable  : 3개의 인터페이스 강제 구현

//****************************************
//인터페이스를 사용하는 입장 : (다형성) 다른 여러개의 타입을 하나로 묶어서 사용

//interface : 하나의 타입으로 
//interface my{}
//class a implements my {}
//class b implements my {}

////////////////////////////////////////////////////////////////////////////////
interface IA{
	//상수 + 추상자원
	//상수 : static , public , final > default  int AGE;
	public static final int AGE = 100;// 앞에는 생략 가능
	String GENDER = "남";
	//상수는 대문자로 하겠다는 관영적 표현
	//추상자원 : public , abstract > default  > 구현부{}(X) 
	public abstract String print();
	String message(String str);//public abstract
	

}
interface IB{
	int AGE  =100;
	void  print();
	String  message (String Str);
}
interface IC{
	void run();
}

//1.구현
class Test implements IA{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Test2 extends Object implements IA{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Test3 extends Object implements IA,IC{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
//************************************************************

//인터페이스도 클래스 처럼 타입으로 인정하세요 (다형성)


//**********************************************************
public class Ex03_Interface {

	public static void main(String[] args) {
		Test t = new Test();//생성
		
	}

}
