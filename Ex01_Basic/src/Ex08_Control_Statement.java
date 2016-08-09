import java.util.Scanner;

public class Ex08_Control_Statement {
	//문제 
	//간단한 사칙 연산기 만들기 (+,-,*,/)
	//입력값 3개
	//처음 잆력값 : 숫자 (ex:10)
	//두번째 입력 값 : (ex:+)
	//연산 결과 는 system.out.printf()를 사용해서 출력
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("첫번째 수를 넣어 주세요 \n");
		int su = Integer.parseInt(scanner.nextLine());
		System.out.printf("연산하실 연산자를 넣어주세요 \n");
		String cal = scanner.nextLine();
		
		System.out.printf("두번째 수를 넣어주세요 \n");
		int su2 = Integer.parseInt(scanner.nextLine());
		
		int sum = (cal.equals("+"))?su+su2:(cal.equals("-"))?su-su2:(cal.equals("*"))?su*su2:(cal.equals("/"))?su/su:0;
		System.out.printf("입력된 수로된 연산은 : %d",sum);
	}
	
	
}
