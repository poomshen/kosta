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
				tong += "��";
				System.out.print(name + tong);
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"���� �Ϸ�");
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
		tongue ru = new tongue("1��:");
		ru.start();
		tongue ru2 = new tongue("2��:");
		ru2.start();
		tongue ru3 = new tongue("3��:");
		ru3.start();
		tongue ru4 = new tongue("4��:");
		ru4.start();
	}
}