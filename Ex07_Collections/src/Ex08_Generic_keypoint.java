import java.util.ArrayList;

//제너릭 (Generic)
//JDK1.5
//C# ,JAVA  에서 모두 필수 기능
//개발자
//1.사용시 타입 안정성 확보 (타입을 강제 한다 ) > Object 타입 탈피
//2.형 변환시 갇 타입에 맞는 형변환 불합리 해결
class Person{
	int age = 100;
}

//제네릭 클래스 만들어 보기
// T 라는 하는 것은 : Type Paramter
class MyGen<T>{
	T obj;
	void add(T obj){
		this.obj = obj;
		}
	T get(){
		return obj;
	}
}

class car{
	String carname;
	public car(String carname) {
		this.carname = carname;
	}
	String  getCarnme(){
		return this.carname;
	}
}

public class Ex08_Generic_keypoint {
	public static void main(String[] args) {
		ArrayList list  = new ArrayList<>();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");
		//출력
//		System.out.println(list.get(0));
//		System.out.println(((Person)list.get(1)).age);
//		System.out.println(list.get(2));
		for(Object ob:list){
//			if(ob==list.get(1)){
			if(ob instanceof Person){
				System.out.println(((Person)ob).age);
			}else{
				System.out.println(ob);
			}
		}
		
		/*
		 	ArrayList list  = new ArrayList<>();
			list.add(500);
			list.add(new Person());
			list.add("홍길동");
			만약에 데이터 add 한 종류의 타입만 강제 할 수 있는 방법이 없을 까?
			
			숫자만 넣을 수 있고 
			객체만 넣을 수 (정해진 타입)
		*/
		ArrayList<Integer> inList = new ArrayList<Integer>();
		inList.add(100);
		
		ArrayList<String> stringlist = new ArrayList<String>();
		stringlist.add("A");
		stringlist.add("B");
		stringlist.add("C");
		for(String s : stringlist){
			System.out.println(s);
		}
		
		ArrayList<Person> personlist= new ArrayList<Person>();
		personlist.add(new Person());
		personlist.add(new Person());
		
		//식사 generic 클래스 만들기,,,
		
		/*class MyGen<T>{
			T obj;
			void add(T obj){
				this.obj = obj;
				}
			T get(){
				return obj;
			}
		}*/
		
		MyGen<String> mygen = new MyGen<String>(); 
		mygen.add("AA");
		System.out.println(mygen.get());
		
		MyGen<Integer> mygen2 = new MyGen<Integer>();
		mygen2.add(100);
		System.out.println(mygen2.get());
		
		ArrayList<String> alList = new ArrayList<>();
		alList.add("어레이리스트");
		
		//Car 타입을 강제하는  ArrayList 만드시고
		//Car 2개을 넣어 보세요
		ArrayList<car> car1 = new ArrayList<car>();
		car1.add(new car("현대차"));
		car1.add(new car("람보르기니차"));
		
		for(car a : car1){
			System.out.println(a.carname);
		}
		
	}
}
