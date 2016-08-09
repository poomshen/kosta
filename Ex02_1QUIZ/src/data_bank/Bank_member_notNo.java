package data_bank;

public class Bank_member_notNo {
//	
//	회원 - 비밀번호,이름,돈,계좌번호,입금실행횟수,출금실행횟수 -전에있던회원주소값
	private Bank_member_notNo lastMember;
	//이름
	private String name;
	//비번
	private String password;
	//돈
	private int money;
	//계좌번호
	private int accountNumber;
	//입금실행횟수
	private int inCount;
	//출금실행횟수
	private int outCount;
	
	
	//전회원
	public Bank_member_notNo getLastMember() {
		return lastMember;
	}

	public void setLastMember(Bank_member_notNo lastMember) {
		this.lastMember = lastMember;
	}

	//이름
	public String getName() {
		return name;
	}
	
	//비번
	public String getPassword() {
		return password;
	}
	
	
	//돈
	public int getMoney() {
		return money;
	}
	//출금
	public int outMoney(int outMoney){
		if(outMoney >money){
			System.out.println("잔돈이 부족 합니다.");
		}else if(outMoney == money){
			this.money =0;
		}else {
			money -= outMoney; 
		}
		return money;
	}
	//입금
	public int inMoney(int inMoney){
		money += inMoney;
		return money;
	}

	//계좌번호
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//입금 카운트
	public int getInCount() {
		return inCount;
	}
	public void inCountup() {
		inCount++;
	}
	
	//출금 카운트
	public int getOutCount() {
		return outCount;
	}
	public void outCountup() {
		outCount++;
	}
	
	//계좌번호를 받아서 확인 하는
	public void memberPrint(int accountNumber){
		if(this.accountNumber == accountNumber){
			System.out.printf("%s 회원님의 정보는: 잔액 : %d , 자신의 계좌 번호 %d  \n 입금 실행 횟수 : %d, 출금 실행 횟수 : %d \n" ,name ,money,accountNumber,inCount ,outCount);
		}else {
			return;
		}
	}
	
	//회원가입
	public void memberInSert(String name,String pass,int money ,int account){
		this.name = name;
		this.password =pass;
		this.money =money;
		this.inCount =0;
		this.outCount = 0;
		this.accountNumber =account;
		
	}
	public void memberInSert(String name,String pass,int money ,int account,Bank_member_notNo inMember){
		this.name = name;
		this.password =pass;
		this.money =money;
		this.inCount =0;
		this.outCount = 0;
		this.accountNumber =account;
		this.lastMember = inMember;
		
	}
	public void memberInSert(Bank_member_notNo inMember){
		this.name = inMember.name;
		this.password = inMember.password;
		this.money = inMember.money;
		this.inCount = inMember.inCount;
		this.outCount = inMember.outCount;
		this.accountNumber = inMember.accountNumber;
		this.lastMember = inMember.lastMember;
		
	}
	
}
