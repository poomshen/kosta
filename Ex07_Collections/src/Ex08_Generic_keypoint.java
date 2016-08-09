import java.util.ArrayList;

//���ʸ� (Generic)
//JDK1.5
//C# ,JAVA  ���� ��� �ʼ� ���
//������
//1.���� Ÿ�� ������ Ȯ�� (Ÿ���� ���� �Ѵ� ) > Object Ÿ�� Ż��
//2.�� ��ȯ�� �� Ÿ�Կ� �´� ����ȯ ���ո� �ذ�
class Person{
	int age = 100;
}

//���׸� Ŭ���� ����� ����
// T ��� �ϴ� ���� : Type Paramter
class MyGen<T>{
	T obj;
	void add(T obj){
		this.obj = obj;
		}
	T get(){
		return obj;
	}
}

class car{
	String carname;
	public car(String carname) {
		this.carname = carname;
	}
	String  getCarnme(){
		return this.carname;
	}
}

public class Ex08_Generic_keypoint {
	public static void main(String[] args) {
		ArrayList list  = new ArrayList<>();
		list.add(500);
		list.add(new Person());
		list.add("ȫ�浿");
		//���
//		System.out.println(list.get(0));
//		System.out.println(((Person)list.get(1)).age);
//		System.out.println(list.get(2));
		for(Object ob:list){
//			if(ob==list.get(1)){
			if(ob instanceof Person){
				System.out.println(((Person)ob).age);
			}else{
				System.out.println(ob);
			}
		}
		
		/*
		 	ArrayList list  = new ArrayList<>();
			list.add(500);
			list.add(new Person());
			list.add("ȫ�浿");
			���࿡ ������ add �� ������ Ÿ�Ը� ���� �� �� �ִ� ����� ���� ��?
			
			���ڸ� ���� �� �ְ� 
			��ü�� ���� �� (������ Ÿ��)
		*/
		ArrayList<Integer> inList = new ArrayList<Integer>();
		inList.add(100);
		
		ArrayList<String> stringlist = new ArrayList<String>();
		stringlist.add("A");
		stringlist.add("B");
		stringlist.add("C");
		for(String s : stringlist){
			System.out.println(s);
		}
		
		ArrayList<Person> personlist= new ArrayList<Person>();
		personlist.add(new Person());
		personlist.add(new Person());
		
		//�Ļ� generic Ŭ���� �����,,,
		
		/*class MyGen<T>{
			T obj;
			void add(T obj){
				this.obj = obj;
				}
			T get(){
				return obj;
			}
		}*/
		
		MyGen<String> mygen = new MyGen<String>(); 
		mygen.add("AA");
		System.out.println(mygen.get());
		
		MyGen<Integer> mygen2 = new MyGen<Integer>();
		mygen2.add(100);
		System.out.println(mygen2.get());
		
		ArrayList<String> alList = new ArrayList<>();
		alList.add("��̸���Ʈ");
		
		//Car Ÿ���� �����ϴ�  ArrayList ����ð�
		//Car 2���� �־� ������
		ArrayList<car> car1 = new ArrayList<car>();
		car1.add(new car("������"));
		car1.add(new car("�����������"));
		
		for(car a : car1){
			System.out.println(a.carname);
		}
		
	}
}
