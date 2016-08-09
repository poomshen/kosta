import kr.or.kosta.Pclass;


//상속관계에서 Protected 진짜 의미

/*class AAA{
	protected void method(){
		
	}
}
class BBB extends AAA{
	void m(){
		method();
	}
}*/


class Dclass{
	private int i;
	public int j;
	protected int k ;// 상속관계에서 사용
	
}
class Fclass2 extends Pclass{
	
}

class Fclass extends Dclass{
	
	void fmethod(){
//		this.i 는 private 이라서 접근이 불가하다.
		j = 500;
		k = 600; //protected는 상속 관계에서는 접근이 가능하다.
		//다른 폴더(package)클래스에서 접근 불가
	}
}
public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Fclass f = new Fclass();
		f.k = 2000;
		System.out.println(f.k);//접근 가능 (protected 이어도) why: 같은 폴더
		
		
		Pclass p= new Pclass();
//		p.tint = 5555;//접근 불가 why:다른 폴더에 있기 때문에
	}
}
