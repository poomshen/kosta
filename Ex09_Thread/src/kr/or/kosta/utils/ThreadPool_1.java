package kr.or.kosta.utils;
//Executors.newFixedThreadPool(10)
//�ִ� �����带 10������ ����� Ǯ.  ���ÿ� �Ͼ�� 
//������ ���� ���� �����Ҷ� ����Ѵ�.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//�����忡�� ����� Task class
class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Thread ID=" + Thread.currentThread().getName() + "  task name=" + name + " start");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		;
		System.out.println("Thread ID=" + Thread.currentThread().getName() + "  task name=" + name + " end");
	}
}

public class ThreadPool_1 {

	public static void main(String[] args) {
		  ExecutorService executorService = Executors.newFixedThreadPool(2);
	      int i=0;
	      for (i=0;i<3;i++) { 
	        executorService.execute(new Task("Task"+i));
	        // 3�� �������� ������ ���� ��û
	      }
	      executorService.shutdown(); 
	      // ���̻��� ������ ��û�� ���� ����. �ʿ������ �ݾ��ٰͰ�

	      while (!executorService.isTerminated()) { 
	    	  // ��� �����尡 ������ �Ϸ��Ҷ����� ���
	      }
	      System.out.println("All tasks are completed"); // ��� ���� �Ϸ�
	

	}

}
/*
2�� ¥�� Fixed Thread Pool�� �������Ŀ� execute�� ����� ���������� 3���� Task�� ����õ��ߴ�. ��  Ÿ��ũ�� 1�ʾ��� �ð��� �ɸ��� ���̴�. 
Task0 �� Task1�� ���� pool-2-thread-1 �� pool-2-thread-2 �����忡�� �ٷ� ����Ǿ�����,
Task2�� Task1�� �Ϸ�� ���Ŀ��� ����ɼ� �־���.


*/