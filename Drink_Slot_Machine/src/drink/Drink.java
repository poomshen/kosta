package drink;

public class Drink {
	//���� �̸�
	private String drinkName;
	//���� ����
	private int drinkPrice;
	//���� ���
	private int drinkStock;
	
	//���� �̸� �ޱ� ����
	public void writeName(String drinkName){
		this.drinkName = drinkName;
	}
	public String readName(){
		return this.drinkName;
	}
	//���� ���� �ޱ� ����
	public void writePrice(int drinkPrice){
		this.drinkPrice =drinkPrice;
	}
	public int readPrice(){
		return this.drinkPrice;
	}
	
	//���� ���� �ޱ� ����
	public void writeStock(int drinkStock){
		this.drinkStock =drinkStock;
	}
	public int readStock(){
		return this.drinkStock;
	}
	//��� �ø���
	public void stockUp(){
		this.drinkStock++;
	}
	//��� ���̱�
	public void stockDown(){
		this.drinkStock--;
	}
	
	public void pintDrink(){
		if(drinkStock >0){
			System.out.println(this.drinkName+"�� �����̽��ϴ�. ���ְ� �弼��^^");
			stockDown();
			System.out.println("����"+drinkName+"�� "+drinkStock+"��ŭ ���ҽ��ϴ�.");
		}else {
			System.out.println(this.drinkName+"�� �����մϴ�. ������ �� ä�� �ְڽ��ϴ�"+this.drinkPrice+"���� ���� �帮�ڽ��ϴ�.");
		}
		
	}
}
