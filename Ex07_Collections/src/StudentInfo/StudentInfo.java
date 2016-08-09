package StudentInfo;

public class StudentInfo  {
/*	학과 (ex:컴공,국문)
	학번 (ex:201501,201502)
	이름 (ex:홍길동)
*/
	String  major;
	int colleague;
	String name;
	int korean;
	int english;
	int maths;
	int sum;
	double average;
	public StudentInfo() {
	}
	
	public StudentInfo(String major , int colleage , String name, int korean , int english ,int maths) {
		this.major = major;
		this.colleague = colleage;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.maths = maths;
	}
	
	public  void stpint(){
		System.out.println("학과 :" + major + " 학번 : "+ colleague +" 이름 : "+name);
		System.out.println("국어 : "+korean + " 영어 :"+ english +" 수학 :"+maths);
	}
}
