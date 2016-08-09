import java.util.HashMap;
import java.util.Scanner;

public class Ex15_HashMap_Quiz {
	static HashMap loginmap = new HashMap();
	
	//사이트에 가입된 회원ID, PWD 값을 담아넣기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		//회원로그인 처리
		//로그인 시스템(인증관련처리)
		//사용자로터 ID, PWD 입력받아서
		//실제회원인지 인증여부 판단
		
		//ID(0) , PWD(x)
		//ID(0) , PWD(0)
		//ID(x) , PWD(x)
		//ID(x) , PWD(0)
		
		//10분 쉬시고 3시 30분까지 하시면
		//CASE 별로 처리 (단 HasgMap 함수 활용)
		while(true){
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("패스워드를 입력하세요");
		String pass = sc.nextLine();
		if(idck(id)){
			if(idck(id, pass)){
				System.out.println("로그인 성공 하셨습니다.");
			}else{
				System.out.println("패스워드 입력에 실패 하셨습니다");
			}
		}else {
			System.out.println("아이디 입력에 실패 하셨습니다.");
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
