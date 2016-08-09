
public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		try {
			for(int i =0 ; i < 10 ; i++){
				result = num/(int)(Math.random()*10);//0~9;
				System.out.println("결과 : " + result );
			}
			//사실은 random 함수가 0 을 가지지 않게 하는 것이 정답
		}catch (ArithmeticException e) {
			//하위 예외
			System.out.println("연산 예외~ㅋ");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 예외");
		}catch (Exception e) {
			System.out.println("나머지 예외 발생");
		}/*catch(ArithmeticException ex){
			상위 예외는 항상 하위 예외보다 아래
		}*/
		System.out.println("종료");
	}
}
