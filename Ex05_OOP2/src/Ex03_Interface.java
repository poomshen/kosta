//�������̽�
//1.���  , ǥ�� ,  ��Ģ ,  �Ծ� ���� ����� ����
//A ȸ�� �Ź� (3mm) -> ���� (����ǥ�� :�����Ģ)
//���� 
//ISO ǥ��(����)
//ȸ��
//Aȸ��(x : ���α���) , Bȸ�� (x) , Cȸ��(0) , Dȸ��(0)

//����Ʈ���� ���� > �������̽� ������ ....
//����Ʈ���� ���� �ֻ��� �������̽� : ǥ�� , ����� ����
//�������̽� �� ������ ����
//*[ǥ��ȭ��] ���踦 ����

//ǥ��ȭ�� ��� ���� : ���뼳��
//JAVA API �������̽� ��� ����
//�������̽� ����̶� �ܾ �ƴ� ���� (100%)
//��) ���� ���� : add() �̸��� ���� Unit �̵�
//               clear(String str) ��Ģ
///////////////////////////////////////////////////////////////
//JAVA (Interface) 
//������� , �����

//1.�������̽� ����� ���
//interface IA{
//    void up();
//}
//�������̽�  ���, ǥ�� , ��Ģ�̱� ������ ������ ������ �ʴ´�
//�������̽��� �߻��ڿ��� ������ > void Up();  > {}(x)

//�������̽� ����� �����ϰ�� ������ ���� �� ����(���������� ���� �� ����)

//result : �Ϻ��ϰ� �̿ϼ�(�߻�ȭ) �ڵ� ������ �ִ� (�� ����� ����)

//1.������ ��ü ���� �Ұ� (why : 100% �̿ϼ� �ڵ�)
//2.���� (implements) �� ���ؼ��� ��� ����
//3.�������̽��� ������ �߻��ڿ� ������ ����


//�������̽� ������
//�������̽� �̸� ���� 
//������ ǥ��
//java : �������̽� �̸�(~able) : Cloneable
//C#   : �������̽� �̸� (I~)   : IClone

//ICloneable �̸�

//Interface MyCloneable { �߻��ڿ� }

//��� : extends (class A extends B{})
//�������̽��� : implements(class A implements B{})

//�������̽��� ���鋚
//�������� �ɰ��� ����� 
//�ý��� (�ȿ� �ִ� ���赵�� ����������)
//���߱����� �����ϴ�(���߻��)
//class A implements able , bable , cable  : 3���� �������̽� ���� ����

//****************************************
//�������̽��� ����ϴ� ���� : (������) �ٸ� �������� Ÿ���� �ϳ��� ��� ���

//interface : �ϳ��� Ÿ������ 
//interface my{}
//class a implements my {}
//class b implements my {}

////////////////////////////////////////////////////////////////////////////////
interface IA{
	//��� + �߻��ڿ�
	//��� : static , public , final > default  int AGE;
	public static final int AGE = 100;// �տ��� ���� ����
	String GENDER = "��";
	//����� �빮�ڷ� �ϰڴٴ� ������ ǥ��
	//�߻��ڿ� : public , abstract > default  > ������{}(X) 
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

//1.����
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

//�������̽��� Ŭ���� ó�� Ÿ������ �����ϼ��� (������)


//**********************************************************
public class Ex03_Interface {

	public static void main(String[] args) {
		Test t = new Test();//����
		
	}

}
