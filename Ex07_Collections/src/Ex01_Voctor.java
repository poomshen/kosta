import java.util.Vector;

/*
	collecton FrameWork
	ǥ��ȭ �� �������̽��� �����ϰ� �ִ� Ŭ���� ����

	Collection �������̽� -> List -> ���� Ŭ���� (ArrayList)
						-> Set  -> ���� Ŭ���� (HashSet)
	Map�������̽� -> ���� Ŭ���� (HashMap)
	
	List �������̽�(���� ���ÿ�)
	����(0) �ߺ�(0) -> ���������� ������ ����(�迭)
	ex)����� �̸�(��ȣǥ)
	Vector(��)  -> ����ȭ(��Ƽ������) ���������� lock ��ġ
	ArrayList(��)  - > ����ȭ ����(x) - > ����ȭ ��� ����  -> ���� ���� ���� -> Ȱ�뵵 (0)
	
	//����(Array)  <-> ����(�÷���)
	
	[���� Array]
	1.�迭�� ũ�Ⱑ ���� (int [] arr  = new int[10], arr2 ={10,20})
	2.�迭�� ���� ���(index) > index ���� �˾ƾ� Ư�� ��ġ�� ����
	3.�ʱ⿡ ������ �迭�� ũ�⸦ ������ �� ����.(point)
	
	[���� Collection: ����, ��]
	List �������̽�..
	1.�迭�� ũ�⸦ �������� Ȯ�� (�迭�� ���Ҵ�)
	2.������ ����(���������� index ���� ���´�.), �ߺ��� ���
	3.������ ���� ���� �迭(�迭�� Ÿ�� : Object ) > private Object[] data;
	4.���� Object[] �غ� > ���ʸ� ����� ���ؼ� �ؼ� ����
	5.����
	
*/
public class Ex01_Voctor {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add(100);
		System.out.println(v.toString()); //�����ǰ� �Ǿ� �ִ�.
		for(int i = 0 ; i < v.size() ; i++){
			System.out.println(v.get(i));
		}
		//Ư�� ��ġ
		System.out.println("Ư����ġ : get(index) :" + v.get(1));
		
		for(Object s : v){
			System.out.println(s);
		}
		//�׷��� �� ���� Object ����ϴ� �������� �ذ�
		//generic (��ü�� ���鶧 �ʿ��� Ÿ���� ����
		
		Vector<String> v2 = new Vector<String>();
		v2.add("1000");
		v2.add("�׷�����");
		for(String s : v2){
			System.out.println(s);
		}
		System.out.println(v2.toString());
		System.out.println("Collection ũ��: size() : "+v2.size());
		System.out.println("Collection ����ɷ� :"+v2.capacity());

		Vector v3 =new Vector();
		System.out.println(v3.capacity());//default ����Ŀ�� �뷮
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("size :"+ v3.size());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("size :" +v3.size());
		System.out.println(v3.capacity());//�⺻ ����Ŀ�� �뷮 *2
		
		
	}
}
