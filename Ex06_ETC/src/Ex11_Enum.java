/*
    열거형(타입)
   class  Cal{
    public Static final int nim = 0;
    
    	사용자가 정의한 맴버가 순차적으로  상수 값을 가질수 있는 자효형(타입)
    	
    	enum  열거형이름 (상수 맴버 리스드)
    	public enum Season {SPRING , SUMMER , FALL , WINTER}
열거형 상수는 내부적으로 0 부터 1씩 증가하면서 값을 가진다

열거형은 개발자 코드의 가독성 

열거형 생성 위치 (클래스 , 클래스 안에서 )

열거형도 타입이다 ...static final 
    	
*/
enum Season {SPRING , SUMMER , FALL , WINTER}

public class Ex11_Enum {
	///열거형 타입이 왜 필요 할까?
	public static void main(String[] args) {
		
		Season s = Season.SPRING;
		System.out.println(s);
	    for(Season s2 : Season.values()){
	    	System.out.println(s2.name() + " / " + s2.ordinal());
	    }

	}

}
