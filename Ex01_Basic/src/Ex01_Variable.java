
public class Ex01_Variable {
	//프로그램의 시작점(진입점)
	//Tip) java: main(), c#:Main() <-- 대문자.
	public static void main(String[] args) {
		System.out.println("시작점");
		//주석 처리 (라인 주석)
		/*
		  블럭 주석
		  
		  1.main() 함수 (시작점,실행점)
		  2.실행(run): ctrl + F11 (javac -> java -> 실행)
		  3.변수(variable ,field):데이터를 담는 공간
		  3.1 변수명은 소문자(관용적) (_name: 허용)
		  3.2 대소문자를 엄격하게 구분한다(a, A 트릴다)
		  3.3 변수는 선언과 할당을 분리 할 수 있다.
		 */
		 
		int i; //선언 
		i = 200;
		//그런데  hint) class (설계도) 가는 가지는 변수(전역) 초기화 하지 않아도 된다.
		// class 안에 변수는 default 값을 가지고 있다.
		System.out.println(i);
		
		
	}
}
