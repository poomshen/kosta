package data_bank;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Bank_Main_notNo {
	static int memberSu =0;
	static Bank_member_notNo loginmd = new Bank_member_notNo();
	static Bank_member_notNo lastinmd = new Bank_member_notNo();

	public static void main(String[] args) {
		// ȸ������ �Ա� ��� ����Ȯ�� �����Ա� ����
		Scanner sc = new Scanner(System.in);
		boolean login = false;
	while (true) {
			System.out.println("@@@@@@@@�ȳ��ϼ��� 3�� �����Դϴ�.@@@@@@@@");
			int choice = 0;
			if (!login) {
				System.out.println("1.ȸ������ 2.�α��� 3.�Ա� 4.��� 5.�����Ա� 6.������� 7.����");
				choice = Integer.parseInt(sc.nextLine());
			} else {
				System.out.println("1.ȸ������ 2.�α׾ƿ� 3.�Ա� 4.��� 5.�����Ա� 6.������� 7.����");
				choice = Integer.parseInt(sc.nextLine());
			}
			switch (choice) {
			case 1: // ȸ������
				if (login) {
					System.out.println("�̹� ȸ���� �Ǿ� �ֽ��ϴ�.");
					break;
				}
//				Bank_member mb = memberAdata(memberSu);
				System.out.println("�̸��� �����Դϱ�?:");
				String name = sc.nextLine();
				System.out.println("��й�ȣ�� �����Դϱ�?");
				String pass = sc.nextLine();
				System.out.println("�� �Ա��� �ݾ��� �־� �ּ���");
				int money = Integer.parseInt(sc.nextLine());
				int acc = accountRandom();
				if(checkMembr(memberSu,name,pass,money,acc)){
					memberSu++;
					login = true;
					System.out.println("ȸ�����Կ� �����߽��ϴ�.");
					break;
				}else{
					System.out.println("ȸ�����Կ� �����߽��ϴ�.");
					break;
				}
//				mb.memberInSert(name, pass, money, accountRandom());
//				loginmd = mb;
			case 2:// �α���
				if(!login){
				System.out.println("�α��� ���� â�Դϴ�.");
				System.out.println("���¹�ȣ�� �Է����ּ���");
				int account = Integer.parseInt(sc.nextLine());
				System.out.println("��й�ȣ�� �Է����ּ���");
				String pass1 = sc.nextLine();
				if (checkMembr(memberSu ,account,pass1)){
					login = true;
					System.out.println("�α����� �����߽��ϴ�.");
					break;
				}else{
					System.out.println("���¹�ȣ, ��й�ȣ �� Ʋ�Ƚ��ϴ�. ");
					break;
				}
				}else{
					System.out.println("�α׾ƿ��� �Ǿ����ϴ�.");
					login = false;
					break ;
				}
			case 3:// �Ա�
				if (login) {
					System.out.println("���� �Ա� �ϼ���");
					int inMoney = Integer.parseInt(sc.nextLine());
					loginmd.inMoney(inMoney);
					loginmd.inCountup();
					break;
				} else {
					System.out.println("�α����� �ȵǿ����ϴ�.");
					break ;
				}
			case 4:// ���
				if (login) {

					System.out.println("����� �ݾ��� �Է��ϼ���");
					int outMoney = Integer.parseInt(sc.nextLine());
					int out = loginmd.outMoney(outMoney);
					if (outMoney > loginmd.getMoney()) {
						System.out.println("�ܵ��� �����մϴ�. ���� ������ �ִµ���" + out);
					} else {
						System.out.println("���� ��� �մϴ�." + outMoney + "���� ���Խ��ϴ�.");
						loginmd.outCountup();
					}
					break;
				} else {
					System.out.println("�α����� �ȵǿ����ϴ�.");
					break ;
				}
			case 5:// ���� �Ա�
				if (login) {
					System.out.println("�Ա��Ͻ� ���¸� �Է��ϼ���");
					int getAccoun =Integer.parseInt(sc.nextLine());
					if(checkMembr(memberSu,getAccoun)){
					System.out.println("���� �Ա� �ϼ���");
					int inMoney = Integer.parseInt(sc.nextLine());
					loginmd.inMoney(inMoney);
					loginmd.inCountup();
					break;
					}else{
						System.out.println("��ϵ� ���°� �����ϴ�.");
					}

				} else {
					System.out.println("�α����� �ȵǿ����ϴ�.");
					break ;
				}
				break;
			case 6:// ���� ���
				if (login) {
					loginmd.memberPrint(loginmd.getAccountNumber());

				} else {
					System.out.println("�α����� �ȵǿ����ϴ�.");
					break ;
				}
				break;
			case 7:  
				System.out.println("���α׷� ����");
				System.exit(0);
				break;
			case 0:break;
			default:
				System.out.println("1~6������ ���ڸ� �Է� �ϼ���");
				break ;
			}
		}
	}

	// ȸ���Է�
//	public static Bank_member memberAdata(int su) {
//		Bank_member mb = lastinmd;
//		for(int y=0;y>=su;y++){
//			if(su==0){
//				lastinmd = loginmd;
//			}else {
//				Bank_member mbA = new Bank_member();
//				mbA.setLastMember(mb);  
//				lastinmd = mbA;
//			}
//		}
//		return mb;
//	}
	
	//��ȸ��Ȯ��- ����üũ �� ���� 
	public static boolean checkMembr(int su, String name,String pass,int money ,int account){
		boolean ck = true;
		for(int y=0;y<=su ;y++){
			if(y>0){
				System.out.println("���¹�ȣ"+account);
				Bank_member_notNo mb = lastinmd;
				Bank_member_notNo mbA = new Bank_member_notNo();
				mbA.setLastMember(mb);  
				if(mbA != mb){
				if(mbA.getLastMember().getAccountNumber()==account){
					ck =false;
				}
					mbA.memberInSert(name, pass, money, account,mb);
					lastinmd = mbA;
				}else{
					mbA.memberInSert(name, pass, money, account,mb);
					lastinmd = mbA;
				}
			}
			    loginmd.memberInSert(name, pass, money, account,lastinmd);
				lastinmd = loginmd;
		}
		return ck;
	}
	//��ȸ��Ȯ��- ����üũ 
	public static boolean checkMembr(int su,int accountNumber){
		boolean ck = true;
		for(int y=0;y<=su ;y++){
			Bank_member_notNo mb = lastinmd;
			if(y!=0){
				if(mb.getLastMember().getAccountNumber()==accountNumber){
					ck =false;
					lastinmd = mb.getLastMember();
				}
			}else{
				lastinmd = mb.getLastMember();
			}
		}
		return ck;
	}
	
	//�α���
	public static boolean checkMembr(int su,int accountNumber,String pass){
		boolean ck = false;
		for(int y=0;y<=su ;y++){
			Bank_member_notNo mb = lastinmd.getLastMember();
			if(mb.getAccountNumber()==accountNumber && mb.getPassword().equals(pass)){
				loginmd = mb;
				ck = true;
			}
			if(y!=0){
				lastinmd = mb.getLastMember();
			}else{
				lastinmd = mb;
			}
		}
		return ck;
	}

	// ���¹�ȣ �޴� �żҵ�
	public static int accountRandom() {
		int account = 0;
		for (int i = 1; i < 10001;) {
			int a = (int) ((Math.random() * 10));
			if (a >= 2 && a <= 7) {
				account += a * i;
				i *= 10;
			}
		}
		return account;
	}
}
