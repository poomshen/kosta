
public class Ex02_ArrayBasic_Quiz {
	// �� �л���
	//���� ������ ��
	//���� ������ ���
	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		
		for(int i = 0 ; i<jumsu.length ; i++){
			sum += jumsu[i];
			if(i == jumsu.length-1){
				average = sum/(int)(jumsu.length); 
			}
		}
		System.out.println(jumsu.length+" : "+sum+" : "+average );

		
		int []rndnum = new int[10];
		for(int i=0;i <rndnum.length;i++){
			rndnum[i] = i;
		}
		
		for(int y=0; y<100; y++){
			int n = (int)((Math.random() * 10));
			//temp�� 0��° ���� �ְ�  0��° ���� ������° ���� �ִ´�. 
//			�׸��� ���� ��°�� �� �ٽ� 0��° ���� �ִ´�.
			int temp= rndnum[0];
			rndnum[0]=rndnum[n];
			rndnum[n] =temp;
		}
		for(int i = 0; i<rndnum.length; i++){
			System.out.printf("rndnim[%d] = %d \n",i,rndnum[i]);
		}
		
		//
		int []lotoo = new int [45];
		
		for(int i=0;i<lotoo.length ;i++){
			lotoo[i] = i+1;
		}
		
		for(int y=0; y<100000; y++){
			int n =(int)((Math.random()*45));//50��
//			int n =(int)((Math.random()*10));//50��
//			n = (n>45)?n-5:n;
			int temp = lotoo[0];
			lotoo[0] = lotoo[n];
			lotoo[n] = temp;
		}
		int temp =0;
		for(int i = 0; i<6; i++){
			for(int j=0; j<6; j++){
				if(lotoo[i]<lotoo[j]){
                    temp=lotoo[i];
                    lotoo[i]=lotoo[j];
                    lotoo[j]=temp;
                }
			}
		}
		for(int i= 0; i<6; i++){
			System.out.print(" "+(i+1)+"��° ��ȣ:"+ lotoo[i]);
		}
	}
		
//�߰� :class���赵 ��ȯ
// ���� �߰� (6�� �迭�� ���� 35 < sum<45)
//���� ����: �߰�
}
