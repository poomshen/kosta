package Team03_card;

public class Card {
//포인트카드에는 사용금액과 사용금액에 따른 포인트가 있다.
	int money;
	static int point;
	//생성자
	public Card() {
	}
	//구매시
	public void Buy(int money){
		this.money += money;
		this.point += money*10/100;
	}
	public void pint(){
		System.out.println("이곳"+toString()+"에서 총 "+this.money+" 만큼 소비하셨습니다.");
		System.out.println("포인트는 총"+this.point+"만큼 적립 되었습니다.");
	}
}
