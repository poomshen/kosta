//����(���α׷�)
//1.����(error) : ��Ʈ��ũ ��� , �޸� , �ϵ����
//2.����(exception): ������ ó��: �ڵ� ���߽� ���� ����
//try{}catch(Exeception e){}fianlly{}
//����ó��: ���α׷��� ������ ���Ḧ ���ڴ�.


//java.lang.ArithmeticException: / by zero
//	at Ex01_Exception.main(Ex01_Exception.java:18)

//�ǹ���
//1.���ܰ�ü�� �������� �ʾҴµ� �ڿ��� ���
//���ܰ� �߻��ϸ� �� ���ܿ� �´� Ŭ������ ã�Ƽ� new �ϰ� �޸𸮿� �ø���.
// new AritmeticException;�� ó��
//2.Excepion ó�� > ArithmeticException �ٸ� Ŭ����..
//	���ܸ� ����ϴ� �ֻ��� Ŭ����

public class Ex01_Exception {
	public static void main(String[] args) {
//		System.out.println(); ������ ����
		/*System.out.println("�Լ� ����");
		System.out.println("�ڵ� ó��");
		System.out.println(0/0); //���� ���α׷� ������ ����
		System.out.println("�Լ� ����");*/
		
		//����ó��
		try{
			System.out.println("�Լ� ����");
			System.out.println("�ڵ� ó��");
			System.out.println(0/0);
		}catch (Exception e) {//Exception Ŭ���� ���ܸ� ����ϴ� ���� Ŭ����
//			System.out.println("���� Ȯ�� : " + e.getMessage());
			e.printStackTrace();//���Լ��� ���� Ȯ��
		}
		System.out.println("�Լ� ����");
		
		
	}

}
