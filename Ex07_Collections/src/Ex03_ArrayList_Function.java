import java.util.ArrayList;

//교집합
//합집합
//차집합
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
		
		//1.list1 모든 요소를 kyo list 저장하세요
		
		System.out.println("처음"+kyo.toString());
		kyo.addAll(list1);
		System.out.println("~합체"+kyo.toString());
		//kyo : [1,2,3,4] list2: [3,4,5,6,]
		kyo.retainAll(list2);//교집합 하기 (같은 값만 남기고 삭제해라
		System.out.println(kyo.toString());
		
		//차집합
		//cha: [1,2,3,4]
		cha.addAll(list1);
		System.out.println("bedore cha :"+ cha.toString());
		cha.removeAll(list2);//차집합 하기 
		System.out.println("after cha :"  + cha.toString());
		
		//합집합
		hap.addAll(list1);
		hap.addAll(list2);
		hap.removeAll(kyo);
		System.out.println("합집합 :"+hap.toString());
	}
}
