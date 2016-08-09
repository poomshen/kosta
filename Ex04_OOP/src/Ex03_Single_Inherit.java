class Tv{
	boolean power ;
	int ch;
	//기능 
	void power(){
		this.power = !this.power;
	}
	void chup (){
		ch++;
	}
	void chdown(){
		ch--;
	}
	
}
class Vcr{ //vcr 을 만들수 있는 설계도
	boolean power ;
	int counter =0;
	
	void power(){
		this.power = !this.power;
	}
	//재생하기
	void play(){
		System.out.println("재생하기");
	}
	void stop(){
		System.out.println("정지하기");
	}
	void ff(){
		System.out.println("빨리감기");
	}
	void rew(){
		System.out.println("되감기");
	}
}
//vcr기능을 가지는 tv

//TvVcr 이란 걸 만들어서 둘다 가지고 싶음
//TV 기능 Vcr기능 (공통 기능)
//TvVcr(Vcr, Vcr) 사용

//class TvVcr extends Tv,Vcr{} 다중상속 불가

// Tv상속 , Vcr 포함: 둘중 1개 상속 , 1개 포함
//선택기준: 비중이 높은 클래스 상속 받는것이 좋다.
class TvVcr extends Tv{
	Vcr vcr = new Vcr();
}


public class Ex03_Single_Inherit {
	public static void main(String[] args) {
		
		TvVcr t  = new TvVcr();
		t.power();
		System.out.println("Tv 전원 : " + t.power);
		t.chup();
		System.out.println("Tv 채널 : " + t.ch);
		
		//비디오 
		t.vcr.power();
		System.out.println("Vcr 전원 :" +t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		
		System.out.println("Tv 전원 : " + t.power);
		System.out.println("Vcr 전원 :" +t.vcr.power);
	}
}
