//다형성
//다형성: 여러가지 성질 (형태)를 가질 수 있는 능력
//다형성 범위 : Overloading , Override (MS 포함)

//다형성: [상속] 관계에서 존재
//		하나의[ 참조 변수]가 [여러개의 타입]을 가질 수 있다.
//      조상클래스 타입의 참조변수로 자식 클래스에 객체를 참조할수 있음

//Java 
//자식은 부모에게 조건없이 드린다.

class Tv2{ //부모 (일반화, 추상화 ) 공통기능
	boolean power ; 
	int ch;
	void Power(){
		this.power = !this.power;
	}
	void Chup(){
		ch++;
	}
	void Chdown(){
		ch--;
	}
}

class CapTv extends Tv2{ //CapTv 특수화 , 구체화된 내용만 구현
	String text;
	String caption(){
		return this.text = "자막처리...";
	}
}


public class Ex11_Inherit_poly {
	public static void main(String[] args) {
		CapTv ctv = new CapTv();
		ctv.Power();
		System.out.println(ctv.power);
		
		ctv.Chup();
		System.out.println(ctv.ch);
		System.out.println(ctv.caption());
		ctv.Chdown();
		
		Tv2 t2 = ctv;//ctv(참조변수) 주소값 (CapTv 객체의)
//		System.out.println(ctv.toString());
//		System.out.println(t2.toString());
		//다향성
		//t2 자신의 것 (Tv2타입의 객체만 볼수 있다)
		t2.Chup();
		System.out.println("자식 : "+ ctv.ch);
		System.out.println("자식 : "+ t2.ch);
		//메모리 절약 용도?
		
		
		//부모는 자식에게 (조건)
		CapTv cc = (CapTv)t2;// 명시적인 캐스팅이 필요합니다.
		
		
		System.out.println(cc == t2);
		System.out.println(t2 == ctv);
		
		//자식은 부모에 조건없이
		Tv2 tt = new Tv2();
		t2 = tt;
	
		
		
	}
}
