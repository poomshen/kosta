package data_bank;
 
public class Bank_member {
//    
//    ȸ�� - ��й�ȣ,�̸�,��,���¹�ȣ,�Աݽ���Ƚ��,��ݽ���Ƚ��
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
    public boolean outMoney(int outMoney){
        boolean ck = false;
    	if(outMoney >money){
            System.out.println("�ܵ��� ���� �մϴ�.");
            System.out.println("�ܵ��� �����մϴ�. ���� ������ �ִµ���" + money);
            ck= false;
        }else if(outMoney == money){
        	this.money =0;
        	ck = true;
        }else {
            money -= outMoney; 
            ck = true;
        }
        return ck;
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
    
    public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setInCount(int inCount) {
		this.inCount = inCount;
	}

	public void setOutCount(int outCount) {
		this.outCount = outCount;
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
    public void memberInSert(String name,String pass,int money ){
    	this.name = name;
    	this.password =pass;
    	this.money =money;
    	this.inCount =0;
    	this.outCount = 0;
    	
    }
    
}