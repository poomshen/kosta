import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//ArrayList (key point)


public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		System.out.println(arraylist.size());
		for(int i = 0; i<arraylist.size(); i++){
			System.out.println(arraylist.get(i));
		}
		//�ڷᱸ�� ����
		System.out.println("���� : [0] :" +arraylist.get(0));
		arraylist.add(0, 111);
		System.out.println("���� : [0] :" +arraylist.get(0));
		//����(overwrite)
		//�߰��� ������ ���� : (�������� �ڷ� �и��ϴ�.)
		System.out.println(arraylist.toString());
		//������ �߰�, ���� (���ɰ��)
		//�������� ������ �߰� ����
		
		//ó���ϸ�(�Լ��� ���) �� �߿�
		System.out.println(arraylist.contains(200));//�� 200�� ������ �ִ�?
		System.out.println(arraylist.contains(202));
		
		System.out.println(arraylist.isEmpty());//�� ����ִ�?
		arraylist.clear();
		System.out.println(arraylist.isEmpty());//�� ����ִ�?
		System.out.println("size() : "+arraylist.size());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		arraylist.add(104);
		arraylist.add(105);
		System.out.println(arraylist.toString());
		
	      ArrayList list = new ArrayList();
	      list.add("��");
	      list.add("��");
	      list.add("��");
	      list.add("��");
	      System.out.println(list.toString());
	      list.remove("��");      //���� ���߿��� ���� ù��° �� ����
	      System.out.println(list.toString());
		
		Object object =  arraylist.remove(0);
		System.out.println(object);
		
		System.out.println(arraylist.toString());
		
		//ArrrayList = implements List
		//List �� ArrayList�� �θ� Ÿ���̴�.
		
		//�θ�Ÿ��       �ڽ�Ÿ��
		//List a = new ArrayList();
		//�� �ڽ��� �� �� ���� �ִ�.
		
		//�������̽��� ����� ���� ���
		//������ - List �������̽� > Arraylist , vector ����
		//ArrayList �θ�� List �̴�
		//������ : ��Ӱ��迡�� �θ�Ÿ�� �������� �ڽ��� ������ü�� ��������
		//Java API �ڵ�� �������� ��ȣ
		
		List list2 = arraylist.subList(0, 2);//arraylist.sublist�� �θ��� List�� �����ش�.
		//���� : list �������̽��� �ڿ�(������)
		//�������̽��� �ݵ�� �����Ǿ�� (���� �Ǵ� �ڵ�� ArrayList �����ڵ�)
		System.out.println(list2.toString());
		list2.add(333);
		list2.add(444);
		System.out.println(list2.toString());
		
		
		//�ٿ�ĳ���� �θ� �ڽ� Ÿ������ 
		try {
			ArrayList list3  = (ArrayList)arraylist.subList(0, 2);
		} catch (Exception e) {
//			System.out.println(e.getLocalizedMessage());
		}
		
		//������ ���� 
		
		
		ArrayList alist = new ArrayList<>();
		alist.add(50);
		alist.add(5);
		alist.add(10);
		alist.add(4);
		alist.add(9);
		alist.add(45);
		
//		Collections.reverse(alist);//������
		System.out.println(" ss"+alist.toString());
		Collections.sort(alist);//��������
		System.out.println("sss"+alist.toString());
		Collections.reverse(alist);//������ ���������� ��
		System.out.println("dd"+alist.toString());
		
	}
}
