
public class Ex05_Operator {
	public static void main(String[] args) {
		int sum = 0;
		//sum = sum+1;
		//���� : += , -=, *=
		sum += 1;
		sum-=1;
		
		
		//���� ����
		//�̻� , ����(=)
		//�ʰ� , �̸�
		
		//���࿡ ������ 90 �̻��̶�� A
		//���࿡ ������ 90 �̻��̰� 95 �̻��� A+
		//95�� �̻��� �ƴ� �������� A-
		int huk = 70;
					// ����      ? ��?�������� ��: ���� : ����    
		String hukj = (huk>=90)?(huk>=95)?"A+":"A-":(huk>=80)?"B":(huk>=70)?"C":(huk>=60)?"D":"C";
		System.out.println(hukj);
		
		//�����Դ�
		int score = 60;
		String grade="";
		System.out.println("����� ������ :"+ score);
		
		if(score >= 90){
			grade ="A";
			//95�̻��̸� A+ �ƴϸ� A-
			//���� �� 
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
		System.out.println("����� ������ :"+ grade);
	}
}
