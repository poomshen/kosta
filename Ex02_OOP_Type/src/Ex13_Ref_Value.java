class Person{
	
}

public class Ex13_Ref_Value {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.hashCode());
		
		Person p2 = p;
		Person p3 = p2;
		
		Person p4 = new Person();
		p4 = p3 ;
		
	}
}
