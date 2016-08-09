package kr.or.kosta;

//������ ����
// �̱��� ����

//1.���� : Singleton s = new Singleton  > default ������ > �ڵ����� >ȣ��
//>new Singleton() ���ϰ� ���� �;�� (�� overloading ����)

//? �������� ������ ����


//Ȱ�� (�ó�����)
//������ ��Ʈ��ũ ����()
//DB ����
public class Singleton {
	private static Singleton p = new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(p == null){
			p= new Singleton();
		}
		return p;
	}
}
