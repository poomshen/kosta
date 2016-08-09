
public class Ex09_Control_statement {
	public static void main(String[] args) {
		//제어문 (반복문 : while , do~while, for문)
		
		//1~ 100까지의 합을 구하세요
		//1+2+3..
		int sum = 0;
		for(int i =1 ;i <= 100 ; i++){
			//누적값
			//sum = sum+i;
			sum+= i;
		}
		System.out.println("1~100까지의 합 :" + sum);
		
		int sum2 =0;
		for(int i = 1; i<=100; i+=2){// i = i+2
			//System.out.println(i);
			sum2+=i;
		}
		System.out.println("1~100까지 홀수합 :" +sum2);
		
		//1~100까지의 짝수의 합
		int sum3 = 0;
		for(int i = 0;i<=100;i+=2){
			sum3+=i;
		}
		System.out.println("1~100까지의 짝수:"+sum3);
		
		//point(중첩 for문)
		//2~9단까지
//		for(int i =2 ; i<10 ;i++){
//			for(int y =1 ;y<10 ;y++){
//				System.out.printf("[%d]*[%d]=[%d] \n",i,y,i*y);
//			}
//			System.out.println();
//		}
		
		// point for (절친 :continue, break)
		//continue(이하 구문 skip)
		//break(블럭을 탈출)
		for(int i =2 ; i<10 ;i++){
			for(int y =1 ;y<10 ;y++){
				if(i==y)continue;
				System.out.printf("[%d]*[%d]=[%d] \n",i,y,i*y);
//				if(i!=y){
//					System.out.printf("[%d]*[%d]=[%d] \n",i,y,i*y);
//				}
			}
			System.out.println();
		}
		
		for(int i = 2; i<10 ; i++){
			for(int y = 1; y<10;  y++){
				if(i==y)break;
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//point (공식)
		for(int i=2; i<10 ;i++){
			for(int j=1 ; j<i ; j++){
				
			}
		}
		for(int i = 100; i>=0 ;i--){
			System.out.println(i);
		}
		
		//피보나치 수열
		
		for(int i=0 ;i<10 ; i++){
			
		}
	}
}
