import java.util.ArrayList;

//������
//������
//������
public class Ex03_ArrayList_Function {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		ArrayList list2 = new ArrayList<>();
		
		ArrayList kyo = new ArrayList<>();
		ArrayList cha = new ArrayList<>();
		ArrayList hap = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("list1 :"+list1.toString());
		System.out.println("list2 :"+list2.toString());
		
		//1.list1 ��� ��Ҹ� kyo list �����ϼ���
		
		System.out.println("ó��"+kyo.toString());
		kyo.addAll(list1);
		System.out.println("~��ü"+kyo.toString());
		//kyo : [1,2,3,4] list2: [3,4,5,6,]
		kyo.retainAll(list2);//������ �ϱ� (���� ���� ����� �����ض�
		System.out.println(kyo.toString());
		
		//������
		//cha: [1,2,3,4]
		cha.addAll(list1);
		System.out.println("bedore cha :"+ cha.toString());
		cha.removeAll(list2);//������ �ϱ� 
		System.out.println("after cha :"  + cha.toString());
		
		//������
		hap.addAll(list1);
		hap.addAll(list2);
		hap.removeAll(kyo);
		System.out.println("������ :"+hap.toString());
	}
}
