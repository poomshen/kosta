import kr.or.kosta.Pclass;


//��Ӱ��迡�� Protected ��¥ �ǹ�

/*class AAA{
	protected void method(){
		
	}
}
class BBB extends AAA{
	void m(){
		method();
	}
}*/


class Dclass{
	private int i;
	public int j;
	protected int k ;// ��Ӱ��迡�� ���
	
}
class Fclass2 extends Pclass{
	
}

class Fclass extends Dclass{
	
	void fmethod(){
//		this.i �� private �̶� ������ �Ұ��ϴ�.
		j = 500;
		k = 600; //protected�� ��� ���迡���� ������ �����ϴ�.
		//�ٸ� ����(package)Ŭ�������� ���� �Ұ�
	}
}
public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Fclass f = new Fclass();
		f.k = 2000;
		System.out.println(f.k);//���� ���� (protected �̾) why: ���� ����
		
		
		Pclass p= new Pclass();
//		p.tint = 5555;//���� �Ұ� why:�ٸ� ������ �ֱ� ������
	}
}
