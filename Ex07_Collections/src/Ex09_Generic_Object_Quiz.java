import java.util.ArrayList;

class Poduct{}
class Tv extends Poduct{

	@Override
	public String toString() {
		return "Tv";
	}
}
class Audio extends Poduct{
	
}

class NoteBook{
	
}

public class Ex09_Generic_Object_Quiz {
	public static void main(String[] args) {
		Poduct  p = new Poduct();
		Tv t = new Tv();
		Poduct p2 = new Audio();//다형성 자식 타입의 객체를 부모가 참조
		Poduct[] parray = {new Tv(), new Audio() };
		/////////////////////////////////////////////////////
//		위 코드 정적 (Array) 사용
		//collection 전환
		//제너릭을 통한 다형성 적용
		ArrayList<Poduct> plist = new ArrayList<Poduct>();
		plist.add(new Tv());
		plist.add(new Audio());
//		plist.add(new NoteBook()); 왜냐하면 노트북과 poduct 연관성 없음
		for(Poduct pro :parray){
			System.out.println(pro.toString());
		}
		
		
	}
}
