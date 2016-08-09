package kr.or.kosta.utils;
//Executors.newFixedThreadPool(10)
//최대 쓰레드를 10개까지 만드는 풀.  동시에 일어나는 
//업무의 량이 비교적 일정할때 사용한다.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//쓰레드에서 수행될 Task class
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
	        // 3번 연속으로 쓰레드 수행 요청
	      }
	      executorService.shutdown(); 
	      // 더이상의 쓰레드 요청은 받지 않음. 필요없으면 닫아줄것것

	      while (!executorService.isTerminated()) { 
	    	  // 모든 쓰레드가 업무를 완료할때까지 대기
	      }
	      System.out.println("All tasks are completed"); // 모든 업무 완료
	

	}

}
/*
2개 짜리 Fixed Thread Pool을 생성한후에 execute를 사용해 연속적으로 3개의 Task를 수행시도했다. 각  타스크는 1초씩의 시간이 걸리는 일이다. 
Task0 과 Task1은 각기 pool-2-thread-1 와 pool-2-thread-2 쓰레드에서 바로 수행되었으나,
Task2는 Task1이 완료된 이후에야 실행될수 있었다.


*/