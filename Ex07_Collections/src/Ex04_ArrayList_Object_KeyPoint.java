import java.util.ArrayList;

import kr.or.kosta.Emp;

public class Ex04_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {
		//Emp 라는 설계도를 통해서 사원 1명을 만드세요
		///배열(정적)을 사용해서 사원 3명를 만들어라
		Emp[] emp2 = new Emp[]{new Emp(1200,"홍길동","xe"),new Emp(1500,"이성준","cs"),new Emp(2000,"이만식","we")};
		
//		for문 (사원정보)
		for(int i =0;i<emp2.length ; i++){
			System.out.println(emp2[i].toString());
		}
		
//   	개선된 for문(사원정보)
		for(Emp e : emp2){
			System.out.println(e.toString());
		}
		
		//////////////////////////////////////////////////////
		//여기까지 복습 내용//////////////////////////////////////
		
		//collection  클래스 사용해서..
		ArrayList emps = new ArrayList<>();
		Emp emp = new Emp(1000, "홍길동", "it");
		Emp emp3 = new Emp(1030, "길동", "d");
		Emp emp4 = new Emp(4000, "홍동", "i2");
		emps.add(emp);
		emps.add(emp3);
		emps.add(emp4);
//		System.out.println(emps.toString());

//		WHy ) default: ArrayList 배열방의 TYPE : Objact
//		드럽게 불편하다
//		
		Emp p = (Emp)emps.get(0);
		System.out.println(p.toString());
//		System.out.println("!!!!!!!!!");
		System.out.println(((Emp)emps.get(0)).toString());
		
		for(int i = 0 ; i<emps.size() ; i++){
//			System.out.println("@@@@@@@");
			System.out.println(emps.get(i));
//			System.out.println("사원 정보 " +((Emp)emps.get(i)).getEmpno() 
//					+((Emp)emps.get(i)).getEname()+((Emp)emps.get(i)).getJob());
		}
//		System.out.println("aaaaaaaaa");
//		불편하다.
		for(Object ob : emps){
//			System.out.println(ob.toString());
			Emp m = (Emp)ob;
				 System.out.println(m.getEmpno()+"-"+m.getEname()+"-"+m.getJob());
		}
//		불편하여서
//		원인 ArrayList 배열의 타입이 Object
		//제널릭Generic
		ArrayList<Emp> emplit2 = new ArrayList<Emp>();
		emplit2.add(new Emp(1,"A","AA"));
		emplit2.add(new Emp(2,"B","Aa"));
		emplit2.add(new Emp(3,"c","AB"));
		
		for(Emp m :emplit2){
			System.out.println(m.getEmpno() +m.getEname()+m.getJob());
		}
		
	}
}
