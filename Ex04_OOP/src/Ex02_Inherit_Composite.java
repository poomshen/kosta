//Ŭ���� ������ �ִ� ���
//���� 
//��� : ����
//is ~a ��� : �� ~ �̴� 
//has -a ����: �� ~ ������ �ִ�

//���� �����̴� (is~a)
//���� ���� ������ �ִ�(has~a)

//�� , �ﰢ�� , �簢���� ����� ���Ҵ���
//���������� ���� , �׸��� �и�
//���� : ���� , �׸���
//is ~a

//��(point) (Ŭ����)
//has ~a

///////////////////////
//��� (�Ϲ�ȭ -> ��üȭ)
//��� (����   -> Ư��ȭ(����� �ϴ�))

//�Ϲ�ȭ(����) :shape , point
//��üȭ(Ư��) :Circle(������) , Triangle(�� 3��)

//////////////////////

class Shape{
	String color="gold"; //����Ӽ�
	void draw(){ //������
		System.out.println("�׸���");
	}
}
class Point{
	int x;
	int y;
	
	//�⺻���� ������ �ְ� , �Է��� ��(x,y)�� ������ �ִ�
	Point(){
	   //  this.x = 1;
	   //  this.y = 1;
		this(1,1);
	} //Point p = new Point(); (1,1)
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}//Point p = new Point(10,10); (10,10)
}
class Triangle extends Shape{
	//�ﰢ���� ���� ������ �ִ�. (��3)//Ư����
	//hint ) (x,y) , (x,y) ,(x,y) ������ �ﰢ��
	//hint ) �� 3���� �ϳ��� ������ (�迭)
	Point [] i = new Point[3];
	public Triangle() {
		i = new Point[]{new Point(10,10), new Point(20,20),new Point(30,30)};
	}
	public Triangle(Point [] point){
		i = point;
	}
	public Triangle(Point point1,Point point2,Point point3){
		i = new Point[]{point1,point2,point3};
	}
	void TriangleDraw(){
		draw();	
		System.out.println("color :"+color);
		for(Point y : i){
			System.out.print("��ǥ x��"+y.x +" : y�� "+y.y+"  ");
		}
	}
	
	
}
class Circle extends Shape{
	
	//��(������ :���� Ư����) 
	int r;
	
	//��ǥ(x,y) ����(���԰���)
	Point center; //Point Ŭ������ Circle�� ��Ӻ���
	
	Circle() { //Circle c = new Circle();
		//�⺻��
		
		//this.center = new Point(); (1,1)
		
		//this.r = 100;
		//this.center = new Point(10,10);
		this(100,new Point(10,10)); //�ڵ��� ���뼺
	}
	Circle(int r , Point center){
		this.r = r;
		this.center = center; //�ּҰ� �Ҵ�
	}
	
	void CircleDraw(){
		System.out.println("�� �׸���");
		System.out.println("������ : " + this.r);
		System.out.println("x : " + this.center.x);
		System.out.println("y : " + this.center.y);
	}
	
	
	
}


public class Ex02_Inherit_Composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.CircleDraw();
		
		//���� ���ϴ� ������ , x, y ��ǥ�� ������ ���� �׸��⸦ ���ؿ�
		Point p = new Point(150, 100);
		Circle c2 = new Circle(50, p);
		c2.CircleDraw();
		c2.draw();
		Point p2 = new Point(10,20);
		Point p3 = new Point(100, 200);
		
		Triangle tg = new Triangle(p, p2, p3);
		tg.TriangleDraw();
		Point[] point = new Point[]{new Point(10,200), new Point(100,20),new Point(30,30)};
		Triangle tg2 = new Triangle(point);
		
	}
	///�ﰫ���� ����� ������
	//����
	//�ﰢ���� �����̴�.
	//�ﰢ���� ���� ������ �ִ�. (��3)//Ư����
	//hint ) (x,y) , (x,y) ,(x,y) ������ �ﰢ��
	//hint ) �� 3���� �ϳ��� ������ (�迭)
	//class Triange{}
}
