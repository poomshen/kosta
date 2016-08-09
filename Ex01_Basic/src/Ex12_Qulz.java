
public class Ex12_Qulz {
    public static void main(String[] args) {
    	for(int i = 0 ;i<5 ; i++){
    		for(int y =0 ; y<=i ;y++){
    			for(int e= 0,x=0 ;e<5;){
    				star_make3(5, e, " ", "*");
    				++x;
    				if(x!=i){
    					e++;
    					break ;
    				}else {
    					System.out.println();
					}
    			}
    		}
//    		System.out.println();
    	}
    
    }
	
    static void star_make1(int su,int i,String ch){
    			System.out.print(ch);
    }
    
	//정삼각형 만들기
    static void star_make3(int su,int i,String ch1,String ch2){
            for (int y = su; y > i; y--) {
                System.out.print(ch1);
            }
            for (int e = 0; e < i * 2 + 1; e++) {
                System.out.print(ch2);
            }
            for (int q = su;q >i ;q--){
            	System.out.print(ch1);
            }
    }
    //역 정삼각형 만들기
    static void star_make4(int su,String ch1, String ch2){
        for (int i = 0 , x=su ; i < su; i++,x--) {
            for (int y = 0; y < i + 1; y++) {
                System.out.print(ch1);
            }
            for (int e = x*2-1 ; e > 0; e--) {
                System.out.print(ch2);
                
            }
            System.out.println();
        }
    }

}
