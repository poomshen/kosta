//��ü �迭
//class Ÿ���̴�.
//�迭�� Ÿ���̴�.
class Person{
	String name;
	int age;
}

public class Ex04_Array_Object {
	static int a=3;
	public static void main(String[] args) {
		//8���� �⺻ Ÿ��
		int[] intarray = new int[10];
		
/*		Person p = new Person();
		Person p = new Person();
		Person p = new Person();
*/	
		Person[] objArray = new Person[3];
//		System.out.println(objArray[0].name);
		//�������� : objArray[0] Person��ü�� �����
		System.out.println("Before :"+objArray[0]);
		System.out.println("Before :"+objArray[1]);
		System.out.println("Before :"+objArray[2]);
		
		objArray[0] = new Person();
		objArray[1] = new Person();
		objArray[2] = new Person();
		System.out.println("Before :"+objArray[0]);
		System.out.println("Before :"+objArray[1]);
		System.out.println("Before :"+objArray[2]);
		
		//write ����
		objArray[0].name = "ȫ�浿";
		objArray[0].age = 100;
		
		System.out.println(objArray[0].name);
		
		//for���� ����ؼ� objArra�� ������ ��ü name, age ���� ���
		
		for(int i= 0; i<objArray.length; i++){
			System.out.println(objArray[i].age +" :"+objArray[i].name);
		}
		//////////
		Person [] arry = new Person[]{new Person(),new Person(),new Person(),new Person(),new Person()};
		Person  [] arry2 = {new Person(), new Person()};
		for(int i = 0;i<5 ;i++ ){
			Person [] arr5 = new Person[a];
			a = 5;
			System.out.println(arr5.length);
		}
		///////////////
		Person[] parray = new Person[10];
		for(int i=0 ; i<parray.length ; i++){
			parray[i] = new Person();
			System.out.println(parray[i].age + "  :  " +parray[i].name );
		}
		arry2 = arry;
		System.out.println(arry2.length);
//		arry2[2] = new Person();
		
	}
}
