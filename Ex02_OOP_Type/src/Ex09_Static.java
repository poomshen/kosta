
public class Ex09_Static {
	public void callmethod(){
		System.out.println("나 함수");
	}
	public static void scallmethod() {
		System.out.println("나 스택 함수");
	}
	public static void main(String[] args) {
		
		//함수를 불러올때는 클래스를 불러와야 한다.
		Ex09_Static static1 = new Ex09_Static();
		static1.callmethod();
//		월래는 이렇게 써야하는데 같은 클래스에서는 생략 가능
//		Ex09_Static.scallmethod();
		scallmethod();
		
	}
}
