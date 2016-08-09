//Ŭ�������� ����
//�������� Ŭ����(���ΰ��� ������)
//���(is~a) , ����(has~a) ->  �������� ����,

//Ŭ������ ����(���� ����)
//����� : ������ 
//user  : provider

//class A{}
//class B{}
//	�����       ������
//class A �� class B�� ����մϴ�.

//A�� B�� ����ϴ� ���
//AŬ���� �ȿ��� ��ü ����
//A�� B�� ���
//�Լ��� parameter �� ���
//.........

//���(�������̽��� ���ؼ�)
//A�� BŬ������ [�������� ����]
//���� ���α׷����� �������� ���踦 ������ ���� ��ȣ���� �ʽ��ϴ�.
//�������� ���� ���ƿ�
class A{
	void method(B b){
		b.B_method();
	}
}
class B{
	void B_method(){
		System.out.println("BŬ���� �ż���");
	}
}
//B��ü�� �� ����� ���� ������ ����
//B��ü ��ȭ�� ���� �ΰ��ϰ� �������� �ʰ�
//�������� ���
//AŬ������ B��� Ŭ������ ������ ���� ��밡��?
//�������̽� ���
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
		System.out.println("�� D ��~");
	}
	
}
class F implements IQ{

	@Override
	public void m() {
		System.out.println("�� F ��~");
	}
	
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.method(b); // �������� ����
		
		C c = new C();
		D d = new D();
		F f = new F();
		c.method(d);
		c.method(f);//���� ���� �����̽��� �̿��� 
	}
}
