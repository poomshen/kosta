import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map �������̽� �����ϴ� Ŭ����
//Map  (Ű, �� ) �ֹ迭
//ex) ������ȣ (02,����) (033, ��⵵)
//Ű : �ߺ� (x) , �� : �ߺ�(0)


//HashTable(��) : ����ȭ�� ����
//HashMap(��)   : ����ȭ�� �������� ���� , ������ ����
//Generic ����

//**ArrayList(*****) , HashSet(TreeSet)(***) , HashMap(*****)
public class Ex14_HashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		
		//����
		System.out.println(map.containsKey("Tiger"));//��ҹ��� ����
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));//�ߺ��� ������� �ϳ��� ������
		
		
		//(key , value) pair (��)
		System.out.println(map.get("Tiger"));//Key ������ value ����
		System.out.println(map.get("kglim"));//null ����
		
		map.put("Tiger", "1008");//�ߺ� ������ ���� �� (���� Ű�� ������) -> value(overwite)
		//���� ������
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		Object returnvalue = map.remove("scott");//������ > value return
		System.out.println(returnvalue);
		System.out.println(map.size());
		
		map.put("king", "1004");
		System.out.println(map.toString());
		
		
		HashMap map2 = new HashMap<>();
		map2.put("A", "1111");
		System.out.println(map2.toString());
		map2.put("A", "2231");
		System.out.println(map2.toString());
		
		Set keyset =  map2.keySet();//map ����(key) �̾Ƽ� new HashSet(); > add();
		 Iterator it = keyset.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		map2.put("B", 1040);
		
		//key point
		Set set =  map.entrySet();//�ϳ��� ��� ���� key = value
		Iterator it2 = 	set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		
	}
}