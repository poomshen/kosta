class Person{//default extends Object
	int data;
	public Person(int data) {
		this.data = data;
	}
}

class Emp{
	@Override
	public String toString() {
		return "object ������";
	}
}

public class Ex09_Object {
	///�̰��� ������ ������ �����ϱ�?
	public static void main(String[] args) {
		Person  p = new Person(12345);///���� �־��� ��.. ���� �߾�
		Person  p2 = new Person(789);
		
		System.out.println("Object equals : "+ p.equals(p2)); ///�� �߾� �� ��� �ٸ� ���̾� �ٵ� �ּҰ��̶�� �ɷ� ��������
		System.out.println(p.hashCode());///���̸� ���� �ֱ� ���ؼ� �ؽ� �ڵ带 �ؼ� ���� �ּ̾� ��.~�׷� ���� ��
		System.out.println(p2.hashCode());
		System.out.println("Object toString() : "+ p.toString());///�׷� toString�� �ؼ� �����ִ°Ŷ�°� �˰���
		System.out.println("Object toString() : "+ p2.toString());
		
		Emp  e = new Emp();         ///���� �� �ҷ� �°���?�ܿ� �������̵��� ���� �ٷ���?
		System.out.println(e.toString());//������
		
		Person p3 = p2; //p2 �������� �ִ°� �� �ּҰ�          ///����� p3=p2�� ������� �ž� �׷��� ���� �� ���´°Ű� �׷��� �˷� �ְ� �� �ϴ°� ����?
		System.out.println("Object equals : "+ p2.equals(p3));
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		//instanceof ���� �����Ͻø� Ÿ�� ��
		// �������� ���ϸ� �ʿ信 ���� (equlals, toString ) ������
		
		//// �����غ��ǵ� �̰� �׳� ������Ʈ�� Ÿ���̶��� ���� �Ͻ÷��� �Ѱ� ���� �׸��� ���� ��ȭ�� ���� �ʺ��� ���� �̶� �����ǳ�
		/// ���� ��Ʈ ���� �� �ʿ� �� ���� �Ͱ����� �ѹ� ���� �غ���
	}
}