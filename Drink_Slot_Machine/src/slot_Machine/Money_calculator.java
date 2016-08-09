package slot_Machine;

public class Money_calculator {
	
	private int get_money;
	public int print_money;
	
	public int set_money(int get_money ,int drink_money){
		int result = 0;
//		//받은 돈이 0보다 크고 받은돈이 음료돈 보다 작으면 
		result = (drink_money<get_money)?(get_money-drink_money):
				(drink_money==get_money)?0:(drink_money>get_money)?(get_money-drink_money):(get_money-drink_money);
		return result;
	}
}
