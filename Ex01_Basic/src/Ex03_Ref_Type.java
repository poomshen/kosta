/*
	Ŭ���� == ���赵 == Ÿ�� 
	*Ŭ������ Ÿ�Դϴ�.
	int age > int(Ÿ��,�ڷ���) > ���� ��´�.
*/
class Apt{
	int door=10;
	int window = 2;
	
}
public class Ex03_Ref_Type {
	public static void main(String[] args) {
		Apt  ssang = new Apt();
		//Apt Ÿ��  ssang ����(��ü)
		System.out.println(ssang);//�ּҰ� (���� ��_)
		//���� Ÿ��
		
		Apt sam = new Apt();
		sam =ssang;
		sam.door = 1000;
		System.out.println(ssang.door);
		
		
		int num = 100;
		//int Ÿ�� num����
		System.out.println("num :"+num);
		int you;
		you =num;
		num =1000;
		
	}
}	
