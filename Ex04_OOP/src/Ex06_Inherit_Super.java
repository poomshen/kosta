//this : ��ü �ڽ��� ����Ű�� this
//     : �����ڸ� ȣ���ϴ� this

//���  : super(��Ӱ���)
//��Ӱ��迡�� �θ��ڿ��� ���� �Ҽ� �ִ� Ű����

//super(������) : �θ��� �ּ�
//1. supre :�θ��� ������ ȣ��
//2. super :�θ��� �ּҰ��� ����Ų��.(�θ��ڿ�����)

class Base{
	String basename;
	Base(){
		System.out.println("�⺻ ������");
	}
	Base(String baname){
		this.basename = baname;
		System.out.println("basename : " + this.basename);
	}
	void BaseMethod(){
		System.out.println("BaseMethod");
	}
}

class Derived extends Base{
	String dname;
	public Derived() {
		System.out.println("Derived �⺻ ������");
	}
	Derived(String dname){
		// super(�θ� �����ڸ� ȣ���ϴ� super)
		super(dname);//�ڽ� Ŭ�������� �θ� �����ڸ� ȣ���ؼ� �ȿ� �ִ´�.  
		//
		this.dname = dname;
		System.out.println("dname :" + this.dname);
	}
	void DericedMethod(){
		System.out.println("DericedMethod");
	}
	
	//������(override) : �θ� (BaseMethod())
	//������ : �ڵ��� ���뼺
	//�������� : Derived c = new Derived();
	//c ��� ���������� �����ǵ� BaseMethod()�� ȣ��
	@Override
	void BaseMethod(){
		System.out.println("�θ��� BaseMethod()  �޼��带 ������ �մϴ�.");
	}
	
	//����� �θ�Ե� �׸��ϴ�.
	// ����� �ڽ�����(������(BaseWehod())
	void perent_method(){
		super.BaseMethod();//�θ��� bese<<<
	}
}

public class Ex06_Inherit_Super {
	public static void main(String[] args) {
		//1.�⺻
		//default constructor (�θ� : �⺻ ������ , �ڽ�: �⺻ ������)
//		Derived d = new Derived();
		
		//2.�ڽ� (overloading constructor ȣ��)
		//�θ�: �⺻������, �ڽ�: �Ķ���� 1�� (������ ) ȣ��
//		Derived d2= new Derived("ȫ�浿");
		
		//3.�ڽ� (overloading constructor ȣ��)
		//�θ�: �Ķ���� 1 (������) ȣ��, �ڽ�: �Ķ���� 1�� (������ ) ȣ��
		// ! > superŰ���� (�θ� �ּ�)
//		Derived d2= new Derived("ȫ�浿");
//		���)
//		basename : ȫ�浿
//		dname :ȫ�浿
		
//		Derived  d4 = new Derived("ȫ�浿");
//		d4.BaseMethod();
		
		
		//���� : 
		//�ڽ�Ŭ���� �θ� ���� BasMethod() �θ��� ���;
		Derived d =new Derived();
		d.perent_method();
	}
}