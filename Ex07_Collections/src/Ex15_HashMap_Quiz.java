import java.util.HashMap;
import java.util.Scanner;

public class Ex15_HashMap_Quiz {
	static HashMap loginmap = new HashMap();
	
	//����Ʈ�� ���Ե� ȸ��ID, PWD ���� ��Ƴֱ�
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		//ȸ���α��� ó��
		//�α��� �ý���(��������ó��)
		//����ڷ��� ID, PWD �Է¹޾Ƽ�
		//����ȸ������ �������� �Ǵ�
		
		//ID(0) , PWD(x)
		//ID(0) , PWD(0)
		//ID(x) , PWD(x)
		//ID(x) , PWD(0)
		
		//10�� ���ð� 3�� 30�б��� �Ͻø�
		//CASE ���� ó�� (�� HasgMap �Լ� Ȱ��)
		while(true){
		System.out.println("���̵� �Է��ϼ���");
		String id = sc.nextLine();
		System.out.println("�н����带 �Է��ϼ���");
		String pass = sc.nextLine();
		if(idck(id)){
			if(idck(id, pass)){
				System.out.println("�α��� ���� �ϼ̽��ϴ�.");
			}else{
				System.out.println("�н����� �Է¿� ���� �ϼ̽��ϴ�");
			}
		}else {
			System.out.println("���̵� �Է¿� ���� �ϼ̽��ϴ�.");
		}
		}
	}
	
	public static boolean idck(String id){
		boolean ck = loginmap.containsKey(id);
		return ck;
	}
	public static boolean idck(String id,String pass){
		boolean  ck = (loginmap.get(id).equals(pass))?true:false;
		return ck;
	}
	
}