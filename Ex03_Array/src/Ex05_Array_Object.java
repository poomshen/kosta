import kr.or.kosta.Emp;

public class Ex05_Array_Object {
	public static void main(String[] args) {
		Emp []em = new Emp[]{new Emp(10,"����"),new Emp(1,"���缮"),new Emp(2, "�ڸ��")}; 
		
		for(int i=0;i<em.length; i++){
			em[i].emplist();
		}
		
		///////////////////////////////////////////////////////////////////////////////
		Emp[] emplist =new Emp[5];
		
		//////////////////////////////////////////////////////////////////////////////
		Emp[] emplist2 = {new Emp(10,"����"),new Emp(1,"���缮"),new Emp(2, "�ڸ��")};
		
	}
}
