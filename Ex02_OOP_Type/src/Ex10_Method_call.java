
class Data {
	int i;
}
public class Ex10_Method_call {
	public static void main(String[] args) {
		Data data = new Data();
		data.i =100;
		Vcall(data.i);
		System.out.println("data.i" + data.i);
	}
	static private void Call(Data d) {
		System.out.println(d.i);
		d.i = 5555;
	}
	static void Vcall(int x){
		System.out.println("x�� �Ķ���� ����"+ x);
	}
}

//����
//���赵  �ȿ� ���� [static] �޼��带 ����� �ִ´ٸ�
//�� [�ǵ�]�� �������ϱ��?
//  => ���� ���� �ڿ��� ���
/*
	class Test{
	 static void m(){}
	 static void m2(){}
	 static void m3(int i){}
	}

*/