
public class Program {

	public static void main(String[] args) {
		//���赵 (Employee)
		//���赵�� ������ ��üȭ�� �깰 (��ü)
		//���ĵ� ���赵�� ������ �� ���� ����Ʈ�� ���´�
		
		Employee kglim = new Employee();
		//kglim.empno =1000;
		kglim.InsertEmpno(1000);
		kglim.job = "����";
		kglim.InsertEname("�̼���");
		kglim.sal = 100000000;
		kglim.empPrint();
		
		System.out.println("");
		//hong
		Employee  hong = new Employee();
		hong.InsertEmpno(10000);
		hong.job = "���";
		hong.InsertEname("ȫ�浿");
		hong.sal = 1000;
		hong.empPrint();

	}

}
