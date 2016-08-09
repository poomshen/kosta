import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//ArrayList (key point)


public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		System.out.println(arraylist.size());
		for(int i = 0; i<arraylist.size(); i++){
			System.out.println(arraylist.get(i));
		}
		//자료구조 측면
		System.out.println("현재 : [0] :" +arraylist.get(0));
		arraylist.add(0, 111);
		System.out.println("현재 : [0] :" +arraylist.get(0));
		//정적(overwrite)
		//중간에 데이터 삽입 : (나머지를 뒤로 밀립니다.)
		System.out.println(arraylist.toString());
		//데이터 추가, 삭제 (성능고려)
		//순차적인 데이터 추가 삭제
		
		//처음하면(함수의 사용) 이 중요
		System.out.println(arraylist.contains(200));//너 200을 가지고 있니?
		System.out.println(arraylist.contains(202));
		
		System.out.println(arraylist.isEmpty());//너 비어있니?
		arraylist.clear();
		System.out.println(arraylist.isEmpty());//너 비어있니?
		System.out.println("size() : "+arraylist.size());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		arraylist.add(104);
		arraylist.add(105);
		System.out.println(arraylist.toString());
		
	      ArrayList list = new ArrayList();
	      list.add("가");
	      list.add("나");
	      list.add("다");
	      list.add("가");
	      System.out.println(list.toString());
	      list.remove("가");      //같은 값중에서 제일 첫번째 값 삭제
	      System.out.println(list.toString());
		
		Object object =  arraylist.remove(0);
		System.out.println(object);
		
		System.out.println(arraylist.toString());
		
		//ArrrayList = implements List
		//List 는 ArrayList의 부모 타입이다.
		
		//부모타입       자식타입
		//List a = new ArrayList();
		//단 자신의 것 만 볼수 있다.
		
		//인터페이스의 명시적 접근 방법
		//다형성 - List 인터페이스 > Arraylist , vector 구현
		//ArrayList 부모는 List 이다
		//다형성 : 상속관계에서 부모타입 참조변수 자식의 여러객체를 참조가능
		//Java API 코드는 다형성을 선호
		
		List list2 = arraylist.subList(0, 2);//arraylist.sublist는 부모의 List를 던져준다.
		//장점 : list 인터페이스의 자원(지관적)
		//인터페이스는 반드시 구현되어야 (동작 되는 코드는 ArrayList 재정코드)
		System.out.println(list2.toString());
		list2.add(333);
		list2.add(444);
		System.out.println(list2.toString());
		
		
		//다운캐스팅 부모가 자식 타입으로 
		try {
			ArrayList list3  = (ArrayList)arraylist.subList(0, 2);
		} catch (Exception e) {
//			System.out.println(e.getLocalizedMessage());
		}
		
		//다형성 복습 
		
		
		ArrayList alist = new ArrayList<>();
		alist.add(50);
		alist.add(5);
		alist.add(10);
		alist.add(4);
		alist.add(9);
		alist.add(45);
		
//		Collections.reverse(alist);//뒤집기
		System.out.println(" ss"+alist.toString());
		Collections.sort(alist);//오름차순
		System.out.println("sss"+alist.toString());
		Collections.reverse(alist);//뒤집기 내림차순이 됨
		System.out.println("dd"+alist.toString());
		
	}
}
