//���� ����
//���� �Ա� , ���
//�������� ���� ���¿� ���ÿ� �� ��� ó��

class Account{
	int balance =1000;//�ܾ�
	
	public synchronized void withDraw(int money){
		System.out.println("���� :" + Thread.currentThread().getName());
		System.out.println("���� �ܾ� :" + this.balance);
		if(balance >= money){
			try{
				Thread.sleep(1000);//ó�� �Ǵ� ���� Ÿ��
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			balance -= money;
		}
		System.out.println("���� �ݾ� : " + money);
		System.out.println("������ �ܾ� :"+this.balance);
	}
	
}

class Bank implements Runnable {
	Account acc = new Account();//���� ����
	
	@Override
	public void run() {
		while(acc.balance >0){
			int money = (int)(Math.random()*3+1)*100;
			//�� ��� ó��
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
		//���ÿ� 3���� ����ڰ� ���� ���¿� ���ؼ� ���ó��
		
		
	}
}