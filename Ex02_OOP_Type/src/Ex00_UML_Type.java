
public class Ex00_UML_Type {
	public static void main(String[] args) {
		
		int UNIT = 10000; // ȭ����� ; 10000����, 5000����, 1000����, 500����,
		// 100����, 50����, 10����, 5����, 1����
		int NUM = 0; // ȭ�� �ż�
		int SW = 0; // ����Ī ����
		
		int MONEY = 12345; // �Է¹޴� �ݾ�
		
		while(true)
		{
			NUM = MONEY / UNIT; // �� ; ȭ��ż� : �Է¹��� �ݾ��� ȭ������� ������.
			System.out.println("UNIT:" + UNIT + "/num:" + NUM); // ���
			
			if (UNIT <= 1) { // UNIT�� 1���� �۰ų� ������
				break; // �ݺ��� ����
			} // if
			
			MONEY = MONEY - UNIT * NUM; // ������ ���� ������ . ���� �ݾ��� �ʱⰪ
			
			if (SW == 0) { // ȭ���� ���� ������ ����Ī ������ �̿��ؼ� 2, 5�� ������ ����
				UNIT = UNIT / 2; // 10000/2 = 5000,......
				SW = 1;
			} else {
				UNIT = UNIT / 5; // 5000/5 = 1000,......
				SW = 0;
			} // if
		}// while
	}
}
