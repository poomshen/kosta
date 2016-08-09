package kr.or.kosta;

public class Book2 {
	public String bname;
	private int amount;
	
	public Book2(String bname ,int amount){
		this.bname = bname;
		this.amount = amount;
		System.out.println(bname +"  :  "+amount);
	}

}
