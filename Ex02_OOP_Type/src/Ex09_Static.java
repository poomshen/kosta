
public class Ex09_Static {
	public void callmethod(){
		System.out.println("�� �Լ�");
	}
	public static void scallmethod() {
		System.out.println("�� ���� �Լ�");
	}
	public static void main(String[] args) {
		
		//�Լ��� �ҷ��ö��� Ŭ������ �ҷ��;� �Ѵ�.
		Ex09_Static static1 = new Ex09_Static();
		static1.callmethod();
//		������ �̷��� ����ϴµ� ���� Ŭ���������� ���� ����
//		Ex09_Static.scallmethod();
		scallmethod();
		
	}
}
