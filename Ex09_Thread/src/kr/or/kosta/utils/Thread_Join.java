package kr.or.kosta.utils;

import java.util.ArrayList;

public class Thread_Join extends Thread {
    int seq;
    public Thread_Join(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {

        }
        System.out.println(this.seq+" thread end.");
    }

    public static void main(String[] args) {
       /* for(int i=0; i<10; i++) {
            Thread t = new Thread_Join(i);
            t.start();
        }
        System.out.println("main end.");*/
    	//�����尡 ��� ����ǰ� ����Ǳ� ���� main �޼ҵ尡 ���� ����Ǿ� ���ȴ�.
    	//�׷��ٸ� ��� �����尡 ����� �Ŀ� main �޼ҵ带 �����
    	 ArrayList<Thread> threads = new ArrayList<Thread>();
    	    for(int i=0; i<10; i++) {
    	        Thread t = new Thread_Join(i);
    	        t.start();
    	        threads.add(t);
    	    }

    	    for(int i=0; i<threads.size(); i++) {
    	        Thread t = threads.get(i);
    	        try {
    	            t.join();
    	        }catch(Exception e) {
    	        }
    	    }
    	    System.out.println("main end.");
    }
}