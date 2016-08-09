import kr.or.kosta.Card;
import kr.or.kosta.Scard;

public class Ex06_Card_Object {
	public static void main(String[] args) {
		//요구사항
		//각 카드 20 을 만들어 주세요
		//각 카드의 숫자, 모양은 다르다
		//그리고 h, w 변경 될 수 있다.
		
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.card_Info();

		Card c2 = new Card();
		c.number = 2;
		c.kind = "heart";
		c.card_Info();
		
		//52번 코드 생성
		//문제 : 고객이 요구사항 카드의 높이 변경 :12
		//고민 : 52번의 수정의 통해서 요구 사항을 반영할지?
		//그렇다면 : 52장의 카드의 높이 , 넓이를 한번에 변경 할 방법이 없을까?
		//52장의 카드가 공유되는 높이, 넓이 > 설계도의 변경
		//static 사용
		
		Scard s = new Scard();
		s.h = 50;
		s.w = 100;
		s.number = 1;
		s.kind ="heart";
		s.card_Info();
		
		Scard s2 = new Scard();
		s2.number = 7;
		s2.kind ="heart";
		s2.card_Info();
		
		
		//52장 > h:50 , w:100
	}

}
