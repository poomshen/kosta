package pocket;

import java.util.Scanner;

public class PocketMon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("���ϸ� ���忡 ���Ű� ȯ���մϴ�.������ 1�� ����� 2��");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("�����մϴ�!");
				ChoosePocketMon mon = new ChoosePocketMon();
				mon.Choose();
				break;

			case 2:
				System.out.println("����");
				return;
			}
			
			
		}
		
		
		
	}
	
}
