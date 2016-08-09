import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06_ArrayList_LinkedList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		long startTime = 0L;
		long endTime = 0L;
		
		startTime = System.nanoTime();
		for(int i = 0 ; i<100000 ; i++){
			list1.add(0,i);//Ư����ġ (0��°)
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList �ð�:"+(endTime-startTime)+"ns");
	
	
		long startTime2 = 0L;
		long endTime2 = 0L;
		startTime2 = System.nanoTime();
		for(int i = 0 ; i<100000 ; i++){
			list2.add(0,i);//Ư����ġ (0��°)
		}
		endTime2 = System.nanoTime();
		System.out.println("LinkedList �ð�:"+(endTime2-startTime2)+"ns");
		
	}
}
