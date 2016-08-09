package drink;

public class Drink {
	//음료 이름
	private String drinkName;
	//음료 가격
	private int drinkPrice;
	//음료 재고
	private int drinkStock;
	
	//음료 이름 받기 보기
	public void writeName(String drinkName){
		this.drinkName = drinkName;
	}
	public String readName(){
		return this.drinkName;
	}
	//음료 가격 받기 보기
	public void writePrice(int drinkPrice){
		this.drinkPrice =drinkPrice;
	}
	public int readPrice(){
		return this.drinkPrice;
	}
	
	//음료 제고량 받기 보기
	public void writeStock(int drinkStock){
		this.drinkStock =drinkStock;
	}
	public int readStock(){
		return this.drinkStock;
	}
	//재고량 늘리기
	public void stockUp(){
		this.drinkStock++;
	}
	//재고량 줄이기
	public void stockDown(){
		this.drinkStock--;
	}
	
	public void pintDrink(){
		if(drinkStock >0){
			System.out.println(this.drinkName+"을 뽑으셨습니다. 맛있게 드세요^^");
			stockDown();
			System.out.println("남은"+drinkName+"는 "+drinkStock+"만큼 남았습니다.");
		}else {
			System.out.println(this.drinkName+"가 부족합니다. 다음에 꼭 채워 넣겠습니다"+this.drinkPrice+"원은 돌려 드리겠습니다.");
		}
		
	}
}
