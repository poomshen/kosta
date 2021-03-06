package teamFunction;

import java.util.ArrayList;

import teamDTO.PlayerDTO;
import teamDTO.TeamDTO;

//관리자(감독)이 팀에서 선수 관리 관련된 함수  클래스
public class TeamPlayer {
	TeamDTO teamdto = new TeamDTO();
	FileDB db = new FileDB();
	boolean check;
	//로그인 체크 하는 기능(id, pw 둘다 일치하면 true 반환)
	public boolean login_Check(String id, String pw){
		for(TeamDTO dt : db.teamAll){
		if(dt.getTeamName().equals(id) && dt.getSupervisorpass().equals(pw)){
			check = true;
			break;
		}else{
			check = false;
		}
		}
		return check;
	}
	
	//선수 등록 하는 기능(팀에 같은 등번호가 있는지 체크해서 없다면 선수 등록)
	public boolean player_Register(String name, int nober, String position ,String id){
		ArrayList<PlayerDTO> a = player_array(id);
		for (int i = 0; i < a.size(); i++) {
			if ((a.get(i).getNober() == nober)) {
				check = false;
			} else {
				a.add(new PlayerDTO(name, nober, position));
				check = true;
				db.playerDBout();
				break;
			}
		}
		return check;
	}
	//선수 삭제 하는 기능(이름과 등번호를 받아서 둘다 일치 하면 삭제)
	public boolean player_Delete(String name, int nober,String id){
		ArrayList<PlayerDTO> a = player_array(id);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getName().equals(name) && (a.get(i).getNober() == nober)) {
				a.remove(i);
				check = true;
				db.playerDBout();
				break;
			}else{
				check = false;
			}
		}
		return check;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	//선수 11명 명단 선택(isKeyPlayer를 불러와서 true면 주전 false면 후보이기 때문에 주전이면 새로운 배열에 저장
	public int keyplayer_Select(String id){
		int sum = 0;
		ArrayList<PlayerDTO> a = player_array(id);
		ArrayList<PlayerDTO> arraylist = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).isKeyPlayer()) {
				arraylist.add(a.get(i));
			}
			// if(a.get(i).getPosition().equals("FW")){ //테스트코드
			// arraylist.add(a.get(i));
			// }
		}
		// 주전 선수의 HP를 전부 더하는 부분
		for (int i = 0; i < arraylist.size(); i++) {
			sum += arraylist.get(i).getCondition();
		}
		return sum;
	}
	
	//선수 교체(주전 선수 이름 : keyplayername, 후보 선수 이름 : backupname)
	public void player_Change(String keyplayername, String backupname , String id){
		ArrayList<PlayerDTO> a = player_array(id);
		int num = player_nameposition(keyplayername, id);
		int num2 = player_nameposition(backupname, id);

		// 주전선수의 이름과 후보 선수의 이름이 같은지 확인 하는 기능
		if (a.get(num).getName().equals(keyplayername) && a.get(num2).getName().equals(backupname)) {
			// System.out.println("둘다 이름 있음");
			// 주전 선수의 포지션과 교체할 선수의 포지션이 같은지 확인 하는 기능
			if (a.get(num).getPosition().equals(a.get(num2).getPosition())) {
				// System.out.println("교체 함");
				a.get(num).setKeyPlayer(false);
				a.get(num2).setKeyPlayer(true);
				db.playerDBout();
			} else {
				System.out.println("포지션이 다름");
			}
		} else {
			System.out.println("선수 이름을 제대로 입력 하세요.");
		}
	}
	
	//선수 배열 위치 번호 리턴 기능(이름을 가져와서 이름이 있는 위치의 숫자를 리턴)
	public int player_nameposition(String name ,String id){
		int num = 0;
		ArrayList<PlayerDTO> a = player_array(id);
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i).getName().trim().equals(name)){
				num = i;
				return num;
			}	
		}
		return num;
	}
	
	 public void player_condition(){
		 for (TeamDTO t : db.teamAll) {
			 for(PlayerDTO p: t.getPlaylist()){
				int su = (int)(Math.random()*50)+50;
				p.setCondition(su);
			 }
			 
		 }
	 }
	
	 public ArrayList<PlayerDTO> player_array(String id){
		ArrayList<PlayerDTO> a = new ArrayList<>();
		for (TeamDTO t : db.teamAll) {
			if (t.getTeamName().equals(id)) {
			a = t.getPlaylist();
			return a;
			}
		}
		return a;
	}
	 
	 //이 구문이 모두 게임 레디가 되었는지 체크 하는 구문 
	public boolean game_readyCk(){
		boolean ck = false;
		for(int i = 0; i< db.teamAll.size() ; i++){
		if(db.teamAll.get(i).isRegister()){
				ck = true;
			}else{
				ck=false;
				return ck;
			}
		}
		return ck;
	}
	
	//축구선수 출전 등록 
	public void game_start(String id){
		for(int i = 0; i< db.teamAll.size() ; i++){
			if(db.teamAll.get(i).getTeamName().equals(id)){
			if(!db.teamAll.get(i).isRegister()){
				db.teamAll.get(i).setRegister(true);
			}
			}
		}
	}
	
	//축구감독 
	public void  game_restart(ArrayList<String> a){
//		su 1이면 다체크  2면 (0,2,4,6)만 체크  4명이면 (
//		if(su == )
		for(int i = 0 ; i<db.teamAll.size(); i++ ){
			for(int y=0 ; y<a.size() ; y++){ 
			if(db.teamAll.get(i).getTeamName().equals(a.get(y))){
				db.teamAll.get(i).setRegister(false);
			}
			}
		}
		db.playerDBout();
	}
	public void  game_restart2(){
//		su 1이면 다체크  2면 (0,2,4,6)만 체크  4명이면 (
//		if(su == )
		for(int i = 0 ; i<db.teamAll.size(); i++ ){
				db.teamAll.get(i).setRegister(true);
		}
		db.playerDBout();
	}
}
