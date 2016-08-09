package kr.or.kosta;

//디자인 패턴
// 싱글톤 패턴

//1.질문 : Singleton s = new Singleton  > default 생성자 > 자동생성 >호출
//>new Singleton() 못하게 막고 싶어요 (단 overloading 금지)

//? 생성자의 접근을 막기


//활용 (시나리오)
//프린터 네트워크 공유()
//DB 공유
public class Singleton {
	private static Singleton p = new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(p == null){
			p= new Singleton();
		}
		return p;
	}
}
