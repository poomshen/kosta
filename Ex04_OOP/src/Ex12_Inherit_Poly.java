//���⼺
//�ϳ��� ���������� �������� ��ü�� ������ �� �ִ�.
//�� ��Ӱ��迡��
//�ҹ��� ���� > ������  �ڵ������ ���� ��� 
class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("����");
	}
	void stop(){
		System.out.println("����");
	}
}
class FireCar extends Car{
	void water(){
		System.out.println("���� �Ѹ���.");
	}
}


public class Ex12_Inherit_Poly {
	public static void main(String[] args) {
		FireCar f = new FireCar();
		f.drive();
		f.stop();
		f.water();
		
		Car c = null;
		c = f;//(Car)f;//�θ�(Car c) �ڽ�( FireCar F)
		//�ڽ��� �θ𿡰� ���Ǿ��� �ָ� �ȴ�.
		//c��� �θ�Ÿ���� ���������� ���� �� ���� �� ����,
		// c= (car)f (up -castutin)
		FireCar  f2 = f ;
//		FireCar  = (FireCar) ; ��������� (down -castring);FireCar
	}
}
