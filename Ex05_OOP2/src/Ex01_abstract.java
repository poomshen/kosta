//�߻� Ŭ����(abstract class)
//�̿ϼ� ���赵 (�ϼ��� �ڵ� +�̿ϼ� �ڵ�)
//�̿ϼ� �ڵ�(�̿ϼ��� �ż��� : ����� (x) > {}(x) ����
//�߻�޼��� > abstract method :
//ex) void move(){} > void move();(�߻�޼���)

//1.�߻� Ŭ������ ������ ��ü���� �Ұ�(�̿ϼ��̱� ����)
// ex ) abstract class Emp(�߻�  �޼���)  > Emp e = new EMP();(x)
//2.�߻� Ŭ������ ����� ���ؼ��� ��밡��
// ex) class person extends Emp{}
//3.����� ���ؼ� �̿ϼ��� �޼��带 �ϼ��ض�(�߻� �޼��带 �����ض�)
//�߻� �޼���  ��ӹ��� Ŭ������(Override �ض�) (������)

//why: ���� :������ ���ڿ� ������ �����ο� �ض�

abstract class abclass{
	int pos;
	void run(){
		pos++;
	}
	
	abstract void stop();//(���� ���� ���� �ϸ� �߻� �ڿ��̵ȴ�.)
	
}
class child extends abclass{

	@Override
	void stop() {
		System.out.println("stop");
		
	}
	
}
public class Ex01_abstract {
	public static void main(String[] args) {
		child c  = new child();
		System.out.println(c.pos);
		c.run();
		System.out.println(c.pos);
		c.stop();
		
		//abclass ab = new abclass(); ��ü ����
	}
}
