package Team2;

import java.util.Scanner;

public class Team_main {
	
	public static void main(String[] args) {
		Team_BOOK []book = new Team_BOOK[]{new Team_BOOK("ȫ�浿��","����",10),
		new Team_BOOK("�ڹ��� ����", "���ӽ�", 2),new Team_BOOK("����������", "ī����", 3),
		new Team_BOOK("�츮�Ʊ�", "��ȿ��", 5),new Team_BOOK("��", "��", 1),
		new Team_BOOK("����", "���ӽ�", 6),new Team_BOOK("����", "����", 3)
		};
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@3�� ������@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(" 1. ��ȸ  2. �˻�  3. ����  4. �ݳ�  5. ���� ");
//			����,�ݳ�, �˻�(å����,��������)->(å ����,��������,���) ,��ȸ
			int choice = Integer.parseInt(sc.nextLine());
		ba_a:	switch (choice) {
			case 1://��ȸ
				for(int i=0; i<book.length; i++){
					book[i].bookSearch();
				}
				break;
			case 2://�˻�
				String ins1 =null;
				String ins2 =null;
				int getstock = 0;
				
				
				System.out.println("�˻� 1.���� 2.���� 3.��� 4.�˻� ����");
				int choicesc1 = Integer.parseInt(sc.nextLine());
				
				//1��° ������ ������ ���
				if(choicesc1==1){
					System.out.print("����:");
					String bookname = sc.nextLine();
					ins1 = bookname;
					System.out.println("�˻� 2.���� 3.��� 4.��ü�˻� ����");
				}
				else if(choicesc1==2){
					System.out.print("����:");
					String bookWiter = sc.nextLine();
					ins1 = bookWiter;
					System.out.println("�˻� 1.���� 3.��� 4.��ü�˻� ����");
				}
				else if(choicesc1==3){
					System.out.print("���:");
					int bookStock = Integer.parseInt(sc.nextLine());
					getstock = bookStock;
					System.out.println("�˻� 1.���� 2.���� 4.��ü�˻� ����");
				}
				else if(choicesc1==4){
					for(int i=0; i<book.length; i++){
						book[i].bookSearch();
					}
					break;
				}else {
					System.out.println("1~4 �� ���� ���ּ���");
					choice = 2;
					break;
				}
				
				///2��° ����
				
				int choicesc2 = Integer.parseInt(sc.nextLine());
				if(choicesc2==1){
					System.out.print("����:");
					String bookname = sc.nextLine();
					ins2 = bookname;
					if(choicesc1 ==2){
						System.out.println("�˻� 3.��� 4.�˻� ����");
					}else if(choicesc1 ==3){
						System.out.println("�˻� 2.���� 4.�˻� ����");
					}
				}
				else if(choicesc2==2){
					System.out.print("����:");
					String bookWiter = sc.nextLine();
					ins2 = bookWiter;
					if(choicesc1==1){
						System.out.println("�˻� 3.��� 4.�˻� ����");
					}else if(choicesc1==3){
						System.out.println("�˻� 1.���� 4.�˻� ����");
					}
				}
				else if(choicesc2==3){
					System.out.print("���:");
					int bookStock = Integer.parseInt(sc.nextLine());
					getstock = bookStock;
					if(choicesc1 ==1){
						System.out.println("�˻� 2.���� 4.�˻� ����");
					}else if(choicesc1==2){
						System.out.println("�˻� 1.���� 4.�˻� ����");
					}
				}
				else if(choicesc2==4){
					System.out.println("�˻��� ���� �ϰڽ��ϴ�.");
					//���⼭ 
					//�߰��� �˻��� ������ 1��° �˻�
					if(choicesc1 == 3){
							for(int i=0; i<book.length; i++){
								if(book[i].bookSearch(getstock)){
									book[i].bookSearch();
								}
							}
					}else{
						for(int i=0; i<book.length; i++){
							if(book[i].bookSearch(ins1)){
								book[i].bookSearch();
							}
						}
					}
					break;
				}else{
					System.out.println("�ùٸ��� ���� ���ּ���");
				}
				
				//3��° ������ ����
				int choicesc3 = Integer.parseInt(sc.nextLine());
				//���� ���� ������
				
				//��� ���� �־�����
				if(choicesc3!=4){
					if(choicesc1==3||choicesc2==3||choicesc3==3){
						System.out.print("��� :");
						int bookStock = Integer.parseInt(sc.nextLine());
						getstock = bookStock;
					}else if(choicesc2 ==1){
						System.out.print("����");
						String bookname = sc.nextLine();
						ins1 = bookname;
					}else{
						System.out.print("����");
						String bookWiter = sc.nextLine();
						ins2 =bookWiter;
					}
					for(int i=0; i<book.length; i++){
						if(book[i].bookSearch(ins1,ins2,getstock)){
							book[i].bookSearch();
						}
						break;
					}
				}else {
				}
				//������
				//�߰��� �˻��� ������
				if(choicesc1 == 3 ||choicesc2 ==3){
					//��� �˻��� ������
						for(Team_BOOK bok : book){
							if(bok.bookSearch(getstock, ins1)){
								bok.bookSearch();
							}
						}
				}else {
					for(Team_BOOK bok : book){
						if(bok.bookSearch(ins1,ins2)){
							bok.bookSearch();
						}
					}
				}
				break;
			case 3://����
				System.out.println("���� �Ͻ�  å�� �̸���  ���ڸ�  �Է��� �ּ���");
				System.out.print("����:");
				String bookname1 = sc.nextLine();
				System.out.print("����:");
				String bookwiter1 = sc.nextLine();
				for(int i=0; i<book.length; i++){
					//���� ,���� �´°� ��ã��
				if(book[i].bookSearch(bookname1,bookwiter1)){
					if(book[i].getBookName().equals(bookname1)&&book[i].getBookWiter().equals(bookwiter1)){
						book[i].bookStockDown();
						System.out.println("����Ǿ����ϴ�.");
						book[i].bookSearch();
						break ba_a;
					}else{
						System.out.println("�̷�å�鵵 �ֱ���!!");
						book[i].bookSearch();
					}
				}else{
				}
				}
				System.out.println("���� ���� �ʴ� å �Դϴ�.");
				
				break;
			case 4://�ݳ�
				System.out.println("�ݳ� �Ͻ�  å�� �̸���  ���ڸ�  �Է��� �ּ���");
				System.out.print("����:");
				String bookname2 = sc.nextLine();
				System.out.print("����:");
				String bookwiter2 = sc.nextLine();
				for(int i=0; i<book.length; i++){
					
					//���� ,���� �´°� ��ã��
				if(book[i].bookSearch(bookname2,bookwiter2)){
					if(book[i].getBookName().equals(bookname2)&&book[i].getBookWiter().equals(bookwiter2)){
						book[i].bookStockUP();
						book[i].bookSearch();
						System.out.println("�ݳ��Ǿ����ϴ�.");
						break ba_a;
					}
//					System.out.println("�� å�� ���� å�� �ƴմϴ�.");
					}
				}
				System.out.println("�� å�� ���� å�� �ƴմϴ�.");
				
				break;
			case 5:
				System.out.println("�ý��� ����");
				System.exit(10);
				break;
			default:
				System.out.println("�ùٸ� ������ �ϼ���");
				break;
			}
		}
		
	}

}
