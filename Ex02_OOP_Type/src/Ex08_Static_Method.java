
class staticM{
	int iv;
	static int cv;
	
	//함수(일반함수
	void m(){
		//static 자원은 객체 생성 이전에 memory 올라간다.
		//1. 일반 함수가 static 자원에 접근 할 수 있을까
		cv= 1000;
		System.out.println("static cv 값 :"+ cv);
	}
	static void sm(){
		//static 함수는 일반자원 접근 불가하다
		//why) 생성시점(static 일반자원 보다 먼저 memory 올라간다.)
		//iv = 100;
		System.out.println("static  cv값" + cv);
		
		//같은 것으로 해라(static은 static과)
	}
}

public class Ex08_Static_Method {
	public static void main(String[] args) {
//		staticM sm = new staticM();
//		sm.m();
//		sm.sm();
		//접근방법
		//static 자원은 객체 생성 없어도 사용가능
		//그래도 공통적인 접근 (class 이름으로)
		staticM.cv = 5555;
		staticM smm = new staticM();
		smm.sm();
		smm.m();
		System.out.println(staticM.cv);
	}
	
}
