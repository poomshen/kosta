import java.util.ArrayList;

import kr.or.kosta.Emp;

public class Ex04_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {
		//Emp ��� ���赵�� ���ؼ� ��� 1���� ���弼��
		///�迭(����)�� ����ؼ� ��� 3�� ������
		Emp[] emp2 = new Emp[]{new Emp(1200,"ȫ�浿","xe"),new Emp(1500,"�̼���","cs"),new Emp(2000,"�̸���","we")};
		
//		for�� (�������)
		for(int i =0;i<emp2.length ; i++){
			System.out.println(emp2[i].toString());
		}
		
//   	������ for��(�������)
		for(Emp e : emp2){
			System.out.println(e.toString());
		}
		
		//////////////////////////////////////////////////////
		//������� ���� ����//////////////////////////////////////
		
		//collection  Ŭ���� ����ؼ�..
		ArrayList emps = new ArrayList<>();
		Emp emp = new Emp(1000, "ȫ�浿", "it");
		Emp emp3 = new Emp(1030, "�浿", "d");
		Emp emp4 = new Emp(4000, "ȫ��", "i2");
		emps.add(emp);
		emps.add(emp3);
		emps.add(emp4);
//		System.out.println(emps.toString());

//		WHy ) default: ArrayList �迭���� TYPE : Objact
//		�巴�� �����ϴ�
//		
		Emp p = (Emp)emps.get(0);
		System.out.println(p.toString());
//		System.out.println("!!!!!!!!!");
		System.out.println(((Emp)emps.get(0)).toString());
		
		for(int i = 0 ; i<emps.size() ; i++){
//			System.out.println("@@@@@@@");
			System.out.println(emps.get(i));
//			System.out.println("��� ���� " +((Emp)emps.get(i)).getEmpno() 
//					+((Emp)emps.get(i)).getEname()+((Emp)emps.get(i)).getJob());
		}
//		System.out.println("aaaaaaaaa");
//		�����ϴ�.
		for(Object ob : emps){
//			System.out.println(ob.toString());
			Emp m = (Emp)ob;
				 System.out.println(m.getEmpno()+"-"+m.getEname()+"-"+m.getJob());
		}
//		�����Ͽ���
//		���� ArrayList �迭�� Ÿ���� Object
		//���θ�Generic
		ArrayList<Emp> emplit2 = new ArrayList<Emp>();
		emplit2.add(new Emp(1,"A","AA"));
		emplit2.add(new Emp(2,"B","Aa"));
		emplit2.add(new Emp(3,"c","AB"));
		
		for(Emp m :emplit2){
			System.out.println(m.getEmpno() +m.getEname()+m.getJob());
		}
		
	}
}
