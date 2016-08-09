package kr.or.kosta;

public class Card {
	public int number;
	public String kind;
	
	public  int h = 10;
	public  int w = 20;

	public void card_Info(){
		System.out.printf("번호: %d  , 모양: %s  , h : %d , w : %d \n",number ,kind,h,w);
	}
}
