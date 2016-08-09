package Team03_card_pleus;

public class CU extends Affiliate implements PayBack{
	
	@Override
	public void Payback(Merchandise m) {
		totalpoint = m.merchPay/PAYBACK;
	}
	@Override
	public String toString() {
		return "CU∆Ì¿«¡°";
	}
}
