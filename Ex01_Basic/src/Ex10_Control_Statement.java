import java.util.Scanner;

public class Ex10_Control_Statement {
	
	public static void main(String[] args) {
		//�ݺ��� :while��
		//while(), do~while()
		int i = 10;
		while(i >=10){
			System.out.println(i);
			i--;
			
		}
		
		//1~100������ �� 
		int sum = 0;
		int j = 0;
		while(j<=100){
//			System.out.println(j);
			sum+=j;
			j++;
		}
		System.out.println("1~100������ ��"+sum);
		
		int sum1 =2;
		int sum2 =1;
		
		while(sum1 < 10){
			while(sum2 < 10){
				System.out.println(sum1+"*"+sum2+"="+sum1*sum2);
				sum2++;
			}
			sum1++;
			sum2=1;
		}
		
		
		//do ~ {���๮} while(���ǽ�) :������ ����
		//�޴� ����
		//�Ʒ� �����ϼ���
		//1.�λ�
		//2.�޿�
		//�� �� ��ȣ �Է� �ٽ� �޴� �ʱ�ȭ
		
		Scanner sc = new Scanner(System.in);
		int inputdate =0;
		do{
			System.out.println("���� �Է� :");
			inputdate = Integer.parseInt(sc.nextLine());
			
		}while(inputdate > 10);
			System.out.println("�Է��� ���ڴ� :"+inputdate);
		
		
	}
}
