import java.util.Scanner;

public class Ex00_Jnmin_ {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@주민번호를 입력 하세요@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		boolean ck = true;
		do{
			System.out.print("주민번호:");
			String jumin = sc.nextLine();
			if(jumin.contains("-")){
			String []jnminsum = jumin.replace("-", "").split("");
			if(jnminsum.length==13){
				String[] jumin2 = jumin.split("-");
				String gender= jumin2[1].substring(0, 1);
				if(gender.equals("1")||gender.equals("2")||gender.equals("3")||gender.equals("4")){
					String gernderm = (gender.equals("3")||gender.equals("1"))?"당신은 남자입니다":
						(gender.equals("2")||gender.equals("4"))?"당신은 여자입니다":
							"당신은 혹시 중성입니까";
					System.out.println(gernderm);
					ck=false;
				}else{
					System.out.println("올바른 주민번호가 아닙니다.");
				}
			}else{
				System.out.println("주민번호자리수가 맞지않습니다.");
				System.out.println("주민번호를 다시 입력해주세요");
			}
			}else{
				System.out.println("주민번호에'-'를 포함 시켜주세요");
				System.out.println("주민번호를 다시 입력해주세요");
			}
		}while(ck);
		System.out.println("프로그램을 종료 합니다.");
	}
}	
