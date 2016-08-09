package Team03;

public class Team03_Task03 {
	public static void main(String[] args) {
	int count = accountRandom();
	System.out.println(count);
	}
	public static int accountRandom(){
		int account = 0;
		for(int i=1 ; i<10001 ;){
			int a = (int)((Math.random()*10));
			if(a>=2&&a<=7){
				account += a*i;
				i*=10;
			}
		}
		return account;
	}
}
