
public class Ex04_Operator {
	public static void main(String[] args) {
		//������ (+,-,*,/,%������)
		int result = 100/100;
		System.out.println(result);

		int i = 10;
		++i; //��ġ ����
		System.out.println("++i  :" +i);
		i++; //��ġ ����
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
		
		//������ point
		//�ڹٿ����� ���� ��Ģ
		//������ ��� ������ int�� ��ȯ�� ó��
		//byte + byte => int + int ���
		//byte b =100 ; byte c = 101;
		//b+c
		
		byte b =127;
		byte c =127;
		int result3 = b+c;
		byte result4 = (byte)(b+c); //why: b+c��� int
		System.out.println("result4 :"+ result4);
		
		//byte + short =>int+int
		//char +char => int+int
		//�Ǽ�(�Ǽ��� ���� ������ �Ǽ��� ����)
		//float + int => float + float
		//float + long => float + float
		//float + double => double + double
		
		float num2 = 10f;
		int num3 = 20;
		
//		float result5 =num2 + num3;
		int result5 = (int)(num2+num3);//ūŸ���� ���� Ÿ������ ���� �ս�
		
		char c2 = '!';//33
		char c3 = '!';
		int ch_result = c2+c3;
		System.out.println(ch_result);
		//����� �ٽ� ���ڰ����� ���� �ʹ�?
		char ch_resut2 = (char)ch_result;
		System.out.println(ch_resut2);
		
		
		//������
		int sh = 10/8;
		System.out.println("/ ��  :" + sh);
		
		sh = 10%8;
		System.out.println("������ :" + sh);
		
		//1~10������ ������ ¦���� ���ϼ��� (¦���� ��)
		//��Ģ....
		// % �������� Ȱ��
		int sum = 0;
		for(int j= 1; j<=10; j++){
//			System.out.println("���ۺ���");
			if(j%2 == 0){
				sum =sum + j;
				System.out.println("j: "+j);
			}
		}
		System.out.println("sum : " + sum);
		
		// == ���� ��
		if(10== 10.0f){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		//!= ���� ������
		if('A'!= 65){//'A'�� 65 ������ ���� �ʴ�?
			System.out.println("true");
			//���� �ʾƿ�
		}else{
			System.out.println("false");
			//���ƿ�
		}
		
		//*�ϱ�(point) : ���� ������(���׾ȿ� ���׿�����)
		int p = 10;
		int k = -10;
		//���࿡ p�� 10���ٸ� p��� ���� ���� �ְ� �����ʴٸ� k�� result�� ���� �ִ´�.
		int result6 = (p==10) ? p:k;
		// ?�տ� ���ǽ��� true �̸� : �տ� ���� ���ϰ�
		// ? �տ� ���ǽ��� false�̸� : �ڿ� ���� ���ϰ�
		/*
		 if(p == 10){
		  	result6 = p;
		  }else{
		  	result6 = k;
		  }
		*/
		System.out.println(result6);
		
		/*
		   bit���꿡 �ʿ�
		 	����ǥ  OR  ,  AND
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
		//������
		// | or & AND������
		// bit����
		System.out.println(x|y);
		System.out.println(x&y);
		//������ 3�� 2����
		//128, 64, 32, 16, 8, 4, 2 ,1
		//                 0  0  1  1 3�� ������
		//                 0  1  0  1 5�� ������
		//               > 0  1  1  1 2���� >10����
		//               > 4+2+1=7
		
		//������ 3�� 2����
		//128, 64, 32, 16, 8, 4, 2 ,1
		//                 0  0  1  1 3�� ������
		//                 0  1  0  1 5�� ������
		//              >  0  0  0  1  1
		//              >  1
		
		//�ϱ�(point) &&(and) , ||(or) (������)
		//���� �ӵ��� ������ (TURE,FALSE)
		//if(10> 0 && -1 >1 && 100> 2 && 1>-1 &&.....)
		//{} //-1 >1 > false �ڿ� ������ �����ʰ� else{}
		
		//if(10> 0 || -1 >1 || 100> 2 || 1>-1 ||.....)
				//{} //-1 >1 > true �ڿ� ������ �����ʰ� if{}
		
	}
}
