package tset;

public class tset {
	public static void main(String[] args) {
		int lottosu = 45;
		int []lotto = new int [lottosu];
		for(int i= 0; i<lottosu; i++){
			lotto[i] = i+1; 
		}
		for(int x :lotto){
			int n= (int)((Math.random()*45));
			
			int temp = x;
			x = n ;
			n = temp;
			System.out.println(x);
		}
		
		
	}
}
