class Test2 {
	void print(){
		System.out.println("�θ� �Լ�");
	}
}

class Test3 extends Test2{
	//�θ�Ŭ������ Test2 �� ������ print () �Լ��� ������

	@Override
	void print() {
		System.out.println("�ڽ� �Լ�");
	}
}

class Test4{
	//��� Ŭ������ Object Default ���: Object ������ �Լ��� ������ �����ϴ�

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Object�� toString() �Լ� ������";//super.toString();
	}
}

class Test5{
	
}
public class Ex05_Inherit_Override {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.print();//�������� print() �Լ� ȣ��
		//t ���������� �������� print() �Լ��� ȣ��
		
		Test4 t2 = new Test4();
		Test5 t3 = new Test5();
		
		System.out.println(t2.toString()); //Object �� to  ~������(���ڿ�)
		System.out.println(t3.toString()); //Object �� to ~(�ּҰ�)
		
	}
}
