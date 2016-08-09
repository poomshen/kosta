package kr.or.kosta.utils;

public class ThreadState implements Runnable {
    public void run(){
        for(int i = 1; i < 10; i++){
            try {
                Thread.sleep(40);
                System.out.print(Thread.currentThread().getState() + ", ");
                System.out.println(Thread.currentThread().getName() + ": " +i);
            } catch(InterruptedException e) {
                System.err.println("InterruptedException�� �߻�, ������ ����");
                return;
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
 
    public static void main(String[] args) throws InterruptedException {
        System.out.println("�������� ��� ���� 6���� : ");
        for(Thread.State c : Thread.State.values())
            System.out.print(c + ", ");
        System.out.println('\n');
        
        Thread th = new Thread(new ThreadState());
        System.out.println("�⺻ �켱 ���� : " + th.getPriority());
        
        //�켱���� ����
        th.setPriority(Thread.NORM_PRIORITY);//5 (1~10)
        System.out.println("�켱 ���� ����: " + th.getPriority());
        
        //������ ���� Ȯ��
        //1. NEW
        System.out.println("1 : " + th.getState());
        //2. RUNNABLE
        th.start();
        System.out.println("2 : " + th.getState());
        //3. TIMED_WATING
        Thread.sleep(130);
        th.interrupt();
        System.out.println("3 : " + th.getState());
        //4. TERMINATED
        Thread.sleep(1000);
        System.out.println("4 : " + th.getState());
    }
 
}
 


