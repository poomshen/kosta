import kr.or.kosta.Singleton;


//1.�������� ��ü�� �����ϴ��� �ϳ��� �ּҸ� ����
//2.��ü�� ���� ����Ϸ���
//3.�Ѱ�ü�� ����� ������
//4.�� ��ü�� ����ؼ� �������� ����
//5.
public class Ex10_Singleton_main {
	
	//�ϳ��� ��ü�� �����ؼ� �����ϴ� ��� ����
	//�̱��� ����
	//�������� �͸� �ؼ�
	public static void main(String[] args) {
	Singleton s	= Singleton.getInstance();
	Singleton s2= Singleton.getInstance();
	Singleton s3= Singleton.getInstance();
	
	System.out.println(s+ " : " +s2 + " : " +s3);
	System.out.println(s ==s2 );
	System.out.println(s ==s3 );
	}
}
