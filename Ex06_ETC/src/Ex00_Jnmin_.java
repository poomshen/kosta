import java.util.Scanner;

public class Ex00_Jnmin_ {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@�ֹι�ȣ�� �Է� �ϼ���@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		boolean ck = true;
		do{
			System.out.print("�ֹι�ȣ:");
			String jumin = sc.nextLine();
			if(jumin.contains("-")){
			String []jnminsum = jumin.replace("-", "").split("");
			if(jnminsum.length==13){
				String[] jumin2 = jumin.split("-");
				String gender= jumin2[1].substring(0, 1);
				if(gender.equals("1")||gender.equals("2")||gender.equals("3")||gender.equals("4")){
					String gernderm = (gender.equals("3")||gender.equals("1"))?"����� �����Դϴ�":
						(gender.equals("2")||gender.equals("4"))?"����� �����Դϴ�":
							"����� Ȥ�� �߼��Դϱ�";
					System.out.println(gernderm);
					ck=false;
				}else{
					System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
				}
			}else{
				System.out.println("�ֹι�ȣ�ڸ����� �����ʽ��ϴ�.");
				System.out.println("�ֹι�ȣ�� �ٽ� �Է����ּ���");
			}
			}else{
				System.out.println("�ֹι�ȣ��'-'�� ���� �����ּ���");
				System.out.println("�ֹι�ȣ�� �ٽ� �Է����ּ���");
			}
		}while(ck);
		System.out.println("���α׷��� ���� �մϴ�.");
	}
}	
