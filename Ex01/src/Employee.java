//설계도 그리기

public class Employee {
	
	//상태 정보를 담을 수 있는 공간 (변수)
	//접근자 + 타입(자료형) + 변수명 
	private int empno;
	private String ename;
	public String job;
	public int sal;
	
	//행위정보(함수, method)
	public void empPrint(){
		System.out.println("empno:"+ this.empno);
		System.out.println("ename:"+ this.ename);
		System.out.println("job :"+ this.job);
		System.out.println("sal :"+ this.sal);
	}
	
	public void InsertEmpno(int no){
		empno = no ;
	}
	
	public void InsertEname(String string){
		ename = string;
	}
}
