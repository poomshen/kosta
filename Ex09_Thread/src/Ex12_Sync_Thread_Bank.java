//은행 계좌
//은행 입금 , 출금
//여러명이 같은 계좌에 동시에 입 출금 처리

class Account{
	int balance =1000;//잔액
	
	public synchronized void withDraw(int money){
		System.out.println("고객 :" + Thread.currentThread().getName());
		System.out.println("현재 잔액 :" + this.balance);
		if(balance >= money){
			try{
				Thread.sleep(1000);//처리 되는 업무 타입
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			balance -= money;
		}
		System.out.println("인출 금액 : " + money);
		System.out.println("인출후 잔액 :"+this.balance);
	}
	
}

class Bank implements Runnable {
	Account acc = new Account();//계좌 생성
	
	@Override
	public void run() {
		while(acc.balance >0){
			int money = (int)(Math.random()*3+1)*100;
			//실 출금 처리
			acc.withDraw(money);
		}
	}
}

public class Ex12_Sync_Thread_Bank {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread  th = new Thread(bank,"pack");
		Thread  th2 = new Thread(bank,"Lee");
		Thread  th3 = new Thread(bank,"kim");
		
		th.start();
		th2.start();
		th3.start();
		//동시에 3명의 사용자가 같은 계좌에 대해서 출금처리
		
		
	}
}
