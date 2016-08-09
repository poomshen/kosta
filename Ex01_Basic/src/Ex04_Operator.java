
public class Ex04_Operator {
	public static void main(String[] args) {
		//연산자 (+,-,*,/,%나머지)
		int result = 100/100;
		System.out.println(result);

		int i = 10;
		++i; //전치 증가
		System.out.println("++i  :" +i);
		i++; //후치 증가
		System.out.println("i++ :" + i);
		--i;
		System.out.println("--i :" + i);
		
		//point 
		int i2 =5;
		int j2 =6;
		
		int result2 = i2 + ++j2;
		System.out.println(result2);
		
		result2 = i2 + j2++;
		System.out.println(result2);
		System.out.println("j2  :" + j2);
		
		//오늘의 point
		//자바에서의 연산 규칙
		//정수의 모든 연산은 int로 변환후 처리
		//byte + byte => int + int 결과
		//byte b =100 ; byte c = 101;
		//b+c
		
		byte b =127;
		byte c =127;
		int result3 = b+c;
		byte result4 = (byte)(b+c); //why: b+c결과 int
		System.out.println("result4 :"+ result4);
		
		//byte + short =>int+int
		//char +char => int+int
		//실수(실수와 정수 붙으면 실수가 승자)
		//float + int => float + float
		//float + long => float + float
		//float + double => double + double
		
		float num2 = 10f;
		int num3 = 20;
		
//		float result5 =num2 + num3;
		int result5 = (int)(num2+num3);//큰타입이 작은 타입으로 가면 손실
		
		char c2 = '!';//33
		char c3 = '!';
		int ch_result = c2+c3;
		System.out.println(ch_result);
		//결과를 다시 문자값을로 보고 싶다?
		char ch_resut2 = (char)ch_result;
		System.out.println(ch_resut2);
		
		
		//연산자
		int sh = 10/8;
		System.out.println("/ 몫  :" + sh);
		
		sh = 10%8;
		System.out.println("나머지 :" + sh);
		
		//1~10까지의 수에서 짝수만 구하세요 (짝수의 합)
		//규칙....
		// % 연산자의 활용
		int sum = 0;
		for(int j= 1; j<=10; j++){
//			System.out.println("빙글빙글");
			if(j%2 == 0){
				sum =sum + j;
				System.out.println("j: "+j);
			}
		}
		System.out.println("sum : " + sum);
		
		// == 값을 비교
		if(10== 10.0f){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		//!= 부정 연산자
		if('A'!= 65){//'A'와 65 정수가 같지 않니?
			System.out.println("true");
			//같지 않아요
		}else{
			System.out.println("false");
			//같아요
		}
		
		//*암기(point) : 삼항 연산자(삼항안에 삼항연산자)
		int p = 10;
		int k = -10;
		//만약에 p가 10같다면 p라는 값을 집어 넣고 같지않다면 k는 result에 집어 넣는다.
		int result6 = (p==10) ? p:k;
		// ?앞에 조건식이 true 이면 : 앞에 것을 취하고
		// ? 앞에 조건식이 false이면 : 뒤에 것을 취하고
		/*
		 if(p == 10){
		  	result6 = p;
		  }else{
		  	result6 = k;
		  }
		*/
		System.out.println(result6);
		
		/*
		   bit연산에 필요
		 	진리표  OR  ,  AND
		 	0 0    0	  0
		 	0 1	   1 	  0
		 	1 0	   1	  0
		 	1 1	   1	  1
		 	//0 : false
		 	//1 : true
		 	
		 	
		 	select empno,ename from emp wher empno = 1000 and sal > 100;
		 	
		 	select empno,ename from emp wher empno = 1000 or sal > 100;
		 	
		*/
		int x = 3;
		int y = 5;
		//연산자
		// | or & AND연산자
		// bit연산
		System.out.println(x|y);
		System.out.println(x&y);
		//십진수 3을 2진수
		//128, 64, 32, 16, 8, 4, 2 ,1
		//                 0  0  1  1 3의 이진수
		//                 0  1  0  1 5의 이진수
		//               > 0  1  1  1 2진수 >10진수
		//               > 4+2+1=7
		
		//십진수 3을 2진수
		//128, 64, 32, 16, 8, 4, 2 ,1
		//                 0  0  1  1 3의 이진수
		//                 0  1  0  1 5의 이진수
		//              >  0  0  0  1  1
		//              >  1
		
		//암기(point) &&(and) , ||(or) (논리연산)
		//연산 속도가 빠르다 (TURE,FALSE)
		//if(10> 0 && -1 >1 && 100> 2 && 1>-1 &&.....)
		//{} //-1 >1 > false 뒤에 조건은 보지않고 else{}
		
		//if(10> 0 || -1 >1 || 100> 2 || 1>-1 ||.....)
				//{} //-1 >1 > true 뒤에 조건은 보지않고 if{}
		
	}
}
