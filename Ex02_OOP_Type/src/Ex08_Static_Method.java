
class staticM{
	int iv;
	static int cv;
	
	//�Լ�(�Ϲ��Լ�
	void m(){
		//static �ڿ��� ��ü ���� ������ memory �ö󰣴�.
		//1. �Ϲ� �Լ��� static �ڿ��� ���� �� �� ������
		cv= 1000;
		System.out.println("static cv �� :"+ cv);
	}
	static void sm(){
		//static �Լ��� �Ϲ��ڿ� ���� �Ұ��ϴ�
		//why) ��������(static �Ϲ��ڿ� ���� ���� memory �ö󰣴�.)
		//iv = 100;
		System.out.println("static  cv��" + cv);
		
		//���� ������ �ض�(static�� static��)
	}
}

public class Ex08_Static_Method {
	public static void main(String[] args) {
//		staticM sm = new staticM();
//		sm.m();
//		sm.sm();
		//���ٹ��
		//static �ڿ��� ��ü ���� ��� ��밡��
		//�׷��� �������� ���� (class �̸�����)
		staticM.cv = 5555;
		staticM smm = new staticM();
		smm.sm();
		smm.m();
		System.out.println(staticM.cv);
	}
	
}
