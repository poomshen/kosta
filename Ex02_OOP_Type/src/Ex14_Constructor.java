import kr.or.kosta.Book;
import kr.or.kosta.Book2;

//������(Constructor)
//�Լ�(Ư���� ������ �Լ�)
//�Լ��� �̸� : class �̸��� ���� 
//���� ����  : return Type �� ���� ���Ѵ� (void(x))
//��� ��Ģ�� ��ȸ�ϸ� �Լ��� ���� 
//����(����) : new �����ڸ� ���ؼ� ��ü�� �����ɶ� ������
/*
 class car {
 	public car(){
 	
 	}
 }

*/
class Car2{
	int door;
	public Car2(){
		System.out.println("�� dafault ������");
		door = 100;
	}
	public Car2(int c){
		door = c;
	}
}
public class Ex14_Constructor {
	public static void main(String[] args) {
		Book b = new Book();
		b.bname = "ȫ�浿��";//�ʱ�ȭ
		b.witeAmount(10);//�ʱ�ȭ
		
		//bookŸ���� ��ü�� �����
		//�ʱ�ȭ��� �۾��� �Ѵ�.
		Car2  c= new Car2();
		System.out.println(c.door);
		
		Car2 c2 = new Car2(100);
		System.out.println(c2.door);
		
		Book2 b2 = new Book2("��������", 100);
		Book2 b3 = new Book2("����", 500);
		Book2 b4 = new Book2("����", 400);
		
	}

}
