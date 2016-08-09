
public class Ex02_ArrayBasic_Quiz {
	// 총 학생수
	//국어 점수의 합
	//국어 점수의 평균
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
			//temp에 0번째 수를 넣고  0번째 수는 랜덤번째 수를 넣는다. 
//			그리고 랜덤 번째수 는 다시 0번째 수를 넣는다.
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
			int n =(int)((Math.random()*45));//50개
//			int n =(int)((Math.random()*10));//50개
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
			System.out.print(" "+(i+1)+"번째 번호:"+ lotoo[i]);
		}
	}
		
//추가 :class설계도 변환
// 조건 추가 (6개 배열의 합이 35 < sum<45)
//자율 조건: 추가
}
