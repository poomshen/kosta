import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map 인터페이스 구현하는 클래스
//Map  (키, 값 ) 쌍배열
//ex) 지역번호 (02,서울) (033, 경기도)
//키 : 중복 (x) , 값 : 중복(0)


//HashTable(구) : 동기화를 보장
//HashMap(신)   : 동기화를 보장하지 않음 , 성능을 고려
//Generic 지원

//**ArrayList(*****) , HashSet(TreeSet)(***) , HashMap(*****)
public class Ex14_HashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		
		//사용법
		System.out.println(map.containsKey("Tiger"));//대소문자 구별
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));//중복값 상관없이 하나만 있으면
		
		
		//(key , value) pair (쌍)
		System.out.println(map.get("Tiger"));//Key 던지면 value 리턴
		System.out.println(map.get("kglim"));//null 리턴
		
		map.put("Tiger", "1008");//중복 되지는 않지 만 (같은 키가 들어오면) -> value(overwite)
		//덮혀 쓰워짐
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		Object returnvalue = map.remove("scott");//삭제시 > value return
		System.out.println(returnvalue);
		System.out.println(map.size());
		
		map.put("king", "1004");
		System.out.println(map.toString());
		
		
		HashMap map2 = new HashMap<>();
		map2.put("A", "1111");
		System.out.println(map2.toString());
		map2.put("A", "2231");
		System.out.println(map2.toString());
		
		Set keyset =  map2.keySet();//map 지원(key) 뽑아서 new HashSet(); > add();
		 Iterator it = keyset.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		map2.put("B", 1040);
		
		//key point
		Set set =  map.entrySet();//하나로 묶어서 리턴 key = value
		Iterator it2 = 	set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		
	}
}
