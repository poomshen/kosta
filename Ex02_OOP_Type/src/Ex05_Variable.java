
public class Ex05_Variable {
	int iv ;// member field , instance variable
		//목적 : 객체 마다 다른 값을  갖기 위해 사용
		//초기화 해도 되고요, 안하면 default 값을 : 정수 0
	static int  cv ; // class variable(static , 공유 자원)
		//[객체간] 공유 자원
	//생성시점 (memory 갖는 시점) : 실행될때 , 객체 생성 이전에 
	//클래스 정보 로드 (mathod area)static 같이 올라간다.
	// 접근방법 
	//*********point**********
	//객체이름(참조 ).static자원
	//클래스이름.static 자원
	
	void callMethod(){
		int lv = 0;//local variable(반드시 초기화하고 실행)
					//생성 callMethod() 실행될때
					//소멸 callMethod() 끝날때
	}
	public static void main(String[] args) {
		
	}
}
