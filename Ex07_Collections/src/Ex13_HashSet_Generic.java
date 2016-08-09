import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex13_HashSet_Generic {
	public static void main(String[] args) {
//		HashSet<> hs = new HashSet<>();
//		Set<E> hs = new HashSet();
		Set<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("V");
		hs.add("Q");
		hs.add("B");
		System.out.println(hs.toString());
		
		//새로운 식구
		//중복값 > 입력 순서는 유지했으면
		Set<String> hs2 = new LinkedHashSet<String>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("C");
		hs2.add("D");
		hs2.add("E");
		hs2.add("V");
		hs2.add("Q");
		hs2.add("B");
		System.out.println(hs2.toString());
		
		//TreeSet (자료구조에서 자주쓰임)
		//이진트리(알고리즘(정렬,검색)
		//기본적으로 [정력 ] 이되고 많은 양의 데이터를 저장 하는데 효율적
		//검색 속도가 빠르다
		//중복데이터 제거 , 정력기능까지 제공
		Set<String> hs3 = new TreeSet<String>();
			hs3.add("B");
			hs3.add("A");
			hs3.add("F");
			hs3.add("C");
			hs3.add("D");
			hs3.add("E");
			hs3.add("V");
			hs3.add("Q");
			hs3.add("B");
			System.out.println(hs3.toString());
			
			
		//TreeSet 로또 (1~45) 중복 제거 연동
		Set<Integer> hs4 = new TreeSet<Integer>();
		for(int i = 0 ; hs4.size() <6 ; i++){
			int num = (int)(Math.random()*45)+1;
			hs4.add(num);
		}
		System.out.println(hs4.toString());
		
	}
}
