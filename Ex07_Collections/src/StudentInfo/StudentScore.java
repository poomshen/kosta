package StudentInfo;

public class StudentScore extends StudentInfo {
	public StudentScore() {
		// TODO Auto-generated constructor stub
	}

	public StudentScore(String major, int colleage, String name, int korean, int english, int maths) {
		super(major, colleage, name, korean, english, maths);
		// TODO Auto-generated constructor stub
	}
	/*총점을 리턴하는 함수를 가지고 있다
	위 평균을 리턴하는 함수*/
	public int sumcal(){
		sum = korean + english + maths;
		return sum;
	}
	public double averageCal(){
	     average = sum/3;
		return average;
	}
	public void calpint(){
		System.out.println("총합  :"+ sum +" 평균 :"+average);
	}
}
