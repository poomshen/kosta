import kr.or.kosta.Emp;

//사원이라는 설계도를 만들려고 합니다.
//사원은 사번, 이름, 전화번호를 가지고 있고
//사원의 사번, 이름 전화번호를 정보를 출려하는 기능을 가지고 있습니다.
//사번은 숫자이고 , 이름은 문자정보 , 전화번호도 문자 정보 입니다.

public class Ex02_Ref_Type {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.empno =20;
		emp.empname ="이성준";
		emp.phon = "010-2673-9821";
//		System.out.println(emp.empno);
//		System.out.println(emp.empname);
//		System.out.println(emp.phon);
		emp.empPrint();
		
		Emp emp2= new Emp();
		emp2.empno = 10;
		emp2.empname ="홍길동";
		emp2.phon = "010-1111-9821";
//		System.out.println(emp2.empno);
//		System.out.println(emp2.empname);
//		System.out.println(emp2.phon);
		emp2.empPrint();
		
	}

}
