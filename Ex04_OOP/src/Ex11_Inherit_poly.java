//������
//������: �������� ���� (����)�� ���� �� �ִ� �ɷ�
//������ ���� : Overloading , Override (MS ����)

//������: [���] ���迡�� ����
//		�ϳ���[ ���� ����]�� [�������� Ÿ��]�� ���� �� �ִ�.
//      ����Ŭ���� Ÿ���� ���������� �ڽ� Ŭ������ ��ü�� �����Ҽ� ����

//Java 
//�ڽ��� �θ𿡰� ���Ǿ��� �帰��.

class Tv2{ //�θ� (�Ϲ�ȭ, �߻�ȭ ) ������
	boolean power ; 
	int ch;
	void Power(){
		this.power = !this.power;
	}
	void Chup(){
		ch++;
	}
	void Chdown(){
		ch--;
	}
}

class CapTv extends Tv2{ //CapTv Ư��ȭ , ��üȭ�� ���븸 ����
	String text;
	String caption(){
		return this.text = "�ڸ�ó��...";
	}
}


public class Ex11_Inherit_poly {
	public static void main(String[] args) {
		CapTv ctv = new CapTv();
		ctv.Power();
		System.out.println(ctv.power);
		
		ctv.Chup();
		System.out.println(ctv.ch);
		System.out.println(ctv.caption());
		ctv.Chdown();
		
		Tv2 t2 = ctv;//ctv(��������) �ּҰ� (CapTv ��ü��)
//		System.out.println(ctv.toString());
//		System.out.println(t2.toString());
		//���⼺
		//t2 �ڽ��� �� (Tv2Ÿ���� ��ü�� ���� �ִ�)
		t2.Chup();
		System.out.println("�ڽ� : "+ ctv.ch);
		System.out.println("�ڽ� : "+ t2.ch);
		//�޸� ���� �뵵?
		
		
		//�θ�� �ڽĿ��� (����)
		CapTv cc = (CapTv)t2;// ������� ĳ������ �ʿ��մϴ�.
		
		
		System.out.println(cc == t2);
		System.out.println(t2 == ctv);
		
		//�ڽ��� �θ� ���Ǿ���
		Tv2 tt = new Tv2();
		t2 = tt;
	
		
		
	}
}
