package StudentInfo;

public class StudentScore extends StudentInfo {
	public StudentScore() {
		// TODO Auto-generated constructor stub
	}

	public StudentScore(String major, int colleage, String name, int korean, int english, int maths) {
		super(major, colleage, name, korean, english, maths);
		// TODO Auto-generated constructor stub
	}
	/*������ �����ϴ� �Լ��� ������ �ִ�
	�� ����� �����ϴ� �Լ�*/
	public int sumcal(){
		sum = korean + english + maths;
		return sum;
	}
	public double averageCal(){
	     average = sum/3;
		return average;
	}
	public void calpint(){
		System.out.println("����  :"+ sum +" ��� :"+average);
	}
}
