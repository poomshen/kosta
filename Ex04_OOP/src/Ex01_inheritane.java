//��ü���� ���
// ���, ĸ��ȭ,  ���⼺(*)

//java: A extends B
//class my extends father
//Tip : c#  A:B
//class my : father

//��� ��Ģ
//1. ���� ��� �Ұ�
//2. ���� ��� ��Ģ(������ ���: �������� Ŭ���� ���)
//3. extends(Ȯ��)
//�� interface ���߻�� ����

//����� ������ �ǹ�: ���뼺
//���� -> ������ -> �ڿ����� ����и� ����°�



class GrandFather{
	public int gmoney = 5000;
	
	private int pmoney = 10000;
	
	
	public int getPmoney() {
		return pmoney;
	}

	public void Gmethod(){
		System.out.println("Gmethod");
	}
	public GrandFather(){
		System.out.println("�Ҿƹ���");
	}
	
}
class Father extends GrandFather{
	public int fmoney = 10000;
	public Father() {
		System.out.println("�ƹ���");
	}
	public void fmethod(){
		System.out.println("fmethod");
	}
}
class Child extends Father{
	public int cmoney =10;
	public Child() {
		System.out.println("�ڽ�");
	}
}
class my{
	
}
//my m = new my();
//����ڰ� �����ϴ� ��� Ŭ������ java root class Object Ŭ������ default ��� �մϴ�.
class you extends Object{//ok ����ص� �Ǵµ� (���� ���� �ʿ� ����)
	
}


public class Ex01_inheritane {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("�Ҿƹ��� :"+ c.gmoney);
		System.out.println("�ƹ��� :"+ c.fmoney);
		System.out.println("�ڽ� :"+ c.cmoney);
		
		//��� heep �ö󰡴� ����: �θ���� .. (������ ����)
		
		my m = new my();
		//Object ��� ���� ����
		
		//�ֻ��� Ŭ������ Object ��� �޴� ����
		//GrandFather_extends Object

		//c.pmoney = 100; (���� ���� �Ұ�)
		//getter ���
		System.out.println(c.getPmoney());
		c.Gmethod();
		c.fmethod();
	}
}
