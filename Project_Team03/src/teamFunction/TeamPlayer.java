package teamFunction;

import java.util.ArrayList;

import teamDTO.PlayerDTO;
import teamDTO.TeamDTO;

//������(����)�� ������ ���� ���� ���õ� �Լ�  Ŭ����
public class TeamPlayer {
	TeamDTO teamdto = new TeamDTO();
	FileDB db = new FileDB();
	boolean check;
	//�α��� üũ �ϴ� ���(id, pw �Ѵ� ��ġ�ϸ� true ��ȯ)
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
	
	//���� ��� �ϴ� ���(���� ���� ���ȣ�� �ִ��� üũ�ؼ� ���ٸ� ���� ���)
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
	//���� ���� �ϴ� ���(�̸��� ���ȣ�� �޾Ƽ� �Ѵ� ��ġ �ϸ� ����)
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
	//���� 11�� ���� ����(isKeyPlayer�� �ҷ��ͼ� true�� ���� false�� �ĺ��̱� ������ �����̸� ���ο� �迭�� ����
	public int keyplayer_Select(String id){
		int sum = 0;
		ArrayList<PlayerDTO> a = player_array(id);
		ArrayList<PlayerDTO> arraylist = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).isKeyPlayer()) {
				arraylist.add(a.get(i));
			}
			// if(a.get(i).getPosition().equals("FW")){ //�׽�Ʈ�ڵ�
			// arraylist.add(a.get(i));
			// }
		}
		// ���� ������ HP�� ���� ���ϴ� �κ�
		for (int i = 0; i < arraylist.size(); i++) {
			sum += arraylist.get(i).getCondition();
		}
		return sum;
	}
	
	//���� ��ü(���� ���� �̸� : keyplayername, �ĺ� ���� �̸� : backupname)
	public void player_Change(String keyplayername, String backupname , String id){
		ArrayList<PlayerDTO> a = player_array(id);
		int num = player_nameposition(keyplayername, id);
		int num2 = player_nameposition(backupname, id);

		// ���������� �̸��� �ĺ� ������ �̸��� ������ Ȯ�� �ϴ� ���
		if (a.get(num).getName().equals(keyplayername) && a.get(num2).getName().equals(backupname)) {
			// System.out.println("�Ѵ� �̸� ����");
			// ���� ������ �����ǰ� ��ü�� ������ �������� ������ Ȯ�� �ϴ� ���
			if (a.get(num).getPosition().equals(a.get(num2).getPosition())) {
				// System.out.println("��ü ��");
				a.get(num).setKeyPlayer(false);
				a.get(num2).setKeyPlayer(true);
				db.playerDBout();
			} else {
				System.out.println("�������� �ٸ�");
			}
		} else {
			System.out.println("���� �̸��� ����� �Է� �ϼ���.");
		}
	}
	
	//���� �迭 ��ġ ��ȣ ���� ���(�̸��� �����ͼ� �̸��� �ִ� ��ġ�� ���ڸ� ����)
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
	 
	 //�� ������ ��� ���� ���� �Ǿ����� üũ �ϴ� ���� 
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
	
	//�౸���� ���� ��� 
	public void game_start(String id){
		for(int i = 0; i< db.teamAll.size() ; i++){
			if(db.teamAll.get(i).getTeamName().equals(id)){
			if(!db.teamAll.get(i).isRegister()){
				db.teamAll.get(i).setRegister(true);
			}
			}
		}
	}
	
	//�౸���� 
	public void  game_restart(ArrayList<String> a){
//		su 1�̸� ��üũ  2�� (0,2,4,6)�� üũ  4���̸� (
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
//		su 1�̸� ��üũ  2�� (0,2,4,6)�� üũ  4���̸� (
//		if(su == )
		for(int i = 0 ; i<db.teamAll.size(); i++ ){
				db.teamAll.get(i).setRegister(true);
		}
		db.playerDBout();
	}
}