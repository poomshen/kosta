
public class Ex09_Control_statement {
	public static void main(String[] args) {
		//��� (�ݺ��� : while , do~while, for��)
		
		//1~ 100������ ���� ���ϼ���
		//1+2+3..
		int sum = 0;
		for(int i =1 ;i <= 100 ; i++){
			//������
			//sum = sum+i;
			sum+= i;
		}
		System.out.println("1~100������ �� :" + sum);
		
		int sum2 =0;
		for(int i = 1; i<=100; i+=2){// i = i+2
			//System.out.println(i);
			sum2+=i;
		}
		System.out.println("1~100���� Ȧ���� :" +sum2);
		
		//1~100������ ¦���� ��
		int sum3 = 0;
		for(int i = 0;i<=100;i+=2){
			sum3+=i;
		}
		System.out.println("1~100������ ¦��:"+sum3);
		
		//point(��ø for��)
		//2~9�ܱ���
//		for(int i =2 ; i<10 ;i++){
//			for(int y =1 ;y<10 ;y++){
//				System.out.printf("[%d]*[%d]=[%d] \n",i,y,i*y);
//			}
//			System.out.println();
//		}
		
		// point for (��ģ :continue, break)
		//continue(���� ���� skip)
		//break(���� Ż��)
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
		
		
		//point (����)
		for(int i=2; i<10 ;i++){
			for(int j=1 ; j<i ; j++){
				
			}
		}
		for(int i = 100; i>=0 ;i--){
			System.out.println(i);
		}
		
		//�Ǻ���ġ ����
		
		for(int i=0 ;i<10 ; i++){
			
		}
	}
}
