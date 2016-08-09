//기본타입 : 8개 > JAVA API가 클래스를 설계(래퍼 클래스)
//기본타입 자료형을 클래스로 만들어서 객체 단위로 처리 가능하게 만든것

//기본타입을 클래스 쓰는 형태
//1.타입간에 형변환(문자를 숫자로:Integer.parseInt(s))
//2.parameter 사용  : void m(int i); ,,,, void m(Integer i)
//3.클래스로 설계해서 내부 상수로 사용할때
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		Integer n = new Integer(100);
		//내부적으로 : private int value; public Integer(int value){}
		
		System.out.println(n);
		System.out.println(n.hashCode());//내부적으로 해놓아기 때문에
		System.out.println(n.MIN_VALUE + "//"+n.MAX_VALUE);
		
		IntegerMethod(n);//엄밀히 따지다면 주소값 던지는 것
		intMethod(n);//주소값에서 값을 찾아서 intMethod(100)
		
		Integer  i2 = new Integer(100);
		Integer  i3 = new Integer(100);
		
		System.out.println(i2 == i3);
		System.out.println(i2.equals(i3));//equals override 값을 비교 
		
		
	}
	static  void IntegerMethod(Integer i){
		System.out.println("param "+ i);
	}
	static void intMethod(int i){
		System.out.println("int param :" + i);
	}
}
