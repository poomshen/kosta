import kr.or.kosta.Emp;

public class Ex05_Array_Object {
	public static void main(String[] args) {
		Emp []em = new Emp[]{new Emp(10,"하하"),new Emp(1,"유재석"),new Emp(2, "박명수")}; 
		
		for(int i=0;i<em.length; i++){
			em[i].emplist();
		}
		
		///////////////////////////////////////////////////////////////////////////////
		Emp[] emplist =new Emp[5];
		
		//////////////////////////////////////////////////////////////////////////////
		Emp[] emplist2 = {new Emp(10,"하하"),new Emp(1,"유재석"),new Emp(2, "박명수")};
		
	}
}
