import java.util.Scanner;

public class Ex08_Control_Statement {
	//���� 
	//������ ��Ģ ����� ����� (+,-,*,/)
	//�Է°� 3��
	//ó�� ��°� : ���� (ex:10)
	//�ι�° �Է� �� : (ex:+)
	//���� ��� �� system.out.printf()�� ����ؼ� ���
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("ù��° ���� �־� �ּ��� \n");
		int su = Integer.parseInt(scanner.nextLine());
		System.out.printf("�����Ͻ� �����ڸ� �־��ּ��� \n");
		String cal = scanner.nextLine();
		
		System.out.printf("�ι�° ���� �־��ּ��� \n");
		int su2 = Integer.parseInt(scanner.nextLine());
		
		int sum = (cal.equals("+"))?su+su2:(cal.equals("-"))?su-su2:(cal.equals("*"))?su*su2:(cal.equals("/"))?su/su:0;
		System.out.printf("�Էµ� ���ε� ������ : %d",sum);
	}
	
	
}
