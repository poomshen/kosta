class appliances2{
	protected int price;
	protected int appPoint;
	
	public appliances2(int price){
		this.price = price;
		this.appPoint = (int)(this.price/10.0);
	}
}
class Tv4 extends appliances2{
	public Tv4() {
		super(30000);
	}
	@Override
	public String toString(){
		return "TV";
	}
}
class Audio2 extends appliances2{
	public Audio2() {
		super(3000);
	}
	@Override
	public String toString(){
		return "Audio";
	}
	
}
class Computer2 extends appliances2{
	public Computer2() {
		super(25000);
	}
	@Override
	public String toString(){
		return "Coputer";
	}
}

//구매자
class Buyer2 {
	int money;
	int appPoint;
	public Buyer2() {
		this.money = 1000;
		this.appPoint  = 0;
	}
	public Buyer2(int money,int appPoint){
		this.money = money;
		this.appPoint =appPoint;
	}
	//요구사항
	//장바구니 기능(Cart)
	//장바구니 (매장에 있는 전자제품을 모두 담을 수 있다) :POINT
	//위: 다형성 , 배열
	//장바구니의 크기는 고정되어 있다.
	appliances2 [] gi = new appliances2[10];
	int su =0;
	int to1 =0 ;
	int to2 =0;
	String to3 = "";
	void Buy(appliances2 ap){
		
		gi[su] = ap;
		su++;
//		//카트를 담는것 (기존 코드 동일)

		//실구매 행위
		for(int i = 0 ; i<su; i++ ){
			to1 += gi[i].price;
			to2 += gi[i].appPoint;
			to3 += gi[i].toString()+" ";
		}
		System.out.println("******************************");
		System.out.println("장바구니의 담은 물건 총합 :"+ to1);
		System.out.println("장바구니의 담은 물건 총 받는포인트:"+ to2);
		System.out.println("장바구니의 담은 물건 : "+ to3 + " ");
		System.out.println("******************************");
		to1 =0 ;
		to2 =0;
		to3 = "";
	}
	//계산대(장바구니)
	//장바구니 담긴 물건 계산
	//물건의 총액
	//물건의 목록 출력
	void sumary(){
		for(int i =0 ; i<su ; i++){
			if(su !=0 ){
				if(this.money+this.appPoint <gi[i].price){
					System.out.println("고객님 잔액이 부족합니다.");
					return;
				}
				//실구매 행위
				if(this.money < gi[i].price){
				  int su2 =  gi[i].price - this.money;
				  System.out.println("포인트를 사용해서 구매 되셨습니다.");
				  this.money = 0;
				  this.appPoint -= su2;
				  this.appPoint += gi[i].appPoint;
				}else{
					this.money -= gi[i].price;
					this.appPoint += gi[i].appPoint;
				}
				System.out.println("구매한 물건 :"+ gi[i].toString());
				System.out.println("남은 잔액 :"+this.money);
				System.out.println("남은 포인트 :"+this.appPoint);
			}else{
				System.out.println("구매하신 물건이 없습니다.");
			}
		}
		
	}
}


public class Ex14_Poly_Array_Main {
	public static void main(String[] args) {
		Tv4 tv = new Tv4();
		System.out.println("제품이름 :"+ tv.toString());
		System.out.println("제품가격 :"+ tv.price);
		System.out.println("제품포인트" + tv.appPoint);

		Audio2 au = new Audio2();
		System.out.println("제품이름 :"+ au.toString());
		System.out.println("제품가격 :"+au.price);
		System.out.println("제품포인트" +au.appPoint);
		
		Computer2 co = new Computer2();
		System.out.println("제품이름 :"+ co.toString());
		System.out.println("제품가격 :"+co.price);
		System.out.println("제품포인트" +co.appPoint);
		
//		Product pr = new Product(5000, "노트북");
		Buyer2 buyer = new Buyer2(50000,500000);
//		buyer.Tvbuy(tv);
//		buyer.AudioBuy(au);
//		buyer.ComputerBuy(co);
//		buyer.Buy(pr);
		buyer.Buy(tv);
		buyer.Buy(au);
		buyer.Buy(co);
		buyer.sumary();
	}
}
