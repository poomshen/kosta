package kr.or.kosta;

public class Emp {
	private int empno;
	private String ename;
	public Emp(int no, String name) {
		empno= no;
		ename = name;
	}
	public void emplist(){
		System.out.println("��� ��ȣ�� :"+ empno +"  ��� �̸� :"+ename);
	}
}
