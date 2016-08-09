package Team2;

public class Team_BOOK {
	//-제목, 저자정보,재고
	private String bookName ;
	private String bookWiter;
	private int bookStock;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookWiter() {
		return bookWiter;
	}
	public void setBookWiter(String bookWiter) {
		this.bookWiter = bookWiter;
	}
	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}
	public  int getBookStock() {
		return bookStock;
	}
	
	public  void bookStockUP(){
		bookStock++;
	}
	public  void bookStockDown(){
		bookStock--;
	}
	
	//이름 , 저자
	public boolean bookSearch(String in){
		boolean ck = (in.equals(bookName))?true:(in.equals(bookWiter))?true:false;
		return ck;
	}
	public boolean bookSearch(int in){
		boolean ck = (in==bookStock)?true:false;
		return ck;
	}
	//
	public boolean bookSearch(String in,String in2){
		boolean ck = (in.equals(bookName))?true:(in2.equals(bookWiter))?true:
					(in2.equals(bookName))?true:(in.equals(bookWiter))?true:false;
		return ck;
	}
	public boolean bookSearch(int in,String in2){
		boolean ck = (in2.equals(bookName))?true:(in2.equals(bookWiter))?true:
					(in==bookStock)?true:false;
		return ck;
	}
	
	public boolean bookSearch(String in,String in2,int stock){
		boolean ck = (in.equals(bookName))?true:(in.equals(bookWiter))?true:
			(in2.equals(bookName))?true:(in2.equals(bookWiter))?true:
				(stock==bookStock)?true:false;
		return ck;
	}
	public void bookSearch(){
		System.out.printf("책제목 : %s  책저자 : %s  책재고: %d \n",bookName,bookWiter,bookStock);
		System.out.println();
	}
	public Team_BOOK(String bookName ,String bookWiter , int bookStock){
		this.bookName = bookName;
		this.bookWiter = bookWiter;
		this.bookStock = bookStock;
	}
	
}
