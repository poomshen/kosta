package Quiz01;

import java.util.Scanner;

public class Myorber {
	static Itme[] its = new Itme[3];
	static Orber[] orb = new Orber[3];
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ck = 0;
		
		while (ck <= 2) {
			
			System.out.println("상품을 입력하세요");
			System.out.print("상품 :");
			String name = sc.nextLine();
//			System.out.print("상품 id :");
//			String id = sc.nextLine();
			System.out.print("메이커 :");
			String maker  = sc.nextLine();
			System.out.print("상품 개수 :");
			int qty = Integer.parseInt(sc.nextLine());
			Itme  it = new Itme((ck+1), name, maker);
			its[ck] = it; 
			Orber obr = new Orber(its[ck] , qty);
			orb[ck] = obr;
			
			ck++;
			
		}
		
		for(int i =0 ; i <= 2 ; i++){
			System.out.println(i+1 +"번 상품");
			System.out.println(orb[i].toString());
		}
		
		
	}

}
