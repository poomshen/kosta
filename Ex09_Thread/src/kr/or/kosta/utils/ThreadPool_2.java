package kr.or.kosta.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*
 Executors.newCachedThreadPool()
쓰레드 수의 제한을 두지 않은 방식의 쓰레드풀 방식으로, 
새로운 쓰레드 시작 요청이 들어올때마다 하나씩 쓰레드를 생성한다.
업무가 종료된 쓰레드들은 바로 사라지지 않고 1분동안 살아있다가 다른 작업 요청이 없으면 사라진다. 
짧고 반복되는 스타일의 작업요청이 들어올 경우 유용하다. 
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
	        executorService.execute(new Task2("Task2"+i));  // 2개의 쓰레드 생성요청
	      }      
	      // 현재 풀 사이즈 크기 확인
	      System.out.println("cached thread pool size was "+ ((ThreadPoolExecutor) executorService).getPoolSize());
	      
	      try {Thread.sleep(70*1000);}catch(Exception e){}; // 1분 10초 동안 기다림(60초 후 쓰레드 풀 사이즈 변경확인 위해)
	      System.out.println("cached thread pool size was "+ ((ThreadPoolExecutor) executorService).getPoolSize());
	      
	      executorService.shutdown();
	      while (!executorService.isTerminated()) {
	    	  
	      }
	      System.out.println("tasks are completed");
	

	}

}
