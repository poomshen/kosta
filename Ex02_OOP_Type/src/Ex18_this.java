class Scar{
	String color;
	String gearType;
	int door;
	public Scar() {
	/*	this.color = "red";
		this.door = 4;
		this.gearType ="Auto";*/
		this("red", 4,"Autto");
		System.out.println("default ������ ȣ��");
	}
	Scar(String color , int door){
		this.color = color;
		this.door = door;
	}
	Scar(String color,int door,String gearType){
		this.color = color;
		this.door = door;
		this.gearType = gearType;
		System.out.println("�Ķ���� 3�� ¥�� ������ ȣ��");
		
	}
	 void display(){
		System.out.println(this.color+"  :  "+this.door+"   :  "+this.gearType);
	}
}
class Scar2 {
	String color;
	int door;
	String gearType;
	Scar2(){
		this("red",4);
		System.out.println("degault constructor");
		
	}
	Scar2(String color,int door){
		this(color,door,"auto");
		System.out.println("parameter 2��");
		
	}
	Scar2(String color, int door, String gearType){
		this.color = color;
		this.door = door;
		this.gearType = gearType;
		System.out.println("parameter 3��");
	}
	 void display(){
			System.out.println(this.color+"  :  "+this.door+"   :  "+this.gearType);
		}
}
public class Ex18_this {

	//��ü�ڽ��� �޴� this
	//������ �ڽ��� �ڴ�
	
	public static void main(String[] args) {
		Scar s2 = new Scar();
		s2.display();
		
		Scar s = new Scar("rod",5,"dd");
		s.display();
	
		Scar2 s3 = new Scar2();
		s3.display();
		
		Scar2 s4 = new Scar2("blue",2);
		s4.display();
		
		
		Scar2 s5 = new Scar2("yellow", 1, "manaul");
	}
	
	
	
}
