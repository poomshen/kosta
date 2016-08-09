package data_bank;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Bank_Main_notNo {
	static int memberSu =0;
	static Bank_member_notNo loginmd = new Bank_member_notNo();
	static Bank_member_notNo lastinmd = new Bank_member_notNo();

	public static void main(String[] args) {
		// 회원가입 입금 출금 정보확인 계좌입금 종료
		Scanner sc = new Scanner(System.in);
		boolean login = false;
	while (true) {
			System.out.println("@@@@@@@@안녕하세요 3조 은행입니다.@@@@@@@@");
			int choice = 0;
			if (!login) {
				System.out.println("1.회원가입 2.로그인 3.입금 4.출금 5.계좌입금 6.정보출력 7.종료");
				choice = Integer.parseInt(sc.nextLine());
			} else {
				System.out.println("1.회원가입 2.로그아웃 3.입금 4.출금 5.계좌입금 6.정보출력 7.종료");
				choice = Integer.parseInt(sc.nextLine());
			}
			switch (choice) {
			case 1: // 회원가입
				if (login) {
					System.out.println("이미 회원이 되어 있습니다.");
					break;
				}
//				Bank_member mb = memberAdata(memberSu);
				System.out.println("이름은 무엇입니까?:");
				String name = sc.nextLine();
				System.out.println("비밀번호는 무엇입니까?");
				String pass = sc.nextLine();
				System.out.println("선 입금할 금액을 넣어 주세요");
				int money = Integer.parseInt(sc.nextLine());
				int acc = accountRandom();
				if(checkMembr(memberSu,name,pass,money,acc)){
					memberSu++;
					login = true;
					System.out.println("회원가입에 성공했습니다.");
					break;
				}else{
					System.out.println("회원가입에 실패했습니다.");
					break;
				}
//				mb.memberInSert(name, pass, money, accountRandom());
//				loginmd = mb;
			case 2:// 로그인
				if(!login){
				System.out.println("로그인 선택 창입니다.");
				System.out.println("계좌번호를 입력해주세요");
				int account = Integer.parseInt(sc.nextLine());
				System.out.println("비밀번호를 입력해주세요");
				String pass1 = sc.nextLine();
				if (checkMembr(memberSu ,account,pass1)){
					login = true;
					System.out.println("로그인이 성공했습니다.");
					break;
				}else{
					System.out.println("계좌번호, 비밀번호 가 틀렸습니다. ");
					break;
				}
				}else{
					System.out.println("로그아웃이 되었습니다.");
					login = false;
					break ;
				}
			case 3:// 입금
				if (login) {
					System.out.println("돈을 입금 하세요");
					int inMoney = Integer.parseInt(sc.nextLine());
					loginmd.inMoney(inMoney);
					loginmd.inCountup();
					break;
				} else {
					System.out.println("로그인이 안되였습니다.");
					break ;
				}
			case 4:// 출금
				if (login) {

					System.out.println("출금할 금액을 입력하세요");
					int outMoney = Integer.parseInt(sc.nextLine());
					int out = loginmd.outMoney(outMoney);
					if (outMoney > loginmd.getMoney()) {
						System.out.println("잔돈이 부족합니다. 현재 가지고 있는돈은" + out);
					} else {
						System.out.println("돈을 출력 합니다." + outMoney + "원이 나왔습니다.");
						loginmd.outCountup();
					}
					break;
				} else {
					System.out.println("로그인이 안되였습니다.");
					break ;
				}
			case 5:// 계좌 입금
				if (login) {
					System.out.println("입금하실 계좌를 입력하세요");
					int getAccoun =Integer.parseInt(sc.nextLine());
					if(checkMembr(memberSu,getAccoun)){
					System.out.println("돈을 입금 하세요");
					int inMoney = Integer.parseInt(sc.nextLine());
					loginmd.inMoney(inMoney);
					loginmd.inCountup();
					break;
					}else{
						System.out.println("등록된 계좌가 없습니다.");
					}

				} else {
					System.out.println("로그인이 안되였습니다.");
					break ;
				}
				break;
			case 6:// 정보 출력
				if (login) {
					loginmd.memberPrint(loginmd.getAccountNumber());

				} else {
					System.out.println("로그인이 안되였습니다.");
					break ;
				}
				break;
			case 7:  
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			case 0:break;
			default:
				System.out.println("1~6까지의 숫자만 입력 하세요");
				break ;
			}
		}
	}

	// 회원입력
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
	
	//전회원확인- 계좌체크 후 가입 
	public static boolean checkMembr(int su, String name,String pass,int money ,int account){
		boolean ck = true;
		for(int y=0;y<=su ;y++){
			if(y>0){
				System.out.println("계좌번호"+account);
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
	//전회원확인- 계좌체크 
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
	
	//로그인
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

	// 계좌번호 받는 매소드
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
