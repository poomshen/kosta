//�̱� ���μ��� + �̱� ������
//Single - Thread > JVM�����ϴ� [stack �޸� �ϳ�]�� ���
//�Լ��� ���������� ����(callȣ��)
//IO��������  �̱� �����带 ���
//
// Main �����带 ������ �����
public class Ex01_Single_Thread {
	public static void main(String[] args) {
		System.out.println("Main Thread ����");
	    woker();
	    woker2();
	    System.out.println("Main Thread ����");
	}
	static void woker(){
		System.out.println("�� 1�� �ϲ��̾�");
	}
	static void woker2(){
		System.out.println("�� 2�� �ϲ��̾�");
	}
}
