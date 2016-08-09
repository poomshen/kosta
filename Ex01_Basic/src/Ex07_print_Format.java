import java.util.Scanner;

public class Ex07_print_Format {
	public static void main(String[] args) {
		System.out.println("하나");
		System.out.print("둘");
		System.out.print("셋");

		//format (형식문자)
		//%d (10진수 형식 정수 출력)
		//%f (10진수 형식 실수 출력)
		//%s (문자열)
		//%c (한문자)
		//System.out.println(format , args);
		int num = 100;
		int num2 = 200;
		System.out.println();
		System.out.printf("현재 num 값은 : %d 입니다.", num);
		System.out.println();
		System.out.println("현재 num값은"+num+"입니다.");
		System.out.printf("num값은 :%d 이고 num2 값은 %d 입니다.",num,num2);
		
		
		float f = 3f;
		System.out.println(f);
		System.out.printf("f값은 : %f",f);
		
		
		//콘솔에서 입력 받기 (cmd (Dos)창에서 값을 읽기)
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
//		int result = sc.nextInt();
		//오늘의 point
		//문자를 -> 숫자로 (자주씀)
		
		int result = Integer.parseInt(sc.nextLine());
//		Double.parseDouble(s)
//		Float.parseFloat(s)
		System.out.println("입력값 :"+result);
		System.out.println("당신의 이름 입력");
		String ename = sc.nextLine();
		System.out.println(ename);
		
		
		//중요 
		//[문자] -> [숫자](정수,실수)
		//wraper class 활용
		//Integer.ParseInt("문자")
		String str2 = "10000";
		int value = Integer.parseInt(str2);
		System.out.println(value);
		
		//[숫자] ->[문자]
		//1000-> "1000"
		int value2 = 1000;
		String str = String.valueOf(value2);
	}
}
