//시나리오
//저희는 가전제품 매장 솔루션 개발 사업팀 입니다.
// A 라고 하는 가전제품 매장이 오픈 되면
//요구사항 
//가전제품 공통 사항은:제품의 가격정보, 제품의 포인트 정보
//각 가전  제품은 제품별 특징을 가지고 있다.(상품 이름 : Tv , Audio, computer)
//긱 제품마다 가격이 다르다 , 포인트 10%
//Tv 100만원 (포인트 10만점)

//구매자 :제품을 구매 하기 위한 금액 정보 , 포인트 정보를 가지고 있다.
//구매자는 구매 행위를 할수 있다.(가전제품)
//행위를 하게 되면 구매자가 가지는 금액 정보를 감소하는 포인틀를 올라간다.)


//1차 코드 
//문제점 : 물건이 100개 추가(문제 없음 : pos 등록)
//매장 대규모 세일 : 제품마다 판매 행위를 각가 따로 갖고 있다.
//물건이 추가 될때마다 구매 함수를 같이 추가야 한다 이 코드를 개선하세요
class appliances{
	protected int price;
	protected int appPoint;
	
	public appliances(int price){
		this.price = price;
		this.appPoint = (int)(this.price/10.0);
	}
	public void appPointin() {
	}
}
class Tv3 extends appliances{
	public Tv3() {
		super(30000);
	}
	@Override
	public String toString(){
		return "TV";
	}
}
class Audio extends appliances{
	public Audio() {
		super(3000);
	}
	@Override
	public String toString(){
		return "Audio";
	}
	
}
class Computer extends appliances{
	public Computer() {
		super(25000);
	}
	@Override
	public String toString(){
		return "Coputer";
	}
}
//class Product extends appliances{
//	String produc;
//	public Product(int su , String produc) {
//		super(su);
//		this.produc = produc;
//	}
//	@Override
//	public String toString(){
//		return produc;
//	}
//}

class Buyer{
	int money = 50000;
	int appPint = 0;
	void Buy(appliances n){
		if(this.money <n.price){
			System.out.println("고객님 잔액이 부족합니다.");
			return;
		}
		//실구매 행위
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("구매한 물건 :"+ n.toString());
	}
}
//2차 
//	void Buy(Tv3 n){
//		if(this.money <n.price){
//			System.out.println("고객님 잔액이 부족합니다.");
//			return;
//		}
//		//실구매 행위
//		this.money -= n.price;
//		this.appPint += n.appPoint;
//		System.out.println("구매한 물건 :"+ n.toString());
//	}
//	void Buy(Audio n){
//		if(this.money <n.price){
//			System.out.println("고객님 잔액이 부족합니다.");
//			return;
//		}
//		//실구매 행위
//		this.money -= n.price;
//		this.appPint += n.appPoint;
//		System.out.println("구매한 물건 :"+ n.toString());
//	}
//	
//	void Buy(Computer n){
//		if(this.money <n.price){
//			System.out.println("고객님 잔액이 부족합니다.");
//			return;
//		}
//		//실구매 행위
//		this.money -= n.price;
//		this.appPint += n.appPoint;
//		System.out.println("구매한 물건 :"+ n.toString());
//	}
//}


/*class Buyer {
	int money = 50000;
	int appPint = 0;
	
	//구매행위
	//구매행위(물건의 정보: 잔액, 포인트)
	//구매행위 물건 정보 (물건객체를 파라미터로 받기
	void Tvbuy(Tv3 n){
		if(this.money <n.price){
			System.out.println("고객님 잔액이 부족합니다.");
			return;
		}
		//실구매 행위
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("구매한 물건 :"+ n.toString());
	}
	void AudioBuy(Audio n){
		if(this.money <n.price){
			System.out.println("고객님 잔액이 부족합니다.");
			return;
		}
		//실구매 행위
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("구매한 물건 :"+ n.toString());
	}
	
	void ComputerBuy(Computer n){
		if(this.money <n.price){
			System.out.println("고객님 잔액이 부족합니다.");
			return;
		}
		//실구매 행위
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("구매한 물건 :"+ n.toString());
	}
}*/
//2차 코드
//tip) 구매 함수의 이름을 동일하게 (buy) 하는 행위하나로 모든 물건...
//함수 이름 동일하게(buy ) > Audio , Notebook , Tv만 살수 있게
//overloading

//3차 코드 개선 
//1. 다수의 물건이 입고 되어있을때 함수를 코드 추가하는 문제
//2. 반복적인 코드를 제거
//다형성을 사용하면 물건이 100개 (Buy 함수 100개) 500 Line
//500라인 > 10개의 라인

//class AppPint{
//	int appPint;
//	public AppPint(int appPint) {
//		this.appPint = appPint / 10;
//	}
//}

public class Ex13_poly_main {
	public static void main(String[] args) {
		Tv3 tv = new Tv3();
		System.out.println("제품이름 :"+ tv.toString());
		System.out.println(tv.price);
		System.out.println(tv.appPoint);

		Audio au = new Audio();
		System.out.println("제품이름 :"+ au.toString());
		System.out.println(au.price);
		System.out.println(au.appPoint);
		
		Computer co = new Computer();
		System.out.println("제품이름 :"+ co.toString());
		System.out.println(co.price);
		System.out.println(co.appPoint);
		
//		Product pr = new Product(5000, "노트북");
		Buyer buyer = new Buyer();
//		buyer.Tvbuy(tv);
//		buyer.AudioBuy(au);
//		buyer.ComputerBuy(co);
//		buyer.Buy(pr);
		buyer.Buy(tv);
		buyer.Buy(au);
		buyer.Buy(co);
	}
}
