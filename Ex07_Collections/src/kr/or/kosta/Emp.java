package kr.or.kosta;

public class Emp {
	private  int empno;
	private String ename;
	private String job;
	
	public Emp(int empno , String ename, String job){
		this.empno = empno;
		this.ename = ename;
		this.job  =job;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}
	
	//���ٶ��̵� ���޴ٸ� �ȳ���
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}
	
	
}
