//���� <-> ���
//��� : �ѹ� ���� �������� ���� �Ұ�
//��� : ���������� �빮�� ǥ��

//java : final int NUM = 100;
//c#   : const int NUM = 200;

//final Ű����
//Ŭ���� �տ� : final  class  TT{} ����Ҽ� ���� Ŭ���� ����
//�Լ�   �տ� : final method()
			//final void M() : ��Ӱ��迡�� ������ ����
//�ַ� ��� (����)

class Vcard {
	final String KIND = "heart"; //���
	final int NUM = 100;
	public void method(){
		System.out.println(Math.PI);//�ý��� ���
	}
	
}
class Vcard2 {
	final String KIND;
	final int NUM;
	//����� ��ü�� �ɶ� ���� ������ ���强 �ڵ�
//	public Vcard2() {
//		this.KIND ="";
//		this.NUM = 10;
//	}
	public Vcard2(String kind , int num) {
		this.KIND = kind;
		this.NUM  =num;
		
	}
	//������ ����
	//��ü���� �ٸ� ������� ������ �ϰڴ�.
}

public class Ex07_final {
	public static void main(String[] args) {
		Vcard v = new  Vcard();
//		v.KIND = "aaa"; error
		//�������� ���忡���� ��¸� ����
		System.out.println(v.KIND + " : " + v.NUM);
		v.method();
		
		Vcard2 v2 = new Vcard2("A", 10);
		Vcard2 v3 = new Vcard2("B", 20);
		Vcard2 v4 = new Vcard2("c", 30);
		
		
	}
}