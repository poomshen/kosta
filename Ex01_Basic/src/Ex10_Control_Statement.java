import java.util.Scanner;

public class Ex10_Control_Statement {
	
	public static void main(String[] args) {
		//반복문 :while문
		//while(), do~while()
		int i = 10;
		while(i >=10){
			System.out.println(i);
			i--;
			
		}
		
		//1~100까지의 합 
		int sum = 0;
		int j = 0;
		while(j<=100){
//			System.out.println(j);
			sum+=j;
			j++;
		}
		System.out.println("1~100까지의 합"+sum);
		
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
		
		
		//do ~ {실행문} while(조건식) :강제적 실행
		//메뉴 구성
		//아래 선택하세요
		//1.인사
		//2.급여
		//그 외 번호 입력 다시 메뉴 초기화
		
		Scanner sc = new Scanner(System.in);
		int inputdate =0;
		do{
			System.out.println("숫자 입력 :");
			inputdate = Integer.parseInt(sc.nextLine());
			
		}while(inputdate > 10);
			System.out.println("입력한 숫자는 :"+inputdate);
		
		
	}
}
