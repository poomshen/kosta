
public class Ex07_Total_Quiz {
	public static void main(String[] args) {
		int[][] score = {
				{50,60,40}, //0행 철이 국,영,수	
				{100,70,80}, //0행 훈이 국,영,수	
				{55,60,80} //0행 용이 국,영,수	
		};
		//문제
		//1. 각 과목별 총점 , 평균을 구하세요
		//국어 : 50+100+55 > 국어총합 300, 평균
		//2. 각 학생의 국어 , 영어 수학점수의 총점 , 평균
		//철이 총점 :150, 평균15.0
		int []sum = {0,0,0};
		String []note ={"국어","영어","수학"};
		String []note2 ={"철수","영희","삼식이"};
		int []sum1 = {0,0,0};
		float avarage= 0f;
		
		for(int []i : score){
			int su=0;
			su++;
			for(int j=0 ; j<score.length;j++){
				sum1[j] += i[j];
				avarage = sum1[j]/3;
			}
			System.out.println(" 과목 :"+note[su]+" 총합"+sum1[su] +" 평균: "+avarage);
		}
		for(int j =0 ; j<score.length ;j++){
			System.out.print("학생:"+note2[j]+" ");
			for(int i :score[j]){
				sum[j] += i;
				System.out.print("과목:"+note[j]+"점수"+i+"\t");
			}
			avarage = sum[j]/3;
			System.out.println(" 합 :"+sum[j]+"평균:"+ avarage);
		}
		
	}
}
