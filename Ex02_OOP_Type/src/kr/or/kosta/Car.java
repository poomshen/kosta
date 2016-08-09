package kr.or.kosta;

//class, member field, method 앞에는
//(접근자, 수정자, 한정자)
//1.default(폴더 기준)
//2.public(공유:폴더 구분 x 모든 자원 공유)
//3.private(개인: 클래스내부에서는 공유, 객체 입장에 접근 불가)

//Quiz
//widow private 감추고 (함수 read, write)얻을 수 있는 이점
//함부로 바꾸지 못한다.
//캡슐화 
//변수에 직접할당 막고 간접할당을 통해서 자료 보호 (원하는 값을 받을 수 있다.)
public class Car {
	private int window;
	public int tire;
	public String color;
	private int speed;
	
	//함수를 통해서 window 변수 접근
	//기능(함수) 최소 (한개만)
	//read 
	//write 

	//write method(window) 
	public void writeWindow(int window){
		//간접할당을 통해서 자료보호
		if(window>0){
			this.window = window;
		}else{
			this.window =0;
		}
	}
	
	
	//read method(window)
	public int readWindow(){
		return this.window;
	}
	
	//speed의 증가 하는 5씩 ->speedUp()
	//speed의 감소 하는 5씩 ->speedDown()
	public void speedUp(){
		this.speed+=5;
	}
	public void speedDown(){
		
	this.speed=(this.speed>0)?(this.speed-=5):0;
	}
	public void speefPrint(){
		System.out.println("속력  :"+speed);
	}
	
}
