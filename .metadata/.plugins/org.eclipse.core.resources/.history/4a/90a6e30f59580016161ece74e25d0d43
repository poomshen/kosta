import java.util.ArrayList;
import java.util.Iterator;

import kr.or.kosta.CopyEmp;
import kr.or.kosta.Emp;

public class Ex10_Generic_Quiz {
	public static void main(String[] args) {
		
		//1.Emp 클래스를 사용해서 사원 3명 생성
		//단 사원은 ArrayList 추가 (Generic) 사용
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000,"김씨","대리"));
		emplist.add(new Emp(2000,"박씨","과장"));
		emplist.add(new Emp(3000,"홍씨","부장"));
		
		//2.사원의 정보(사번, 이름 ,직종) 개선된 for문으로 출력하세요
		//단 toString() 사용하지 마세요
		for(Emp e : emplist){
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" +e.getJob());
		}
		
		//일반 for문으로 출력
		for(int i = 0 ; i < emplist.size() ; i++){
			 Emp e = emplist.get(i); 
			 System.out.println(e.getEmpno() +"-"+ e.getEname() +"-" + e.getJob());
		}

		//3.
		//Emp 클래스와 같은 구조는 갖는 CopyEmp 클래스 생성
		//job 변수 대신에 int sal 추가하고 
		//member field 모두 getter , setter 구현하세요
		
		//3.1 ArrayList<> 사용해서 사원 3명을 만드세요
		//예) 100 , "김" 1000
		//예) 200 , "박" 2000
		//예) 300 , "이" 3000
		ArrayList<CopyEmp> copylist = new ArrayList<CopyEmp>();
		copylist.add(new CopyEmp(100, "김", 1000));
		copylist.add(new CopyEmp(200, "박", 2000));
		copylist.add(new CopyEmp(300, "이", 3000));
		//3.2 200번 사원의 급여을 5000으로 인상해서 출력
		System.out.println("----------------------------------");
		for(CopyEmp e : copylist){
			if(e.getEmpno() == 200){
				e.setSal(5000);
				System.out.println(e.toString());
				//System.out.println(e.getEmpno() + " : " + (e.getSal() + 3000));
			}
		}
		
		//3.3 300번 사원의 이름을 "궁금해" 라고 수정하고 출력 (setter)
		for(CopyEmp e : copylist){
			if(e.getEmpno() == 300){
				e.setEname("궁금해");
				System.out.println(e.toString());
			}
		}
		
		//4.사원정보를 Iterator 를 사용해서 출력해보세요
		//Generic 사용하기
		System.out.println("4번****************************");
		Iterator<CopyEmp> it = copylist.iterator();
		while(it.hasNext()){
			CopyEmp m = it.next();
			System.out.println(m.getEmpno());
			System.out.println(m.getEname());
			System.out.println(m.getSal());
		}
	}

}
