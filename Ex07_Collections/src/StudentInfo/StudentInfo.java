package StudentInfo;

public class StudentInfo  {
/*	�а� (ex:�İ�,����)
	�й� (ex:201501,201502)
	�̸� (ex:ȫ�浿)
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
		System.out.println("�а� :" + major + " �й� : "+ colleague +" �̸� : "+name);
		System.out.println("���� : "+korean + " ���� :"+ english +" ���� :"+maths);
	}
}
