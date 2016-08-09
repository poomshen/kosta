class car{
	int door;
	String color;
	
}


public class Ex06_Array2 {
	public static void main(String[] args) {
		int [][]score = new int[3][3];
		System.out.println(score [0][1]);
		
		score[0][0] = 100;
		score[0][1] = 200;
	
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		//행의 갯수 : 배열이름.length            >socre.length
		//열의 개수 : 배열이름[행첨자].length	 >socre[i].length
		for(int i = 0 ; i< score.length;i++){
			for(int y=0; y<score[i].length; y++){
				System.out.println("이곳은 :"+score[y][i]+"이고");
			}
		}
		
		//int[] a= new int [] {10,20,30}
		int [][] score2 = new int[][]{{1,2}//0행
		,{3,4}//1행
		,{5,6}//2행
		};
		
		for(int i = 0 ; i< score2.length;i++){
			for(int y=0; y<score2[i].length; y++){
				System.out.println("이곳은 :"+score2[i][y]+"이고");
			}
		}
		
		//int[] b= {1,2,3}
		//for문
		//개선문
		//C# :for(type 변수명 in 배열 or 컬랙션 ){출력}
		//java : for(type 변수명  : 배열 or 컬렉션 ){출력}
		
		int [] err = {5,6,7,8,9,10};
//		for(int i=0; i<err.length;i++){
//			System.out.println(err[i]);
//		}
		for(int i :err){
			System.out.println(i);
		}
		
		String[] strarr= {"가","나","다","라"};
		for(String e:strarr){
			System.out.println(e);
		}
		
		//자 이제 도전
		int [][]score3 = new int[][]{{11,12},{13,14},{15,16}};
		for(int[] su1 : score3){
			for(int su2: su1){
				System.out.println(su2);
			}
		}
	//////////////////////////////////////////////////////////////
		car[] carArr= new car[2];
		carArr[0] = new car();
		carArr[0].color ="gold";
		carArr[0].door =4;
		
		carArr[1] = new car();
		carArr[1].color ="red";
		carArr[1].door =2;
		
		for(int i=0 ;i<carArr.length;i++){
			System.out.println();
		}
		
		for(car i : carArr){
			System.out.println("  "+i.color+" : " +i.door);
		}
		
		int[][]arr5= {
				{1,2},
				{3,4,5},
				{1,2,3,4}
		};
		
		for(int i = 0 ; i< arr5.length;i++){
			for(int y=0; y<arr5[i].length; y++){
				System.out.println("이곳은 :"+arr5[i][y]+"이고");
			}
		}
 	}
}
