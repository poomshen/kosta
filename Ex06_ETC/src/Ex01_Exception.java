//오류(프로그램)
//1.에러(error) : 네트워크 장애 , 메모리 , 하드웨어
//2.예외(exception): 개발자 처리: 코드 개발시 예측 가능
//try{}catch(Exeception e){}fianlly{}
//예외처리: 프로그램의 비정상 종료를 막겠다.


//java.lang.ArithmeticException: / by zero
//	at Ex01_Exception.main(Ex01_Exception.java:18)

//의문점
//1.예외객체를 생성하지 않았는데 자원을 사용
//예외가 발생하면 그 예외에 맞는 클래스를 찾아서 new 하고 메모리에 올린다.
// new AritmeticException;로 처리
//2.Excepion 처리 > ArithmeticException 다른 클래스..
//	예외를 담당하는 최상위 클래스

public class Ex01_Exception {
	public static void main(String[] args) {
//		System.out.println(); 컴파일 오류
		/*System.out.println("함수 시작");
		System.out.println("코드 처리");
		System.out.println(0/0); //시점 프로그램 비정상 종료
		System.out.println("함수 종료");*/
		
		//예외처리
		try{
			System.out.println("함수 시작");
			System.out.println("코드 처리");
			System.out.println(0/0);
		}catch (Exception e) {//Exception 클래스 예외를 담당하는 상위 클래스
//			System.out.println("문제 확인 : " + e.getMessage());
			e.printStackTrace();//이함수에 에러 확인
		}
		System.out.println("함수 종료");
		
		
	}

}
