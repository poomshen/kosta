
class Data {
	int i;
}
public class Ex10_Method_call {
	public static void main(String[] args) {
		Data data = new Data();
		data.i =100;
		Vcall(data.i);
		System.out.println("data.i" + data.i);
	}
	static private void Call(Data d) {
		System.out.println(d.i);
		d.i = 5555;
	}
	static void Vcall(int x){
		System.out.println("x의 파라미터 변수"+ x);
	}
}

//설계
//설계도  안에 굳이 [static] 메서드를 만들어 넣는다면
//그 [의도]가 무었일일까요?
//  => 많이 쓰는 자원인 경우
/*
	class Test{
	 static void m(){}
	 static void m2(){}
	 static void m3(int i){}
	}

*/