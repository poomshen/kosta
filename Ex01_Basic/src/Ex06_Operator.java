public class Ex06_Operator {
	public static void main(String[] args) {
		// 제어문
		// 조건문: if , if~else ,if~else if ~else
		// 조건문: switch(경우의 수가 많은 경우 : 간결)
		// switch(조건값){
		// case 100: 문장실행;
		// break;
		// case 90 : 문장실행;
		// break;
		// default : 문장
		// }

/*		int score = 80;
		switch (score) {
		case 100:
			System.out.println("100" + score);
			break;
		case 90:
			System.out.println("90" + score);
			break;
		case 80:
			System.out.println("80" + score);
			break;
		case 70:
			System.out.println("70" + score);
			break;
		case 60:
			System.out.println("60" + score);
			break;
		case 50:
			System.out.println("50" + score);
			break;
		default:
			System.out.println("불일치");
			
		}
//소스 정리
//ctrl + shift +F 들어쓰기
*/		int score = 80;
		switch (score) {
		case 100:System.out.println("100" + score);
		case 90:System.out.println("90" + score);
		case 80:System.out.println("80" + score);
		case 70:System.out.println("70" + score);
		case 60:System.out.println("60" + score);
		case 50:System.out.println("50" + score);
		default:System.out.println("불일치");
		}
		
		//난수 (랜덤값 : 임의의 추출값)
		//자바 API > 난수를 추출할 수 있게 제공
		//java.lang(default package) : open
		//Math 클래스 사용하기 위해서 상자를 열 필요없다.
		//a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		System.out.println("Math.random():"+Math.random());
		System.out.println("Math.random()*10:"+Math.random()*10);
		System.out.println("(int)(Math.random()*10):"+(int)(Math.random()*10));
		
		
		//정수 1~ 10까지의 난수 
		int mun = (int)(Math.random()*10)+1;
		if(mun <= 10){
			System.out.println(mun);
		}
		//시나리오
		//백화점 경품 추첨
		//경품 추첨시 1000점이 나오면
		//Tv, NoteBook, 냉장고 , 한우 , 양말 ,모든 경품
		//900 점이 나오면 
		
		int sum = (int)(Math.random()*10)+1;

		String guon = "";
		sum*=100;
		switch (sum) {
		case 1000:
			guon += "TV ";
		case 900 :
			guon += "NoteBook ";
		case 800 :
			guon +="냉장고 ";
		case 700 : 
			guon +="한우 ";
		case 600 :
			guon +="휴지 ";
		default:
			guon +="양말 ";
		}
		System.out.println("당신의 점수는"+sum+"이고 경품은 :" +guon);
	}
}
