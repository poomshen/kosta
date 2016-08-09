//클래스 여러개 있는 경우
//관계 
//상속 : 포함
//is ~a 상속 : 은 ~ 이다 
//has -a 포함: 은 ~ 가지고 있다

//원은 도형이다 (is~a)
//원은 점을 가지고 있다(has~a)

//원 , 삼각형 , 사각형을 만들어 보았더니
//공통적으로 색상 , 그리다 분리
//도형 : 색상 , 그리다
//is ~a

//점(point) (클래스)
//has ~a

///////////////////////
//상속 (일반화 -> 구체화)
//상속 (공통   -> 특수화(상속을 하는))

//일반화(공통) :shape , point
//구체화(특수) :Circle(반지름) , Triangle(점 3개)

//////////////////////

class Shape{
	String color="gold"; //공통속성
	void draw(){ //공통기능
		System.out.println("그리다");
	}
}
class Point{
	int x;
	int y;
	
	//기본값을 가지수 있고 , 입력한 값(x,y)을 가질수 있다
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
	//삼각형은 점을 가지고 있다. (점3)//특수성
	//hint ) (x,y) , (x,y) ,(x,y) 이으면 삼각형
	//hint ) 점 3개를 하나의 변수로 (배열)
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
			System.out.print("좌표 x점"+y.x +" : y점 "+y.y+"  ");
		}
	}
	
	
}
class Circle extends Shape{
	
	//원(반지름 :원의 특수성) 
	int r;
	
	//좌표(x,y) 공통(포함관계)
	Point center; //Point 클래스가 Circle의 멤머변수
	
	Circle() { //Circle c = new Circle();
		//기본값
		
		//this.center = new Point(); (1,1)
		
		//this.r = 100;
		//this.center = new Point(10,10);
		this(100,new Point(10,10)); //코드의 재사용성
	}
	Circle(int r , Point center){
		this.r = r;
		this.center = center; //주소값 할당
	}
	
	void CircleDraw(){
		System.out.println("원 그리기");
		System.out.println("반지름 : " + this.r);
		System.out.println("x : " + this.center.x);
		System.out.println("y : " + this.center.y);
	}
	
	
	
}


public class Ex02_Inherit_Composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.CircleDraw();
		
		//내가 원하는 반지름 , x, y 좌표를 가지는 원을 그리기를 원해요
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
	///삼갓형을 만들어 보세요
	//조건
	//삼각형은 도형이다.
	//삼각형은 점을 가지고 있다. (점3)//특수성
	//hint ) (x,y) , (x,y) ,(x,y) 이으면 삼각형
	//hint ) 점 3개를 하나의 변수로 (배열)
	//class Triange{}
}
