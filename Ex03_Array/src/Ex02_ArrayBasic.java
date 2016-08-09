
public class Ex02_ArrayBasic {
	public static void main(String[] args) {
		int[] score = new int []{79,88,97,54,56,95};
		int max = score[0];
		int min = score[0];
		
		
		//문제 (for, if)을 활용해서 최대값 , 최소
		 for(int i= 0; i<score.length ;i++){
//			 if(score[i]<max){
//				 max = score[i];
//			 }
//			 if(score[i]>min){
//				 min = score[i];
//			 }
			 max = (score[i]<max)?score[i]:max;
			 min = (score[i]>max)?score[i]:min;
		 }
		 System.out.println(max+" : "+min);
		 
		 int[] number = new int[10];
		 for(int i=0; i<score.length ;i++){
			number[i] = i+1; 
		 }
	}
}
