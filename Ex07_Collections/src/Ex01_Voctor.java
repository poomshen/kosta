import java.util.Vector;

/*
	collecton FrameWork
	표준화 된 인터페이스를 구현하고 있는 클래스 장점

	Collection 인터페이스 -> List -> 구현 클래스 (ArrayList)
						-> Set  -> 구현 클래스 (HashSet)
	Map인터페이스 -> 구현 클래스 (HashMap)
	
	List 인터페이스(줄을 서시오)
	순서(0) 중복(0) -> 내부적으로 데이터 관리(배열)
	ex)대기자 이름(번호표)
	Vector(구)  -> 동기화(멀티스레드) 내부적으로 lock 장치
	ArrayList(신)  - > 동기화 보장(x) - > 동기화 사용 가능  -> 좀더 빠른 성능 -> 활용도 (0)
	
	//정적(Array)  <-> 동적(컬렉션)
	
	[정적 Array]
	1.배열의 크기가 고정 (int [] arr  = new int[10], arr2 ={10,20})
	2.배열의 접근 방법(index) > index 값을 알아야 특정 위치에 접근
	3.초기에 설정한 배열의 크기를 변경할 수 없다.(point)
	
	[동적 Collection: 집합, 군]
	List 인터페이스..
	1.배열의 크기를 동적으로 확장 (배열의 재할당)
	2.순서를 유지(내부적으로 index 값을 갖는다.), 중복값 허용
	3.데이터 저장 공간 배열(배열의 타입 : Object ) > private Object[] data;
	4.추후 Object[] 극복 > 제너릭 기능을 통해서 해소 가능
	5.쉽다
	
*/
public class Ex01_Voctor {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add(100);
		System.out.println(v.toString()); //재정의가 되어 있다.
		for(int i = 0 ; i < v.size() ; i++){
			System.out.println(v.get(i));
		}
		//특정 위치
		System.out.println("특정위치 : get(index) :" + v.get(1));
		
		for(Object s : v){
			System.out.println(s);
		}
		//그래서 위 같은 Object 사용하는 문제점을 해결
		//generic (객체를 만들때 필요한 타입을 강제
		
		Vector<String> v2 = new Vector<String>();
		v2.add("1000");
		v2.add("그렇군요");
		for(String s : v2){
			System.out.println(s);
		}
		System.out.println(v2.toString());
		System.out.println("Collection 크기: size() : "+v2.size());
		System.out.println("Collection 수용능력 :"+v2.capacity());

		Vector v3 =new Vector();
		System.out.println(v3.capacity());//default 비이커의 용량
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("size :"+ v3.size());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("size :" +v3.size());
		System.out.println(v3.capacity());//기본 비이커의 용량 *2
		
		
	}
}
