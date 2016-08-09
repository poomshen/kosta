package Team03_card_pleus;

//상품 객체
public class Merchandise {
	//상품 이름
	String merchName;
	//상품가격
	int merchPay ;
	//상품재고
	int merchStock;
	//생성자
	public Merchandise() {
		// TODO Auto-generated constructor stub
	}
	//재고 입력 안하면 100으로 선언
	public Merchandise(String merchName,int merchPay) {
		this.merchName = merchName;
		this.merchPay = merchPay;
		this.merchStock = 100;
	}
	//생성자 값 다 받기
	public Merchandise(String merchName,int merchPay,int merchStock) {
		this.merchName = merchName;
		this.merchPay = merchPay;
		this.merchStock = merchStock;
	}
	
	public String getMerchName() {
		return merchName;
	}
	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}
	public int getMerchPay() {
		return merchPay;
	}
	public void setMerchPay(int merchPay) {
		this.merchPay = merchPay;
	}
	public int getMerchStock() {
		return merchStock;
	}
	public void setMerchStock(int merchStock) {
		this.merchStock = merchStock;
	}
	
	
}
