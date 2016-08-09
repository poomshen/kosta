import kr.or.kosta.Emp2;
import kr.or.kosta.Hp;

public class Ex17_getter_setter {
	public static void main(String[] args) {
		Hp h = new Hp();
//		h.number 접근 불가class private 캡슐화
		h.setNumber(1111);
		
		
		Emp2 e2 = new Emp2();
		e2.setEmpno(8888);
		
		///setter,setter 함수는 캡슐화된 맴버필드에서 대해서 읽고 쓸수있는 함수
	}
}
