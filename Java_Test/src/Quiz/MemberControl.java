package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberControl extends Member{
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> array_mb  = new ArrayList<Member>();
	//�޴�
	public void memberMeue(){
		while(true){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@�ȳ��ϼ���@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("1.ȸ������  2.ȸ������ 3.ȸ�������� 5.���� ");
		int ck = Integer.parseInt(sc.nextLine());
		switch(ck){
		case 1:
			memberInfos();
			break;
		case 2:
			System.out.println("����� ���̵� �Է��ϼ���");
			String id = sc.nextLine();
			memberDelete(id);
			break;
		case 3:
			memberSearch(array_mb);
			break;
		case 5:
			System.out.println("@@@@@@@@@@����@@@@@@@@@");
			System.exit(10);
			break;
		default:
			System.out.println("@����� �Է����ּ���@");
			break;
			}
		}
	}
	
	//ȸ�� ����
    public boolean memberDelete(String id){
    	boolean ck = false;
		for(Member m : array_mb){
			if(m.ID.equals(id)){
				array_mb.remove(m);
			}
		}
		return ck;
    	
    }
	//ȸ������ üũ -���̵� �˻�
	public boolean memberSearch(String ID){
		boolean ck = true;
		for(Member m : array_mb){
			if(m.ID.equals(ID)){
				ck = false;
			}
		}
		return ck;
	}
	//ȸ���� ���� ���
	public boolean memberSearch(ArrayList<Member> mb){
//		memberSearch(mb.get(0).ID);
		for(Member m : mb){
			System.out.println("�̸� : "+m.name+" ���̵� : "+m.ID+ " ���� :" +m.age);
		}
		return false;
	}
	
	//ȸ�� ���� 
	public void memberInfos(){
		System.out.println("�̸��� �Է��ϼ���!!");
		System.out.print("�̸� :");
		String name = sc.nextLine();
		System.out.println("���̵� �Է��ϼ���!!");
		System.out.print("���̵� :");
		String ID  = sc.nextLine();
		System.out.println("�н����带 �Է��ϼ���!!");
		System.out.print("�н����� :");
		String pass = sc.nextLine();
		System.out.println("���̸� �Է� �ϼ���!!");
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		array_mb.add(new Member(name,ID,pass,age));
	}
	
}
