package data_bank;

public class Bank_member_notNo {
//	
//	ȸ�� - ��й�ȣ,�̸�,��,���¹�ȣ,�Աݽ���Ƚ��,��ݽ���Ƚ�� -�����ִ�ȸ���ּҰ�
	private Bank_member_notNo lastMember;
	//�̸�
	private String name;
	//���
	private String password;
	//��
	private int money;
	//���¹�ȣ
	private int accountNumber;
	//�Աݽ���Ƚ��
	private int inCount;
	//��ݽ���Ƚ��
	private int outCount;
	
	
	//��ȸ��
	public Bank_member_notNo getLastMember() {
		return lastMember;
	}

	public void setLastMember(Bank_member_notNo lastMember) {
		this.lastMember = lastMember;
	}

	//�̸�
	public String getName() {
		return name;
	}
	
	//���
	public String getPassword() {
		return password;
	}
	
	
	//��
	public int getMoney() {
		return money;
	}
	//���
	public int outMoney(int outMoney){
		if(outMoney >money){
			System.out.println("�ܵ��� ���� �մϴ�.");
		}else if(outMoney == money){
			this.money =0;
		}else {
			money -= outMoney; 
		}
		return money;
	}
	//�Ա�
	public int inMoney(int inMoney){
		money += inMoney;
		return money;
	}

	//���¹�ȣ
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//�Ա� ī��Ʈ
	public int getInCount() {
		return inCount;
	}
	public void inCountup() {
		inCount++;
	}
	
	//��� ī��Ʈ
	public int getOutCount() {
		return outCount;
	}
	public void outCountup() {
		outCount++;
	}
	
	//���¹�ȣ�� �޾Ƽ� Ȯ�� �ϴ�
	public void memberPrint(int accountNumber){
		if(this.accountNumber == accountNumber){
			System.out.printf("%s ȸ������ ������: �ܾ� : %d , �ڽ��� ���� ��ȣ %d  \n �Ա� ���� Ƚ�� : %d, ��� ���� Ƚ�� : %d \n" ,name ,money,accountNumber,inCount ,outCount);
		}else {
			return;
		}
	}
	
	//ȸ������
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
