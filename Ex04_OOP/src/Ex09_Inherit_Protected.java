class Bird{
   void fly() {
       System.out.println("I am flying");
   }
   protected void moveFast() {//����ϸ� ������ ���־����� ���ڴµ�?
      fly();
   }
}

class Ostrich extends Bird {
 void run() {
     System.out.println("�޸���");
 }
 @Override
 protected void moveFast() {
    run();
 }
}

class Sprrow extends Bird{
	
}
public class Ex09_Inherit_Protected {
	public static void main(String[] args) {
		Ostrich t = new Ostrich();
		t.moveFast();
		
		Sprrow  s = new Sprrow();
		s.moveFast();
	}

}
