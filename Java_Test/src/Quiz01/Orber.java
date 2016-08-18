package Quiz01;

public class Orber {
	Itme itme;
	int qty;
	
	public Orber() {
		// TODO Auto-generated constructor stub
	}
	public Orber(Itme itme ,int qty){
		this.itme = itme;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return itme.id +" "+ itme.maker+"  " +itme.name + "  "+ qty ;
	}
}
