import kr.or.kosta.Card;
import kr.or.kosta.Scard;

public class Ex06_Card_Object {
	public static void main(String[] args) {
		//�䱸����
		//�� ī�� 20 �� ����� �ּ���
		//�� ī���� ����, ����� �ٸ���
		//�׸��� h, w ���� �� �� �ִ�.
		
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.card_Info();

		Card c2 = new Card();
		c.number = 2;
		c.kind = "heart";
		c.card_Info();
		
		//52�� �ڵ� ����
		//���� : ���� �䱸���� ī���� ���� ���� :12
		//��� : 52���� ������ ���ؼ� �䱸 ������ �ݿ�����?
		//�׷��ٸ� : 52���� ī���� ���� , ���̸� �ѹ��� ���� �� ����� ������?
		//52���� ī�尡 �����Ǵ� ����, ���� > ���赵�� ����
		//static ���
		
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
		
		
		//52�� > h:50 , w:100
	}

}
