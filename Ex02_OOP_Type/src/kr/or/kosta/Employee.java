package kr.or.kosta;

public class Employee {
	private int empno;
	private String  ename;
	private String job;
	private static int  totalempno;
	public Employee() {
		empno = 999;
		ename = "�ӽ�";
		job = "�ӽ���";
	}
	
	public Employee(int no,String name, String b){
		empno = no;
		ename = name;
		job = b;
		totalempno++;
	}
	public  void employeeInfo(){
		System.out.printf("���: %d , �̸�:%s ,����:%s ",empno,ename,job);
	}
	public void employeeInfo(String user){
		System.out.printf("��ȸ��:%s  ��ü��%d",user,totalempno);
	}
}
