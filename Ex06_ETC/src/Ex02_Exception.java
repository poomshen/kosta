
public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		try {
			for(int i =0 ; i < 10 ; i++){
				result = num/(int)(Math.random()*10);//0~9;
				System.out.println("��� : " + result );
			}
			//����� random �Լ��� 0 �� ������ �ʰ� �ϴ� ���� ����
		}catch (ArithmeticException e) {
			//���� ����
			System.out.println("���� ����~��");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("�ε��� ����");
		}catch (Exception e) {
			System.out.println("������ ���� �߻�");
		}/*catch(ArithmeticException ex){
			���� ���ܴ� �׻� ���� ���ܺ��� �Ʒ�
		}*/
		System.out.println("����");
	}
}
