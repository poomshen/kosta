package Team03_card_pleus;

//��ǰ ��ü
public class Merchandise {
	//��ǰ �̸�
	String merchName;
	//��ǰ����
	int merchPay ;
	//��ǰ���
	int merchStock;
	//������
	public Merchandise() {
		// TODO Auto-generated constructor stub
	}
	//��� �Է� ���ϸ� 100���� ����
	public Merchandise(String merchName,int merchPay) {
		this.merchName = merchName;
		this.merchPay = merchPay;
		this.merchStock = 100;
	}
	//������ �� �� �ޱ�
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
