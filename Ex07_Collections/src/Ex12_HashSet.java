import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Set 인터페이스 구현하는 클래스
//특징 : 순서(x) , 중복(x)
//HashSet 클래스

public class Ex12_HashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(1);
		hs.add(130);
		hs.add(144);
		System.out.println(hs.toString());
		System.out.println(hs.add(1));//중복 데이터 허락 (x)
		System.out.println(hs.toString());
		
		hs.add("A");
		hs.add("B");
		hs.add("F");
		System.out.println(hs.toString()); //넣은 순서와 상관 없이 출력됨
		
		Object [] obj = {"A","B","A","C","D","B"};
		HashSet hs2 = new HashSet<>();
		for(int i = 0; i<obj.length ; i++){
			hs2.add(obj[i]);
		}
		System.out.println(hs2.toString());//중복값을  배제
		
		//Quiz 
		//다형성
		//습관 처럼
		Set set = new HashSet();
		System.out.println(set.size());
		
		//Quiz (HashSet 사용해서 1~45 까지 난수 6개를 담으세요) 단 중복제거
		int index = 0;
		for(int i = 0 ; set.size() <6 ; i++){
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			System.out.println(++index);
		}
		System.out.println(set.toString());
		
		//나온 값을 sort (오름차순)으로 정렬하고 싶어요
		//set 자원 정렬 (순서(x))
		List list  = new ArrayList(set); //(collection)
		System.out.println(list.toString());
		//helper class > Collections 도와주는 역할(정렬)
		Collections.sort(list); 
		System.out.println("정렬 : "+list.toString());
		//기본적으로 set이라는 집합은 정렬할 수 없는 집합이기 때문에 받아서 정렬해준다.
		
 	}
}
