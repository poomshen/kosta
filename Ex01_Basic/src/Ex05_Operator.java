
public class Ex05_Operator {
	public static void main(String[] args) {
		int sum = 0;
		//sum = sum+1;
		//줄임 : += , -=, *=
		sum += 1;
		sum-=1;
		
		
		//학점 계산기
		//이상 , 이하(=)
		//초과 , 미만
		
		//만약에 학점이 90 이상이라면 A
		//만약에 학점이 90 이상이고 95 이상라면 A+
		//95점 이상이 아니 나머지는 A-
		int huk = 70;
					// 질문      ? 참?참에대한 참: 거짓 : 거짓    
		String hukj = (huk>=90)?(huk>=95)?"A+":"A-":(huk>=80)?"B":(huk>=70)?"C":(huk>=60)?"D":"C";
		System.out.println(hukj);
		
		//선생님답
		int score = 60;
		String grade="";
		System.out.println("당신의 점수는 :"+ score);
		
		if(score >= 90){
			grade ="A";
			//95이상이면 A+ 아니면 A-
			//조건 비교 
			if(score >=95){
				grade += "+";
			}else{
				grade += "-";
			}
		}else if(score >= 80){
			grade ="B";
			if(score >=85){
				grade += "+";
			}else{
				grade += "-";
			}
		}else if(score >= 70){
			grade ="C";
			if(score >=75){
				grade += "+";
			}else{
				grade += "-";
			}
		}else if(score >= 60){
			grade ="D";
			if(score >=65){
				grade += "+";
			}else{
				grade += "-";
			}
		}else{
			grade ="F";
		}
		System.out.println("당신의 학점는 :"+ grade);
	}
}
