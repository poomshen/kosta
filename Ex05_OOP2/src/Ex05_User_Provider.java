//클래스간의 관계
//여러개의 클래스(서로간의 연관성)
//상속(is~a) , 포함(has~a) ->  여러개의 관계,

//클래스의 관계(주종 관계)
//사용자 : 제공자 
//user  : provider

//class A{}
//class B{}
//	사용자       제공자
//class A 가 class B를 사용합니다.

//A가 B를 사용하는 방법
//A클래스 안에서 객체 생성
//A가 B를 상속
//함수의 parameter 로 사용
//.........

//사용(인터페이스를 통해서)
//A와 B클래스가 [직접적인 관계]
//현대 프로그래밍은 직접적인 관계를 가지는 것을 선호하지 않습니다.
//간접적인 관계 좋아요
class A{
	void method(B b){
		b.B_method();
	}
}
class B{
	void B_method(){
		System.out.println("B클래스 매서드");
	}
}
//B객체가 안 만들어 져도 문제가 없고
//B객체 변화에 대해 민감하게 반응하지 않고
//간접적인 방법
//A클래스는 B라는 클래스의 존제를 몰라도 사용가능?
//인터페이스 사용
interface IQ{
	void m();
}
class C{
	void method(IQ c){
		c.m();
	}
}

class D implements IQ{

	@Override
	public void m() {
		System.out.println("나 D 야~");
	}
	
}
class F implements IQ{

	@Override
	public void m() {
		System.out.println("나 F 야~");
	}
	
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.method(b); // 직접적인 관계
		
		C c = new C();
		D d = new D();
		F f = new F();
		c.method(d);
		c.method(f);//간접 관계 인페이스를 이용한 
	}
}
