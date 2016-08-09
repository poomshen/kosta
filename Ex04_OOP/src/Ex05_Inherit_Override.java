class Test2 {
	void print(){
		System.out.println("부모 함수");
	}
}

class Test3 extends Test2{
	//부모클래스인 Test2 가 가지는 print () 함수의 재정의

	@Override
	void print() {
		System.out.println("자식 함수");
	}
}

class Test4{
	//모든 클래스는 Object Default 상속: Object 가지는 함수를 재정의 가능하다

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Object의 toString() 함수 재정의";//super.toString();
	}
}

class Test5{
	
}
public class Ex05_Inherit_Override {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.print();//재정의한 print() 함수 호출
		//t 참조변수는 재정의한 print() 함수만 호출
		
		Test4 t2 = new Test4();
		Test5 t3 = new Test5();
		
		System.out.println(t2.toString()); //Object 의 to  ~재정의(문자열)
		System.out.println(t3.toString()); //Object 의 to ~(주소값)
		
	}
}
