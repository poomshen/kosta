package kr.or.kosta;

public class Book {
	public String bname;
	private int amount;
	
	public void witeAmount(int unm){
		amount = unm;
	}
	public int readAmount(){
		return amount;
	}

}
