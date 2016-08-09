//Thread �켱���� (1~10����)
//default : 5 (main : 5 , Thread1 : 5 , Thread2 : 5)
//Max : 10
//Min : 1

class Pth extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 10000 ; i++){
			System.out.println("---");
		}
	}
}
class Pth2 extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 10000 ; i++){
			System.out.println("|||");
		}
	}
}
public class Ex06_priority {
	public static void main(String[] args) {
		Pth pth = new Pth();
		Pth2 pth2 = new Pth2();
		
		
		pth.setPriority(10); // ---�켱���� (CPU ���� Ȯ�� �����ش�)
		pth2.setPriority(1); // ||| 
		
		System.out.println(pth.getPriority());
		System.out.println(pth2.getPriority());
		
		pth.start();
		pth2.start();
	  
		System.out.println("Main END");
	}

}