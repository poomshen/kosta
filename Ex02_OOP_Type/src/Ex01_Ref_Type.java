import kr.or.kosta.Person;
import kr.or.kosta.Tv;

//kr.or.kosta.package �ȿ� �ִ� Person ���赵��
//������ ��üȭ �� �깰(��ü,�ν��Ͻ�) ����
public class Ex01_Ref_Type {

	public static void main(String[] args) {
		Person p;//����: personŸ�� ,p����(��������,��ü����)
//		System.out.println("p ���� ��"+p);
		p = new Person();
		//�� �ڵ�� ������ ����� �Ҵ��� �и�
		System.out.println("p�� :"+p);
		
		Person p2 = new Person();//����� �Ҵ� ����
		System.out.println("p2��  :" + p2);
		
		p.age = 100;
		p.name = "ȫ�浿";
		System.out.printf("�̸��� %s �̰�,���̴� %d �Դϴ�.\n",p.name,p.age);
		
		System.out.println(p==p2);
		
		p2 = p;//p��� ���������� ������ �ִ� ���� p2 �Ҵ�
		System.out.println(p==p2);
		System.out.printf("�̸��� %s �̰�,���̴� %d �Դϴ�.\n",p2.name,p2.age);
		
		
		//Tv��� ���赵�� ������ ��ü�� �����
		//�귣�� �̸��� ä�������� ����غ�����
		Tv tv=new Tv();
		tv.brandname ="�Ｚ";
		tv.ch = 5 ;
		tv.ch_Down();
		tv.ch_Down();
		System.out.println("tv �귣�� �̸� :"+tv.brandname);
		System.out.println("tv�� ä�� ���� :"+tv.ch);
		
		//���� �ּҰ��̶�� ���� �����ϴ�.(�ּҰ�)
		System.out.println("tv hashcode() :"+ tv.hashCode());
		
		Tv tv2 =new Tv();
		System.out.println("tv2 hashcode()"+ tv2.hashCode());
		
		tv2 = tv ;
		System.out.println("�ּҰ� �Ҵ� ����");
		System.out.println("tv hashcode() :"+ tv.hashCode());
		System.out.println("tv2 hashcode()"+ tv2.hashCode());
		
		
		System.out.println("�ּҰ� :"+tv);
		System.out.println("�ּҰ� :"+tv2);
		//kr.or.kosta.Tv@1b6d3586
		//Ŭ���� �̸� +@���� +�ּҰ� ���� ��� ���
		
		//���ú��� �Ϸ��� �� ~>
		//���赵�� ����� ���赵�� ������� ���� ���� ����(����)
		//class ����� Ŭ������ �޸𸮿� �÷��� ��ü�� ����� ������ �ϰ�...
		
		
	}

}
