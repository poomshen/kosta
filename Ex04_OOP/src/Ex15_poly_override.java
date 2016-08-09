//������ ����
class Parent{
	int x = 100;
	void pmethod(){
		System.out.println("parent method");
	}
	
}
class Child2 extends Parent{
	int x = 200; //MS: �����ϱ�
	@Override
	void pmethod(){//������
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
		p.pmethod(); //������ �� �޼ҵ�
		
		c.smethod();
		c.parent_x();
//		1.�θ�(pmethod) ȣ�� (super)
		
	}
}
