package teamFunction;

import java.util.ArrayList;
import java.util.Scanner;

import teamDTO.PlayerDTO;
	
//출력
public class OutPrint {
	static boolean cout = true;
	static String login = "";
	Scanner sc = new Scanner(System.in);
	TeamPlayer tp = new TeamPlayer();
	FileDB db = new FileDB();
	Match mt = new Match();
	//감독 로그인 하는 함수
	public void login_OutPrint(){
		while (true) {
			
		if(login.equals("")){
			
		System.out.println("--------------------------------");
		System.out.println("로그인 화면");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비번 입력 : ");
		String pw = sc.nextLine();
		System.out.println("--------------------------------");
		if (tp.login_Check(id, pw)) {
			System.out.println("로그인 성공");
			login = id;
			manager_OutPrint();
		} else {
			System.out.println("로그인 실패");
		}
		}else{
			manager_OutPrint();
		}
		}
	}
	
	public void manager_OutPrint(){
			System.out.println("--------------------------------");
			System.out.println("1.선수관리");
			System.out.println("2.경기일정");
			System.out.println("3.결과출력");
			System.out.println("4.로그아웃");
			System.out.println("5.종료");
			System.out.println("--------------------------------");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				
				playerlist_Outprint();
				player_OutPrint();
				break;
			case 2:
				
				schedule_OutPrint();
				break;
			case 3:
				result_OutPrint();
				break;
			case 4 :
				login ="";
				break;
			case 5:
				System.out.println("시스템을 종료합니다.");
				System.exit(10);
				break;
			case 6:
				tp.game_restart2();//임이의 다 트루
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}
	}
	//선수 관리 화면(선수 등록, 선수 삭제)
	public void player_OutPrint(){
	
		System.out.println("선수 관리 화면");
		System.out.println("1. 선수등록");
		System.out.println("2. 선수삭제");
		System.out.println("3. 출전 선수 교체");
		int select = Integer.parseInt(sc.nextLine());
		if(select == 1){
			playerRegister_OutPrint();
		}else if(select == 2){
			playerDelete_OutPrint();
		}else if(select == 3){
			playerlist_Outprint();
			player_Change_OutPrint();
		}else{
			tp.keyplayer_Select(login);
		}
	}
	//선수 등록 하는 화면(이름, 등번호, 포지션 입력)
	public void playerRegister_OutPrint(){
		System.out.println("선수 등록 화면");
		System.out.print("선수 이름 = ");
		String name = sc.nextLine();
		System.out.print("선수 등번호 = ");
		int nober = Integer.parseInt(sc.nextLine());
		System.out.print("선수 포지션 = ");
		String position = sc.nextLine();
		if(tp.player_Register(name, nober, position,login)){
			System.out.println("선수 등록 성공");
		} else{
			System.out.println("입력한 등번호를 가지고 있는 선수가 있습니다.");
		}
	}
	//선수 삭제 하는 화면(이름, 등번호 입력)
	public void playerDelete_OutPrint(){
		System.out.println("선수 삭제 화면");
		System.out.print("선수 이름 = ");
		String name = sc.nextLine();
		System.out.print("선수 등번호 = ");
		int nober = Integer.parseInt(sc.nextLine());
		if(tp.player_Delete(name, nober ,login)){
			System.out.println("선수 삭제 성공");
		} else{
			System.out.println("이름과 등번호를 정확하게 입력");
		}
	}
	public void player_Change_OutPrint(){
		System.out.println("선수 교체 화면");
		System.out.print("주전 선수 이름 = ");
		String keyplayername = sc.nextLine();
		System.out.print("후보 선수 이름 = ");
		String backupname = sc.nextLine();
		tp.player_Change(keyplayername, backupname, login);
	}
	
	public void schedule_OutPrint(){
		//경기 일정 출력 하는 함수 구현
		//명단확정 기능 구현
		ArrayList<String> array =new ArrayList<>();
		array = db.math_Reader();
		if(!cout && array.size()==8){
			schedule_OutPrint2(array);
		}else if (array.size() == 4) {
		    System.out.println("===========4강 리스트 =========");
		    schedule_OutPrint2(array);
		}else if(array.size() == 2){
		    System.out.println("===========결승전 리스트 =========");
		    schedule_OutPrint2(array);
		}
		if(cout && array.size()==8 || array.size() ==1 ){
			cout = false;
			thread_t t = new thread_t();
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			db.match_Writer(mt.match_First());
			db.playerDBout();
			return;
		}
		
		for(int i=0; i<db.teamAll.size() ;i++){
			if(db.teamAll.get(i).getTeamName().equals(login)){
				if(!db.teamAll.get(i).isRegister()){
					y_n();
					return;
				}
			}
		}
		
	}
	public void y_n(){
		System.out.println("출전 하시겠습니까? (Y or N)");
		String ck = sc.nextLine();
		switch (ck) {
		case "Y":
			tp.game_start(login);
			System.out.println("등록이완료 됬습니다.");
			db.playerDBout();
			break;
		case "N":
			break;
		default:
			break;
		}
	}
	
	
	
	//애는 대결하는 애 뿌려주는 함수
	public void schedule_OutPrint2(ArrayList<String> array){
	      for (int i = 0; i <array.size() ; i += 2) {
	         System.out.println("    " + array.get(i) + "vs" + array.get(i + 1));
	      }
	}
	public void result_OutPrint(ArrayList<String> array){
		for (int i = 0; i <array.size() ; i += 2) {
			System.out.println("    " + array.get(i) + "  " + array.get(i + 1));
		}
	}
	
	public void result_OutPrint(){
		//결과 출력 하는 함수 구현
		
		ArrayList<String> array =new ArrayList<>();
		ArrayList<String> winarry = new ArrayList<>();
		db.playerDBin();
		if(tp.game_readyCk()){
		array = db.math_Reader();
		if(array.size()==8){
			System.out.println("========대전 리스트 =======");
			schedule_OutPrint2(array);
			System.out.println("========8강 승리 결과 ======");
			winarry = mt.quarter_Final(array);
			result_OutPrint(winarry);
			tp.game_restart(winarry);
			db.match_Writer(winarry);
		}else if (array.size() == 4) {
			System.out.println("========대전 리스트 =======");
			schedule_OutPrint2(array);
		    System.out.println("===========4강 승리 결과 =========");
		    winarry = mt.quarter_Final(array);
		    result_OutPrint(winarry);
		    tp.game_restart(winarry);
			db.match_Writer(winarry);
		}else if(array.size() == 2){
		    System.out.println("===========결승 리스트 =========");
		    schedule_OutPrint2(array);
		    System.out.println("===========결승 우승자 =========");
		    winarry = mt.quarter_Final(array);
		    cout =true;
		    System.out.println(winarry.get(0));
		    tp.game_restart(winarry);
		    db.match_Writer(winarry);
		}
		}else {
			System.out.println("다른 감독이 아직 준비가 안되었습니다.");
		}
	}
	
	//선수 들을 불어 오는 함수
	public void playerlist_Outprint(){
		 ArrayList<PlayerDTO> a = tp.player_array(login);
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		 System.out.println("@@@@@@@@@@@@@@@@@@@@선수 리스트@@@@@@@@@@@@@@@@@@@@");
		for(PlayerDTO c : a){
			System.out.println(c.toString());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}
