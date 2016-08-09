
/*		숫자 -> 정수-> byte(-128~127) -통신단위로 많이씀
					char(한문자:2byte) : '가', 'a'
					short(c언어 호환성)
					int(4Byte : 정수의 기본 타입)(-21억 ~21억)
					long(8Byte : int보다 큰값)
			->실수(소수부) -> float(4Byte)
							double(8Byte 기본 타입(double))
		논리 -> boolean(true,false) >프로그램의 흐름 제어
				
 */	
public class Ex02_BasicType {
	public static void main(String[] args) {
		int i, j, k;//연속된 변수의 선언 가능
		i =100;
		j = 200; 
		k = 300;
		System.out.println(i+":"+j+":"+k);
		
		i=1000000000;
		
		//int 와 long
		/*long unm2 =100000000000;//java 정수 기본 int 
		 */
		long num2 = 1000000000L;
		System.out.println(num2);
		
		
		//사실은 String 클래스 입니다.
		String name ="아 졸려";
		
		//chat 타입는 표현은 ''
		
		char single = '가';
		char c= 'a';
		
		String str = "홍\"길\"동";
		System.out.println(str);
		
		String ut ="C:\\Utils";
		String te ="C:\\Temp";
		
		System.out.println(ut);
		System.out.println(te);
		
		//논리타입
		//흐름제어
		boolean power = true;
		System.out.println(power);
		
		power = !power;//부정 연산자
		System.out.println(power);
		 
		//char(unicode 를 따라가요) => 2Byte 기본으로 문자를 표현
		//원칙 : 한글 1자 : 2Byte 
			// 영문자 , 특수문자, 공백 > 1Byte
		
		//char 한문자를 표현 할 수 있는 타입 (가, a , B) =>2Byte
		//char ''싱글퀘테이션 이르 표기
		//주의 : 문자 열"" (String)
		//      한문자 ' '(char)
		
		//char : 내부적으로 정수값을 가지고 있어요 (정수 타입 호환 가능)
		//정수값 -> 한문자
		//한문자 -> 정수값으로
		//아스키코드표 기준으로 보시면 됩니다.(10진수)
		
		char ch = 'a';
		System.out.println(ch);
		char ca2 =  '가';
		char ca3 = '1';
		
		int cint =65;
		char ch4 = (char)cint; //형변환(명시적인 형변환)
		System.out.println(ch4);
		
		int cint2 = ch4; //사실 내부적인 형변환 : (int)ch4: char -> int
						//암시적인 형변환 
		
		//실수(정밀도)
		//float (4)    :소수 7자리 정밀도
		//double(8)    :기본타입(default):소수 16자리 정밀도
		
		//3.14 > default Type : double
		float f = 3.14f; //접미사(F,f)
		double d = 3.14;
		
		
		//유효범위(반올림)
		float f2 = 1.123456789f;
		System.out.println("f2 :" + f2);
		
		//표현될때 (반올림)
		double  d2 = 1.123456789123456789;
		System.out.println("d2 :"+ d2);
		
		
		double d3 = (double)100;//사실 100은 정수타입 암시적 형변환
		System.out.println(d3); // 100.0
		
		int i4 = 100;
//		int result  = i4 +(int)d3; //문제 (데이터 손실)
		
		double result2 = i4 + d3;
		
		//int result = i4 + d3;//int +double
		
		//Point : 작은타입+ 큰타입 => 큰타입
		int i5 = 100;
		byte b2 = (byte)i5;//(-128 ~ 127 정수 0 포함)
		
		byte b3 =20;
		int i6 = b3;//암시적 형변환 : int i6 = (int)b3
		
	}
}
