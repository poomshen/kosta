import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Ȱ���ϱ�
//HashMap<String,Person> : value ������ ��ü ���
class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
}

public class Ex16_HashMap_Generic_Object {
	public static void main(String[] args) {
		HashMap<String,Student> student = new HashMap<>();
		student.put("kglim",new Student("�Ӱ��"));
		student.put("hong",new Student("ȫ�浿"));
		
		Student std = student.get("kglim");
		System.out.println(std.name);
		
		/*Set set = student.entrySet();
		Iterator it2 = set.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		���)
		kglim=Student@15db9742
		hong=Student@6d06d69c
		*/
		//�׳� �̷��� ����  Map.Entry Ÿ������ ������ key,value �и��ؼ� ó�� ����)
		
		for(Map.Entry m :student.entrySet()){
			System.out.println(m.getKey() + " / " +((Student)m.getValue()).name);
		}
	}
}