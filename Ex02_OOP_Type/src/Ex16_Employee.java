import kr.or.kosta.Employee;

public class Ex16_Employee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1000, "������", "����");
		e1.employeeInfo();
		
		Employee e2 = new Employee(50,"��","IT");
		e2.employeeInfo();
		
		e2.employeeInfo("������");
		
		Employee e3 =new Employee();
		e3.employeeInfo();
	}
}
