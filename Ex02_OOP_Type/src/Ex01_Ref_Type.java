import kr.or.kosta.Person;
import kr.or.kosta.Tv;

//kr.or.kosta.package 안에 있는 Person 설계도를
//가지고 구체화 된 산물(객체,인스턴스) 생성
public class Ex01_Ref_Type {

	public static void main(String[] args) {
		Person p;//선언: person타입 ,p변수(참조변수,객체변수)
//		System.out.println("p 변수 값"+p);
		p = new Person();
		//위 코드는 변수의 선언과 할당을 분리
		System.out.println("p값 :"+p);
		
		Person p2 = new Person();//선언과 할당 같이
		System.out.println("p2값  :" + p2);
		
		p.age = 100;
		p.name = "홍길동";
		System.out.printf("이름은 %s 이고,나이는 %d 입니다.\n",p.name,p.age);
		
		System.out.println(p==p2);
		
		p2 = p;//p라는 참조변수가 가지고 있는 값을 p2 할당
		System.out.println(p==p2);
		System.out.printf("이름은 %s 이고,나이는 %d 입니다.\n",p2.name,p2.age);
		
		
		//Tv라는 설계도를 가지고 객체를 만들고
		//브랜드 이름과 채널정보를 출력해보세요
		Tv tv=new Tv();
		tv.brandname ="삼성";
		tv.ch = 5 ;
		tv.ch_Down();
		tv.ch_Down();
		System.out.println("tv 브랜드 이름 :"+tv.brandname);
		System.out.println("tv의 채널 정보 :"+tv.ch);
		
		//실제 주소값이라고 봐도 무방하다.(주소값)
		System.out.println("tv hashcode() :"+ tv.hashCode());
		
		Tv tv2 =new Tv();
		System.out.println("tv2 hashcode()"+ tv2.hashCode());
		
		tv2 = tv ;
		System.out.println("주소값 할당 이후");
		System.out.println("tv hashcode() :"+ tv.hashCode());
		System.out.println("tv2 hashcode()"+ tv2.hashCode());
		
		
		System.out.println("주소값 :"+tv);
		System.out.println("주소값 :"+tv2);
		//kr.or.kosta.Tv@1b6d3586
		//클래스 이름 +@문자 +주소값 결합 결과 출력
		
		//오늘부터 하려는 건 ~>
		//설계도를 만들고 설계도를 기반으로 집을 짓는 행위(현실)
		//class 만들고 클래스를 메모리에 올려서 객체로 만드는 행위를 하고...
		
		
	}

}
