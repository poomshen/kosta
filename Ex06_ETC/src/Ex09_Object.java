class Person{//default extends Object
	int data;
	public Person(int data) {
		this.data = data;
	}
}

class Emp{
	@Override
	public String toString() {
		return "object 재정의";
	}
}

public class Ex09_Object {
	///이것을 설명한 이유는 무엇일까?
	public static void main(String[] args) {
		Person  p = new Person(12345);///값을 넣었어 응.. 이해 했어
		Person  p2 = new Person(789);
		
		System.out.println("Object equals : "+ p.equals(p2)); ///비교 했어 음 당근 다른 값이야 근데 주소값이라는 걸로 생각하자
		System.out.println(p.hashCode());///차이를 보여 주기 위해서 해쉬 코드를 해서 보여 주셨어 음.~그래 이해 되
		System.out.println(p2.hashCode());
		System.out.println("Object toString() : "+ p.toString());///그래 toString을 해서 보여주는거라는건 알겠음
		System.out.println("Object toString() : "+ p2.toString());
		
		Emp  e = new Emp();         ///여긴 왜 불러 온거지?겨우 오버라이딩을 보여 줄려고?
		System.out.println(e.toString());//재정의
		
		Person p3 = p2; //p2 가지지고 있는곳 은 주소값          ///여긴는 p3=p2를 넣으라는 거야 그래서 같은 값 나온는거고 그래서 알려 주고 자 하는게 뭐지?
		System.out.println("Object equals : "+ p2.equals(p3));
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		//instanceof 같은 복용하시면 타입 비교
		// 여러분인 원하면 필요에 따라서 (equlals, toString ) 재정의
		
		//// 생각해보건데 이건 그냥 오브젝트도 타입이란걸 설명 하시려고 한것 같아 그리고 값의 변화에 대한 초보자 설명 이라 생각되네
		/// 따로 노트 정릴 할 필요 는 없을 것같지만 한번 생각 해보자
	}
}
