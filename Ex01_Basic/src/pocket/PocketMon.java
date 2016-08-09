package pocket;

import java.util.Scanner;

public class PocketMon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("포켓몬 월드에 오신걸 환영합니다.시작은 1번 종료는 2번");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("시작합니다!");
				ChoosePocketMon mon = new ChoosePocketMon();
				mon.Choose();
				break;

			case 2:
				System.out.println("종료");
				return;
			}
			
			
		}
		
		
		
	}
	
}
