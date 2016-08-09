class Note{
	//생성자를 가지고 있지 않는 경우
	//new 통해서 객체 생성될 때 자동(default) 으로 public Note(){} 생성 된다.
}
class Note2{
	public Note2(){
		//생성자를 만들었다면 의도 (초기화)
		System.out.println("나는 dafault 생성자야");
	}
}
class Note3{
	public Note3(int num){
		System.out.println("난 oberloading 이야 받은 값은 : "+num);
	}
	
	//Note3  = new Note3(); 안되요
	//point  : overloading 생성자가 하나라도 있다면
	//default 생성자는 구현하지 않으면 사용할 수  없다.
	//의도적을 만들었다면 무조건 정수 하나는 받아야 한다라는 구현을 한것이다.
}
class Note4{
	public Note4() {
		System.out.println("난 dafault");
	}
	public Note4(int num) {
		System.out.println("난 overloading");
	}
}
public class Ex15_Constructor {
 public static void main(String[] args) {
	 Note n = new Note();
	 Note2 n2 = new Note2();
	 Note3 n3 = new Note3(100);
	 
}
}
