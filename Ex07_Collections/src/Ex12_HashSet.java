import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Set �������̽� �����ϴ� Ŭ����
//Ư¡ : ����(x) , �ߺ�(x)
//HashSet Ŭ����

public class Ex12_HashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(1);
		hs.add(130);
		hs.add(144);
		System.out.println(hs.toString());
		System.out.println(hs.add(1));//�ߺ� ������ ��� (x)
		System.out.println(hs.toString());
		
		hs.add("A");
		hs.add("B");
		hs.add("F");
		System.out.println(hs.toString()); //���� ������ ��� ���� ��µ�
		
		Object [] obj = {"A","B","A","C","D","B"};
		HashSet hs2 = new HashSet<>();
		for(int i = 0; i<obj.length ; i++){
			hs2.add(obj[i]);
		}
		System.out.println(hs2.toString());//�ߺ�����  ����
		
		//Quiz 
		//������
		//���� ó��
		Set set = new HashSet();
		System.out.println(set.size());
		
		//Quiz (HashSet ����ؼ� 1~45 ���� ���� 6���� ��������) �� �ߺ�����
		int index = 0;
		for(int i = 0 ; set.size() <6 ; i++){
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			System.out.println(++index);
		}
		System.out.println(set.toString());
		
		//���� ���� sort (��������)���� �����ϰ� �;��
		//set �ڿ� ���� (����(x))
		List list  = new ArrayList(set); //(collection)
		System.out.println(list.toString());
		//helper class > Collections �����ִ� ����(����)
		Collections.sort(list); 
		System.out.println("���� : "+list.toString());
		//�⺻������ set�̶�� ������ ������ �� ���� �����̱� ������ �޾Ƽ� �������ش�.
		
 	}
}
