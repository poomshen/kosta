class Tv{
	boolean power ;
	int ch;
	//��� 
	void power(){
		this.power = !this.power;
	}
	void chup (){
		ch++;
	}
	void chdown(){
		ch--;
	}
	
}
class Vcr{ //vcr �� ����� �ִ� ���赵
	boolean power ;
	int counter =0;
	
	void power(){
		this.power = !this.power;
	}
	//����ϱ�
	void play(){
		System.out.println("����ϱ�");
	}
	void stop(){
		System.out.println("�����ϱ�");
	}
	void ff(){
		System.out.println("��������");
	}
	void rew(){
		System.out.println("�ǰ���");
	}
}
//vcr����� ������ tv

//TvVcr �̶� �� ���� �Ѵ� ������ ����
//TV ��� Vcr��� (���� ���)
//TvVcr(Vcr, Vcr) ���

//class TvVcr extends Tv,Vcr{} ���߻�� �Ұ�

// Tv��� , Vcr ����: ���� 1�� ��� , 1�� ����
//���ñ���: ������ ���� Ŭ���� ��� �޴°��� ����.
class TvVcr extends Tv{
	Vcr vcr = new Vcr();
}


public class Ex03_Single_Inherit {
	public static void main(String[] args) {
		
		TvVcr t  = new TvVcr();
		t.power();
		System.out.println("Tv ���� : " + t.power);
		t.chup();
		System.out.println("Tv ä�� : " + t.ch);
		
		//���� 
		t.vcr.power();
		System.out.println("Vcr ���� :" +t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		
		System.out.println("Tv ���� : " + t.power);
		System.out.println("Vcr ���� :" +t.vcr.power);
	}
}
