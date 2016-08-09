//다형성 점검
class Parent{
	int x = 100;
	void pmethod(){
		System.out.println("parent method");
	}
	
}
class Child2 extends Parent{
	int x = 200; //MS: 무시하기
	@Override
	void pmethod(){//재정의
		System.out.println("Child method");
	}
	void smethod(){
		super.pmethod();
	}
	void parent_x(){
		System.out.println(super.x);
	}
	
}
public class Ex15_poly_override {
	public static void main(String[] args) {
		Child2 c  = new Child2();
		System.out.println("x :"+ c.x);
		c.pmethod();
		
		Parent p = c;
		p.pmethod(); //재정의 한 메소드
		
		c.smethod();
		c.parent_x();
//		1.부모(pmethod) 호출 (super)
		
	}
}
