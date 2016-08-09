
public class Program {

	public static void main(String[] args) {
		//설계도 (Employee)
		//설계도를 가지고 구체화된 산물 (객체)
		//아파드 설계도를 가지고 땅 위에 아파트를 짓는다
		
		Employee kglim = new Employee();
		//kglim.empno =1000;
		kglim.InsertEmpno(1000);
		kglim.job = "영업";
		kglim.InsertEname("이성준");
		kglim.sal = 100000000;
		kglim.empPrint();
		
		System.out.println("");
		//hong
		Employee  hong = new Employee();
		hong.InsertEmpno(10000);
		hong.job = "기술";
		hong.InsertEname("홍길동");
		hong.sal = 1000;
		hong.empPrint();

	}

}
