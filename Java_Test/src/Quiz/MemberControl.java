package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberControl extends Member{
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> array_mb  = new ArrayList<Member>();
	//메뉴
	public void memberMeue(){
		while(true){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@안녕하세요@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("1.회원가입  2.회원삭제 3.회원들정보 5.종료 ");
		int ck = Integer.parseInt(sc.nextLine());
		switch(ck){
		case 1:
			memberInfos();
			break;
		case 2:
			System.out.println("지우실 아이디를 입력하세요");
			String id = sc.nextLine();
			memberDelete(id);
			break;
		case 3:
			memberSearch(array_mb);
			break;
		case 5:
			System.out.println("@@@@@@@@@@종료@@@@@@@@@");
			System.exit(10);
			break;
		default:
			System.out.println("@제대로 입력해주세요@");
			break;
			}
		}
	}
	
	//회원 삭제
    public boolean memberDelete(String id){
    	boolean ck = false;
		for(Member m : array_mb){
			if(m.ID.equals(id)){
				array_mb.remove(m);
			}
		}
		return ck;
    	
    }
	//회원정보 체크 -아이디 검색
	public boolean memberSearch(String ID){
		boolean ck = true;
		for(Member m : array_mb){
			if(m.ID.equals(ID)){
				ck = false;
			}
		}
		return ck;
	}
	//회원들 정보 출력
	public boolean memberSearch(ArrayList<Member> mb){
//		memberSearch(mb.get(0).ID);
		for(Member m : mb){
			System.out.println("이름 : "+m.name+" 아이디 : "+m.ID+ " 나이 :" +m.age);
		}
		return false;
	}
	
	//회원 가입 
	public void memberInfos(){
		System.out.println("이름을 입력하세요!!");
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.println("아이디를 입력하세요!!");
		System.out.print("아이디 :");
		String ID  = sc.nextLine();
		System.out.println("패스워드를 입력하세요!!");
		System.out.print("패스워드 :");
		String pass = sc.nextLine();
		System.out.println("나이를 입력 하세요!!");
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		array_mb.add(new Member(name,ID,pass,age));
	}
	
}
