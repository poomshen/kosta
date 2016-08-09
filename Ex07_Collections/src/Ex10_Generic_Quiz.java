import java.util.ArrayList;
import java.util.Iterator;

import kr.or.kosta.CopyEmp;
import kr.or.kosta.Emp;

public class Ex10_Generic_Quiz {
	public static void main(String[] args) {
		
		//1.Emp Ŭ������ ����ؼ� ��� 3�� ����
		//�� ����� ArrayList �߰� (Generic) ���
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000,"�达","�븮"));
		emplist.add(new Emp(2000,"�ھ�","����"));
		emplist.add(new Emp(3000,"ȫ��","����"));
		
		//2.����� ����(���, �̸� ,����) ������ for������ ����ϼ���
		//�� toString() ������� ������
		for(Emp e : emplist){
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" +e.getJob());
		}
		
		//�Ϲ� for������ ���
		for(int i = 0 ; i < emplist.size() ; i++){
			 Emp e = emplist.get(i); 
			 System.out.println(e.getEmpno() +"-"+ e.getEname() +"-" + e.getJob());
		}

		//3.
		//Emp Ŭ������ ���� ������ ���� CopyEmp Ŭ���� ����
		//job ���� ��ſ� int sal �߰��ϰ� 
		//member field ��� getter , setter �����ϼ���
		
		//3.1 ArrayList<> ����ؼ� ��� 3���� ���弼��
		//��) 100 , "��" 1000
		//��) 200 , "��" 2000
		//��) 300 , "��" 3000
		ArrayList<CopyEmp> copylist = new ArrayList<CopyEmp>();
		copylist.add(new CopyEmp(100, "��", 1000));
		copylist.add(new CopyEmp(200, "��", 2000));
		copylist.add(new CopyEmp(300, "��", 3000));
		//3.2 200�� ����� �޿��� 5000���� �λ��ؼ� ���
		System.out.println("----------------------------------");
		for(CopyEmp e : copylist){
			if(e.getEmpno() == 200){
				e.setSal(5000);
				System.out.println(e.toString());
				//System.out.println(e.getEmpno() + " : " + (e.getSal() + 3000));
			}
		}
		
		//3.3 300�� ����� �̸��� "�ñ���" ��� �����ϰ� ��� (setter)
		for(CopyEmp e : copylist){
			if(e.getEmpno() == 300){
				e.setEname("�ñ���");
				System.out.println(e.toString());
			}
		}
		
		//4.��������� Iterator �� ����ؼ� ����غ�����
		//Generic ����ϱ�
		System.out.println("4��****************************");
		Iterator<CopyEmp> it = copylist.iterator();
		while(it.hasNext()){
			CopyEmp m = it.next();
			System.out.println(m.getEmpno());
			System.out.println(m.getEname());
			System.out.println(m.getSal());
		}
	}

}
