import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Collection FrameWork
//ǥ��ȭ (���)
//�������� ������ read , romove �� ���ִ� ǥ�� ����
//ǥ�� �������̽� : Iterator
//Enumeration(������)
//Iterator (�Ź���) : ������ (hasNext(), Next(),Remove())
//ListIterator(�Ź���): ������ + ������

//ArrayList �� Iterator �����ϰ� �ִ�.
//Iterator<T> iterator() ArrayList ������ �ִ�.
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
		///ǥ��ȭ�� �������̽� ���ؼ�
		// �������̽� ����� ���ٹ�
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
		
		//for�� ����ؼ� ������ (600,500, 400)
		for(int i=intlist.size()-1 ; i>=0 ; i--){
			System.out.println(intlist.get(i));
		}
		
		//ArrayList ���� (ListIterator ����)
		ListIterator<Integer> init3 = intlist.listIterator();
		//Iterator�� �ѹ������� �帣�� ������ �ѹ� ������ ���ٰ� �ڷ� ���� ���� �ϴ� ��ĸ� ����Ѵ�.
		while(init3.hasNext()){
			System.out.println(init3.next());
		}
		while(init3.hasPrevious()){
			System.out.println("[" +init3.previous() +"]");
		}
		
	}
	
}
