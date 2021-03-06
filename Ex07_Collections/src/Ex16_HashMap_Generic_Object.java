import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//활용하기
//HashMap<String,Person> : value 값으로 객체 사용
class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
}

public class Ex16_HashMap_Generic_Object {
	public static void main(String[] args) {
		HashMap<String,Student> student = new HashMap<>();
		student.put("kglim",new Student("임경균"));
		student.put("hong",new Student("홍길동"));
		
		Student std = student.get("kglim");
		System.out.println(std.name);
		
		/*Set set = student.entrySet();
		Iterator it2 = set.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		결과)
		kglim=Student@15db9742
		hong=Student@6d06d69c
		*/
		//그냥 이렇게 쓰면  Map.Entry 타입으로 받으면 key,value 분리해서 처리 가능)
		
		for(Map.Entry m :student.entrySet()){
			System.out.println(m.getKey() + " / " +((Student)m.getValue()).name);
		}
	}
}
