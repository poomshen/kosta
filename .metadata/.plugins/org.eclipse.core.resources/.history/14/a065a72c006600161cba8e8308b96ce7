import kr.or.kosta.Singleton;


//1.여러개의 객체를 생성하더라도 하나의 주소만 참조
//2.객체를 같이 사용하려고
//3.한객체만 만들어 쓰려고
//4.한 객체만 사용해서 유지보수 편리성
//5.
public class Ex10_Singleton_main {
	
	//하나의 객체를 생성해서 공유하는 방법 패턴
	//싱글톤 패턴
	//문법적인 것만 해석
	public static void main(String[] args) {
	Singleton s	= Singleton.getInstance();
	Singleton s2= Singleton.getInstance();
	Singleton s3= Singleton.getInstance();
	
	System.out.println(s+ " : " +s2 + " : " +s3);
	System.out.println(s ==s2 );
	System.out.println(s ==s3 );
	}
}
