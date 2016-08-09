package main;

import java.util.Scanner;

import drink.Drink;
import slot_Machine.Money_calculator;

public class Main_calculater {
	public static void main(String[] args) {
		int result =0;
		boolean yorN = false;
		Scanner sc = new Scanner(System.in);
		//��� Ŭ���� ���� �ͼ� cal�� ����
		Money_calculator cal = new Money_calculator();
		//���� ������ �޾ƿ���
		Drink d1 = insertDrink("�ݶ�", 1000, 3);
		Drink d2 = insertDrink("���̴�", 500, 30);
		Drink d3 = insertDrink("���ھ�", 300, 100);
		Drink d4 = insertDrink("ȯŸ", 700, 200);
		Drink d5 = insertDrink("��Ű��", 800, 15);
		// ���� 
		exit_a: while (true) {
			System.out.println("@@@@�����Ͻ� ���Ḧ ��� �ּ���!@@@@");
			//���� ������ ���� ����
			System.out.printf("@@@@1.%s ����:%d  2.%s ����:%d   3.%s ����:%d   4.%s ����%d   5.%s ����%d @@@@\n ", d1.readName(),d1.readPrice(), d2.readName(),d2.readPrice(),
					d3.readName(),d3.readPrice(), d4.readName(),d4.readPrice(), d5.readName(),d5.readPrice());
			//������ ������ �˼� �ֵ��� ������ �ڵ�
			String drinkno = "d" + (sc.nextLine());//d+���� �ؼ� ���° ���Ḧ ���� �ϴ���
			//���� ���� �ٸ� ������ �ϸ� 0 �� �޴´�.
			int price = (drinkno.equals("d1")) ? d1.readPrice()
					: (drinkno.equals("d2")) ? d2.readPrice()
							: (drinkno.equals("d3")) ? d3.readPrice()
									: (drinkno.equals("d4")) ? d4.readPrice()
											: (drinkno.equals("d5")) ? d5.readPrice() : 0;
			
			// ������ �ùٸ��� ���� �� �ҽ�								
			if (price != 0) {
				if(yorN == false){
				System.out.println("@@@@@@@@@���� ������ �ּ���@@@@@@@@@@");
				int getMoney = Integer.parseInt((sc.nextLine()));
				 result = cal.set_money(getMoney, price);
				}else {
					result = cal.set_money(result, price);
				}
				//�Ž������� ������
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
					System.out.println("�Ž������� ���ҽ��ϴ�. �Ž��������� ��� ���� �Ͻðڽ��ϱ�? Y or N ");
					 String yesorNo = sc.nextLine();
					//�Ž������� �ްڽ��ϱ�?
					if(yesorNo.equals("Y")||yesorNo.equals("y")){
						yorN = true;
						continue exit_a;
					}else if(yesorNo.equals("N")||yesorNo.equals("n")){
						System.out.println("�Ž��� ���� :"+result+"���Խ��ϴ�.");
						yorN = false;
						continue exit_a;
						
					}else {
						System.out.println(" Y or N ���� ������ �ּ���");
					}
					}
					//�Ž������� ���� ���¾� ��������
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
					System.out.println("�Ž��� ���� �����ϴ�.");
				}else {
					//���� ���� �ҽ�
					System.out.println("���� ���� �մϴ�. ������ �� "+(-result)+"�� ��ȯ�մϴ�.");
					yorN = false;
				}
			} else {
				// 1~5���� ������ ���ҽ�
				System.out.println("@@@@@@1~5 �� ���� �ϼ���@@@@@@");
			}
		}
	}
//���Ḧ ���� �ִ� �޼ҵ�
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
