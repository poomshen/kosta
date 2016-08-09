class Bird{
   void fly() {
       System.out.println("I am flying");
   }
   protected void moveFast() {//상속하면 재정의 해주었으면 좋겠는데?
      fly();
   }
}

class Ostrich extends Bird {
 void run() {
     System.out.println("달린다");
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
