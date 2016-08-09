package kr.or.kosta;

public class Employee {
	private int empno;
	private String  ename;
	private String job;
	private static int  totalempno;
	public Employee() {
		empno = 999;
		ename = "임시";
		job = "임시직";
	}
	
	public Employee(int no,String name, String b){
		empno = no;
		ename = name;
		job = b;
		totalempno++;
	}
	public  void employeeInfo(){
		System.out.printf("사번: %d , 이름:%s ,직종:%s ",empno,ename,job);
	}
	public void employeeInfo(String user){
		System.out.printf("조회자:%s  전체수%d",user,totalempno);
	}
}
