
class Animal{
	Body body;
	String animalname;
	String habitat;
	
}
//포유류
class Mammal extends Animal{
	public void milk(){
		System.out.println("우유를 먹는다.");
	}
	public void bringForth(){
		System.out.println("새끼를 낳는다.");
	}
	
}
//조류
class Current extends Animal{ 
	
	public void fiy(){  System.out.println( "하늘을 날수 있다");  };
	public void food(){
		System.out.println("먹이를 먹는다.");
	}
	public void spawn(){
		System.out.println("알을 난다");
	}
}
//개
class Dog extends Mammal{
	String pet ="애완동물이다.";
	String smell ="냄새를 잘 맡는다.";
	public Dog() {
		body = new Body(2,"입이 나와있다","좋다",4);
		this.habitat = "집";
		this.animalname = "강아지";
	}
	public void pint(){
		System.out.println(this.animalname+"는 "+habitat+"에 살고 "+this.pet+"이며 "+this.smell+"");
		body.Aprint();
		milk();
		bringForth();
	}
}
//돌고래
class Dolphin extends Mammal{
	String iq ="아이큐가 높다";
	String swimming ="수영을 잘한다.";
	public Dolphin(){
		body = new Body(2,"입이 부리처럼 나와있다","있는지 모르겠다",0);
		this.habitat = "바다";
		this.animalname = "돌고래";
	}
	public void pint(){
		System.out.println(this.animalname+"는 "+habitat+"에 살고 "+this.iq+"이며 "+this.swimming+"");
		body.Aprint();
		milk();
		bringForth();
	}
}
//독수리
class Eagle extends Current{
	String baldhead ="대머리다";
	public Eagle() {
		body = new Body(2,"부리가 날카롭게있다","좋지?",2);
		this.habitat = "하늘";
		this.animalname = "독수리";
	}
	public void pint(){
		System.out.println(this.animalname+"는  "+habitat+"에 살고 "+this.baldhead+"이며");
		body.Aprint();
		spawn();
		food();
	}
}
//오리
class Duck extends Current{
	String swimming ="수영을 잘한다.";
	String webbed ="물갈퀴가 있다";
	public Duck(){
		body = new Body(2,"부리가 나와있다","좋지 않다",2);
		this.habitat = "호수";
		this.animalname = "오리";
	}
	public void pint(){
		System.out.println(this.animalname+"는 "+habitat+"에 살고 "+this.webbed+" ,"+this.swimming+"");
		body.Aprint();
		spawn();
		food();
	}
}
class Body{
	public int snow;
	public String mouth;
	public String nose;
	public int leg;
	
	public Body() {
		snow = 2; mouth ="이빨이날카롭다."; nose ="검다"; leg = 2;
	}
	public Body(int snow ,String mouth , String nose , int leg){
		this.snow = snow;
		this.mouth =mouth;
		this.nose = nose;
		this.leg = leg;
	}
	public void Aprint(){
		System.out.println("눈 :"+this.snow+" /코 :"+this.nose+"/입 :"+this.mouth +"/다리:"+this.leg );
	}
	
}
public class Ex00_Animal {

public static void main(String[] args) {
	Dog dog = new Dog();
	
	dog.pint();
		
	Duck duck = new Duck();
	duck.pint();
	
	Dolphin doiphin =new Dolphin();
	doiphin.pint();
	
	Eagle  eagle = new Eagle();
	eagle.pint();
}	
}
