
public class Ex07_Daemon_Thread implements Runnable {

	static boolean autosave = false;
	public static void main(String[] args) {
		Thread th = new Thread(new Ex07_Daemon_Thread());
		th.setDaemon(true); //start 하기 전에 설정 (main Thread 보조)
		th.start();
		
		//main Thread  
		for(int i = 1 ; i <= 30 ; i++){
			try{
				Thread.sleep(1000); //1초
			}catch (Exception e) {
				 System.out.println(e.getMessage());
			}
			System.out.println("Main Thread : "  + i);
			if(i == 5){
				autosave = true; //i가 5가 되면 autosave > true
			}
		}
		
		
	}

	@Override
	public void run() {
		while(true){
			try{
				Thread.sleep(3000); //3초
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			//조건
			if(autosave){ //autosave = false > true 가지면
				 AutoSave();
			}
			
		}		
	}

	public void AutoSave(){
		System.out.println("문서가 자동 저장 되었습니다^^");
	}
}
