import java.util.Scanner;

public class Ex07_print_Format {
	public static void main(String[] args) {
		System.out.println("�ϳ�");
		System.out.print("��");
		System.out.print("��");

		//format (���Ĺ���)
		//%d (10���� ���� ���� ���)
		//%f (10���� ���� �Ǽ� ���)
		//%s (���ڿ�)
		//%c (�ѹ���)
		//System.out.println(format , args);
		int num = 100;
		int num2 = 200;
		System.out.println();
		System.out.printf("���� num ���� : %d �Դϴ�.", num);
		System.out.println();
		System.out.println("���� num����"+num+"�Դϴ�.");
		System.out.printf("num���� :%d �̰� num2 ���� %d �Դϴ�.",num,num2);
		
		
		float f = 3f;
		System.out.println(f);
		System.out.printf("f���� : %f",f);
		
		
		//�ֿܼ��� �Է� �ޱ� (cmd (Dos)â���� ���� �б�)
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
//		int result = sc.nextInt();
		//������ point
		//���ڸ� -> ���ڷ� (���־�)
		
		int result = Integer.parseInt(sc.nextLine());
//		Double.parseDouble(s)
//		Float.parseFloat(s)
		System.out.println("�Է°� :"+result);
		System.out.println("����� �̸� �Է�");
		String ename = sc.nextLine();
		System.out.println(ename);
		
		
		//�߿� 
		//[����] -> [����](����,�Ǽ�)
		//wraper class Ȱ��
		//Integer.ParseInt("����")
		String str2 = "10000";
		int value = Integer.parseInt(str2);
		System.out.println(value);
		
		//[����] ->[����]
		//1000-> "1000"
		int value2 = 1000;
		String str = String.valueOf(value2);
	}
}
