package Quiz01;

import java.util.Scanner;

public class Myorber {
	static Itme[] its = new Itme[3];
	static Orber[] orb = new Orber[3];
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ck = 0;
		
		while (ck <= 2) {
			
			System.out.println("��ǰ�� �Է��ϼ���");
			System.out.print("��ǰ :");
			String name = sc.nextLine();
//			System.out.print("��ǰ id :");
//			String id = sc.nextLine();
			System.out.print("����Ŀ :");
			String maker  = sc.nextLine();
			System.out.print("��ǰ ���� :");
			int qty = Integer.parseInt(sc.nextLine());
			Itme  it = new Itme((ck+1), name, maker);
			its[ck] = it; 
			Orber obr = new Orber(its[ck] , qty);
			orb[ck] = obr;
			
			ck++;
			
		}
		
		for(int i =0 ; i <= 2 ; i++){
			System.out.println(i+1 +"�� ��ǰ");
			System.out.println(orb[i].toString());
		}
		
		
	}

}