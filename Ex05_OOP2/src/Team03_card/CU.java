package Team03_card;

public class CU implements PayBack{
	int point = 0;
	@Override
	public void Payback(int money) {
		point = money/PAYBACK;
		
	}

}
