package kr.or.kosta.utils;

import java.util.Random;

//[Thread] 스레드 동기화 효율을 높이는 notify(), notifyAll()
/*
- 동기화 블록에서만 사용 가능하다
- wait(), wait(long timeout)을 사용하면 스레드를 기다리도록 만든다.(시간 지정 가능)
- 기다리던 스레드는 notify() or notifyAll()에 의해 다시 깨어난다.
- 반드시 WATTING 상태의 스레드는 다시 RUNNABLE 상태로 돌아와야 하며 동기화 내부 처리에서 notify()되지 않으면
  IlligalMonitorException 예외가 발생


은행 출금을 할 때 
출금금액이 모자랄 때 
입금될때까지 wait()했다가 
입금되면 notify()

deposit : 입금
withdraw: 출금

Wait() : 다른 Thread에게 제어권을 넘겨주고 대기상태 진입
notify() : Wait() 되었던 것이 다시 실행 상태
-각각은 Thread 가 아닌 object에 정의되어 각 스레드에서 호출 가능
-동기화 블록 내에서만 사용가능( 

*/




class BankAccount {
    //잔고
    int balance = 0;
    int diff = 0;
    
    //출금 메소드, 메소드 전체에 동기화 처리
    public synchronized void withdraw(int money) 
    {
        if(money < 0) {
            System.out.println("인출 금액이 잘못되었습니다.");
            return;
        }
        
        int count = 0;
        
        while(balance < money) {
            System.out.printf("[%s] ", Thread.currentThread().getName());
            //지속적으로 잔금이 부족하면 메소드 종료
            if(++count > 3){
                System.out.println("잔액 부족으로 출금 불가하여 출금처리 못하고 종료합니다.");
                return;
            }
            
            System.out.printf("%s", "wait(1000)호출 : ");
            System.out.printf("인출 요구 금액  = %6d, balance = %6d %n", money, balance);
            
            try{
                //wait()
                wait(1000);
            } catch(InterruptedException e){
                System.err.println(e);
            }
            }
        
        System.out.printf("[%s] ", Thread.currentThread().getName());
        balance -= money;
        System.out.printf(" %12s 정상 인출 금액  = %6d, balance = %6d %n", "정상 출금 처리", money, balance);
    }
    
    //입금 메소드, 블록 동기화
    public synchronized void deposit(int money)
    {
        if(money < 0) {
            System.out.println("입금 금액이 잘못됐습니다.");
            return;
        }
        
        balance += money;
        System.out.printf("[%s] ", Thread.currentThread().getName());
        System.out.printf("%s", "notify() 호출");
        System.out.printf("계좌입금금액 = %6d, balance = %6d %n", money, balance);
        
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


