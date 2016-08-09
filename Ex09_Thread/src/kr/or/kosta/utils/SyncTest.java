package kr.or.kosta.utils;

import java.util.Random;

//[Thread] ������ ����ȭ ȿ���� ���̴� notify(), notifyAll()
/*
- ����ȭ ��Ͽ����� ��� �����ϴ�
- wait(), wait(long timeout)�� ����ϸ� �����带 ��ٸ����� �����.(�ð� ���� ����)
- ��ٸ��� ������� notify() or notifyAll()�� ���� �ٽ� �����.
- �ݵ�� WATTING ������ ������� �ٽ� RUNNABLE ���·� ���ƿ;� �ϸ� ����ȭ ���� ó������ notify()���� ������
  IlligalMonitorException ���ܰ� �߻�


���� ����� �� �� 
��ݱݾ��� ���ڶ� �� 
�Աݵɶ����� wait()�ߴٰ� 
�ԱݵǸ� notify()

deposit : �Ա�
withdraw: ���

Wait() : �ٸ� Thread���� ������� �Ѱ��ְ� ������ ����
notify() : Wait() �Ǿ��� ���� �ٽ� ���� ����
-������ Thread �� �ƴ� object�� ���ǵǾ� �� �����忡�� ȣ�� ����
-����ȭ ��� �������� ��밡��( 

*/




class BankAccount {
    //�ܰ�
    int balance = 0;
    int diff = 0;
    
    //��� �޼ҵ�, �޼ҵ� ��ü�� ����ȭ ó��
    public synchronized void withdraw(int money) 
    {
        if(money < 0) {
            System.out.println("���� �ݾ��� �߸��Ǿ����ϴ�.");
            return;
        }
        
        int count = 0;
        
        while(balance < money) {
            System.out.printf("[%s] ", Thread.currentThread().getName());
            //���������� �ܱ��� �����ϸ� �޼ҵ� ����
            if(++count > 3){
                System.out.println("�ܾ� �������� ��� �Ұ��Ͽ� ���ó�� ���ϰ� �����մϴ�.");
                return;
            }
            
            System.out.printf("%s", "wait(1000)ȣ�� : ");
            System.out.printf("���� �䱸 �ݾ�  = %6d, balance = %6d %n", money, balance);
            
            try{
                //wait()
                wait(1000);
            } catch(InterruptedException e){
                System.err.println(e);
            }
            }
        
        System.out.printf("[%s] ", Thread.currentThread().getName());
        balance -= money;
        System.out.printf(" %12s ���� ���� �ݾ�  = %6d, balance = %6d %n", "���� ��� ó��", money, balance);
    }
    
    //�Ա� �޼ҵ�, ��� ����ȭ
    public synchronized void deposit(int money)
    {
        if(money < 0) {
            System.out.println("�Ա� �ݾ��� �߸��ƽ��ϴ�.");
            return;
        }
        
        balance += money;
        System.out.printf("[%s] ", Thread.currentThread().getName());
        System.out.printf("%s", "notify() ȣ��");
        System.out.printf("�����Աݱݾ� = %6d, balance = %6d %n", money, balance);
        
        //notify();
        notifyAll();
    }
}
 
public class SyncTest implements Runnable {
    BankAccount act = new BankAccount();
    
    public void run()
    {
        for(int i = 1; i < 3; i++){
            int amount = (int)(new Random().nextDouble() * 5 + 1) * 10000;
            act.deposit(amount);
            
            amount = (int)(new Random().nextDouble() * 5 + 1) * 10000;
            act.withdraw(amount);
        }
    }
 
    public static void main(String[] args) 
    {
        Runnable r = new SyncTest();
        
        new Thread(r).start();
        new Thread(r).start();
    }
 
}


