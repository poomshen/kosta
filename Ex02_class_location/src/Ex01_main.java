//Ŭ������ ����� (��ġ)

//�ϳ��� java���� �ȿ� Ŭ���� ����� ���� 
// �� Ŭ���� ������(public)�̸� �ȵ˴ϴ�.
// �⺻������ ������(������)�� ������
//default �����ڰ� �پ�� (����������)
//default�� ���� ���� �ȿ����� ��� �����ϴ�.
// ���� ���ο����� ���Ŷ�� �ǹ�
class Test{
	int num;
	
}

//default class Test{
//	default int num;
//}


//2.public (����):�ٸ� �������� ��� ����
//�� ��θ� ��Ȯ�� �˷��شٸ�
//prblic class Emp(){}

public class Ex01_main {
	public static void main(String[] args) {
		Test t = new Test();
		t.num = 100;
		System.out.println(t.num);
	}
}
