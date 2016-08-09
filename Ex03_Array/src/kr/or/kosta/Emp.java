package kr.or.kosta;

public class Emp {
	private int empno;
	private String ename;
	public Emp(int no, String name) {
		empno= no;
		ename = name;
	}
	public void emplist(){
		System.out.println("사원 번호는 :"+ empno +"  사원 이름 :"+ename);
	}
}
