
class Human{
	int age;
	String name;
}
class Test{
	
	Human add(Human h){
		h.age =100;
		h.name ="ȫ�浿";
		return h;
	}
	Human add(Human h,Human h2){
		h2.age = h.age;
		h2.name = h.name;
		return h2;
	}
}

public class Ex12_Method_Overloading {
	public static void main(String[] args) {
		Test t = new Test();
		Human man = new Human();
		Human woman = t.add(man);
		
		//////////////////////////////////////////
		Human m = new Human();
		m.age =11;
		m.name = "kim";
		
		Human w = new Human();
		w.age = 11;
		w.name = "Lee";
		
		Human k = t.add(m , w);
		System.out.println(k.age + " : "+k.age);
	}
}
