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
			list1.add(0,i);//특정위치 (0번째)
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 시간:"+(endTime-startTime)+"ns");
	
	
		long startTime2 = 0L;
		long endTime2 = 0L;
		startTime2 = System.nanoTime();
		for(int i = 0 ; i<100000 ; i++){
			list2.add(0,i);//특정위치 (0번째)
		}
		endTime2 = System.nanoTime();
		System.out.println("LinkedList 시간:"+(endTime2-startTime2)+"ns");
		
	}
}
