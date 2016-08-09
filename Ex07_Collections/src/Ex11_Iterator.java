import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Collection FrameWork
//표준화 (약속)
//순차적인 데이터 read , romove 할 수있는 표준 제공
//표준 인터페이스 : Iterator
//Enumeration(구버전)
//Iterator (신버전) : 순방향 (hasNext(), Next(),Remove())
//ListIterator(신버전): 순방향 + 역방향

//ArrayList 는 Iterator 구현하고 있다.
//Iterator<T> iterator() ArrayList 가지고 있다.
public class Ex11_Iterator {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		for(int i = 0; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
		///표준화된 인터페이스 통해서
		// 인터페이스 명시적 접근법
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println("["+ it.next()+"]");
		}
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(400);
		intlist.add(500);
		intlist.add(600);
		intlist.add(700);
		
		//Iterator
		Iterator<Integer> ilist2 = intlist.iterator();
		while(ilist2.hasNext()){
			System.out.println(ilist2.next());
		}
		
		//for문 사용해서 역방향 (600,500, 400)
		for(int i=intlist.size()-1 ; i>=0 ; i--){
			System.out.println(intlist.get(i));
		}
		
		//ArrayList 구현 (ListIterator 구현)
		ListIterator<Integer> init3 = intlist.listIterator();
		//Iterator는 한방향으로 흐르기 때문에 한번 끝까지 갔다가 뒤로 돌아 가야 하는 방식를 써야한다.
		while(init3.hasNext()){
			System.out.println(init3.next());
		}
		while(init3.hasPrevious()){
			System.out.println("[" +init3.previous() +"]");
		}
		
	}
	
}
