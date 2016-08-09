package main;

import java.util.Scanner;

import drink.Drink;
import slot_Machine.Money_calculator;

public class Main_calculater {
	public static void main(String[] args) {
		int result =0;
		boolean yorN = false;
		Scanner sc = new Scanner(System.in);
		//계산 클래스 가져 와서 cal로 설정
		Money_calculator cal = new Money_calculator();
		//음료 데이터 받아오기
		Drink d1 = insertDrink("콜라", 1000, 3);
		Drink d2 = insertDrink("사이다", 500, 30);
		Drink d3 = insertDrink("코코아", 300, 100);
		Drink d4 = insertDrink("환타", 700, 200);
		Drink d5 = insertDrink("밀키스", 800, 15);
		// 시작 
		exit_a: while (true) {
			System.out.println("@@@@선택하실 음료를 골라 주세요!@@@@");
			//음료 종류와 가격 설정
			System.out.printf("@@@@1.%s 가격:%d  2.%s 가격:%d   3.%s 가격:%d   4.%s 가격%d   5.%s 가격%d @@@@\n ", d1.readName(),d1.readPrice(), d2.readName(),d2.readPrice(),
					d3.readName(),d3.readPrice(), d4.readName(),d4.readPrice(), d5.readName(),d5.readPrice());
			//음료의 선택을 알수 있도록 설정한 코드
			String drinkno = "d" + (sc.nextLine());//d+숫자 해서 몇번째 음료를 선택 하는지
			//음료 맵핑 다른 선택을 하면 0 을 받는다.
			int price = (drinkno.equals("d1")) ? d1.readPrice()
					: (drinkno.equals("d2")) ? d2.readPrice()
							: (drinkno.equals("d3")) ? d3.readPrice()
									: (drinkno.equals("d4")) ? d4.readPrice()
											: (drinkno.equals("d5")) ? d5.readPrice() : 0;
			
			// 선택이 올바르게 선택 을 할시								
			if (price != 0) {
				if(yorN == false){
				System.out.println("@@@@@@@@@돈을 투입해 주세요@@@@@@@@@@");
				int getMoney = Integer.parseInt((sc.nextLine()));
				 result = cal.set_money(getMoney, price);
				}else {
					result = cal.set_money(result, price);
				}
				//거스름돈이 남을시
				if(result > 0){
					if(drinkno.equals("d1")){
						d1.pintDrink();
					}else if(drinkno.equals("d2")){
						d2.pintDrink();
					}else if(drinkno.equals("d3")){
						d3.pintDrink();
					}else if(drinkno.equals("d4")){
						d4.pintDrink();
					}else if(drinkno.equals("d5")){
						d5.pintDrink();
					}
					while(true){
					System.out.println("거스름돈이 남았습니다. 거스름돈으로 계속 구매 하시겠습니까? Y or N ");
					 String yesorNo = sc.nextLine();
					//거스름돈를 받겠습니까?
					if(yesorNo.equals("Y")||yesorNo.equals("y")){
						yorN = true;
						continue exit_a;
					}else if(yesorNo.equals("N")||yesorNo.equals("n")){
						System.out.println("거스름 돈이 :"+result+"나왔습니다.");
						yorN = false;
						continue exit_a;
						
					}else {
						System.out.println(" Y or N 으로 선택해 주세요");
					}
					}
					//거스름돈이 없이 딱맞아 떨어지면
				}else if(result ==0){
					if(drinkno.equals("d1")){
						d1.pintDrink();
					}else if(drinkno.equals("d2")){
						d2.pintDrink();
					}else if(drinkno.equals("d3")){
						d3.pintDrink();
					}else if(drinkno.equals("d4")){
						d4.pintDrink();
					}else if(drinkno.equals("d5")){
						d5.pintDrink();
					}
					System.out.println("거스름 돈이 없습니다.");
				}else {
					//돈이 부족 할시
					System.out.println("돈이 부족 합니다. 넣은신 돈 "+(-result)+"을 반환합니다.");
					yorN = false;
				}
			} else {
				// 1~5까지 선택을 안할시
				System.out.println("@@@@@@1~5 중 선택 하세요@@@@@@");
			}
		}
	}
//음료를 집어 넣는 메소드
	public static Drink insertDrink(String name, int price, int stock) {
		Drink d = new Drink();
		d.writeName(name);
		d.writePrice(price);
		d.writeStock(stock);
		return d;

	}
	
//	public static void out_Drink(String drinkno ,Drink d){
//		if(drinkno.equals("d1")){
//			d1.pintDrink();
//		}else if(drinkno.equals("d2")){
//			d2.pintDrink();
//		}else if(drinkno.equals("d3")){
//			d3.pintDrink();
//		}else if(drinkno.equals("d4")){
//			d4.pintDrink();
//		}else if(drinkno.equals("d5")){
//			d5.pintDrink();
//		}
//	}
}
