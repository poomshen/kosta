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
    	//쓰레드가 모두 수행되고 종료되기 전에 main 메소드가 먼저 종료되어 버렸다.
    	//그렇다면 모든 쓰레드가 종료된 후에 main 메소드를 종료시
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