package Quze;

class Fight extends Thread{
	static int dang =0;
	int Hp =0 ;
	String name;
	
	public void gethp(int hp ,String name){
		this.Hp = hp;
		this.name = name;
	}
	
	public int damage(){
		int dag = 0;
		dag = (int) (Math.random()*3);
		return dag;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<100 ; i++){
			dang = damage();
			Hp -= dang;
			System.out.println(dang+ "맞음");
			
			if(Hp <= 0){
				System.out.println(name + "(이)가 죽었습니다.");
				System.exit(0);
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class Game_2 {
	public static void main(String[] args) {
		int hp_py2 = 30;
		
		Fight py = new Fight();
		Fight py2 = new Fight();
		py.gethp(hp_py2,"명철");
		py2.gethp(30,"성준");
		py.start();
		py2.start();
		
		
	}
}
