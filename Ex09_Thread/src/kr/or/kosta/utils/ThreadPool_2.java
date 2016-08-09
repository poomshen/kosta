package kr.or.kosta.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*
 Executors.newCachedThreadPool()
������ ���� ������ ���� ���� ����� ������Ǯ �������, 
���ο� ������ ���� ��û�� ���ö����� �ϳ��� �����带 �����Ѵ�.
������ ����� ��������� �ٷ� ������� �ʰ� 1�е��� ����ִٰ� �ٸ� �۾� ��û�� ������ �������. 
ª�� �ݺ��Ǵ� ��Ÿ���� �۾���û�� ���� ��� �����ϴ�. 
 */
class Task2 implements Runnable {
	private String name;

	public Task2(String name) {
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
public class ThreadPool_2 {

	public static void main(String[] args) {
	    ExecutorService executorService = Executors.newCachedThreadPool();
	      int i=0;
	      for (i=0;i<2;i++) {
	        executorService.execute(new Task2("Task2"+i));  // 2���� ������ ������û
	      }      
	      // ���� Ǯ ������ ũ�� Ȯ��
	      System.out.println("cached thread pool size was "+ ((ThreadPoolExecutor) executorService).getPoolSize());
	      
	      try {Thread.sleep(70*1000);}catch(Exception e){}; // 1�� 10�� ���� ��ٸ�(60�� �� ������ Ǯ ������ ����Ȯ�� ����)
	      System.out.println("cached thread pool size was "+ ((ThreadPoolExecutor) executorService).getPoolSize());
	      
	      executorService.shutdown();
	      while (!executorService.isTerminated()) {
	    	  
	      }
	      System.out.println("tasks are completed");
	

	}

}
