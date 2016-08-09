import kr.or.kosta.Employee;

public class Ex16_Employee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1000, "김유신", "영업");
		e1.employeeInfo();
		
		Employee e2 = new Employee(50,"유","IT");
		e2.employeeInfo();
		
		e2.employeeInfo("관리자");
		
		Employee e3 =new Employee();
		e3.employeeInfo();
	}
}
