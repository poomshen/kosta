package Quze;
class tongue extends Thread{
	String tong = "";
	String name;
	public tongue(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0; i<10 ; i++){
			try {
				Thread.sleep(600);
				tong += "■";
				System.out.print(name + tong);
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"완주 완료");
	}
}

class runing extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++){
		
		}
	}
}
public class Game {
	public static void main(String[] args) {
		runing  t = new runing();
		t.start();
		tongue ru = new tongue("1번:");
		ru.start();
		tongue ru2 = new tongue("2번:");
		ru2.start();
		tongue ru3 = new tongue("3번:");
		ru3.start();
		tongue ru4 = new tongue("4번:");
		ru4.start();
	}
}
