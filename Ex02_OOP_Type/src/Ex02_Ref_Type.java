import kr.or.kosta.Emp;

//����̶�� ���赵�� ������� �մϴ�.
//����� ���, �̸�, ��ȭ��ȣ�� ������ �ְ�
//����� ���, �̸� ��ȭ��ȣ�� ������ ����ϴ� ����� ������ �ֽ��ϴ�.
//����� �����̰� , �̸��� �������� , ��ȭ��ȣ�� ���� ���� �Դϴ�.

public class Ex02_Ref_Type {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.empno =20;
		emp.empname ="�̼���";
		emp.phon = "010-2673-9821";
//		System.out.println(emp.empno);
//		System.out.println(emp.empname);
//		System.out.println(emp.phon);
		emp.empPrint();
		
		Emp emp2= new Emp();
		emp2.empno = 10;
		emp2.empname ="ȫ�浿";
		emp2.phon = "010-1111-9821";
//		System.out.println(emp2.empno);
//		System.out.println(emp2.empname);
//		System.out.println(emp2.phon);
		emp2.empPrint();
		
	}

}
