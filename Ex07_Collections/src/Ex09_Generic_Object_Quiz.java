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
		Poduct p2 = new Audio();//������ �ڽ� Ÿ���� ��ü�� �θ� ����
		Poduct[] parray = {new Tv(), new Audio() };
		/////////////////////////////////////////////////////
//		�� �ڵ� ���� (Array) ���
		//collection ��ȯ
		//���ʸ��� ���� ������ ����
		ArrayList<Poduct> plist = new ArrayList<Poduct>();
		plist.add(new Tv());
		plist.add(new Audio());
//		plist.add(new NoteBook()); �ֳ��ϸ� ��Ʈ�ϰ� poduct ������ ����
		for(Poduct pro :parray){
			System.out.println(pro.toString());
		}
		
		
	}
}
