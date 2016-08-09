import kr.or.kosta.Car;

public class Ex04_OOP_Method2 {
	
	public static void main(String[] args) {
		Car c= new Car();
		c.color = "red";
		System.out.println(c.color);
		
		c.writeWindow(4);
		System.out.println(c.readWindow());
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speefPrint();
		c.speedDown();
		c.speedDown();
		c.speefPrint();
		
	}
}
