package teamFunction;

import java.util.concurrent.SynchronousQueue;

public class thread_t extends Thread {

	@Override
	public void run() {
		System.out.println("��Ī ���Դϴ�");
		String msg = ".";
		try {
			for(int y =0 ; y<2 ; y++){
			thread_t.sleep(800);
			for(int i = 0; i<4 ; i++){
			thread_t.sleep(800);
			System.out.print(msg);
			}
			System.out.println();
			}
			System.out.println("��Ī�� �Ϸ� ����ϴ�.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
