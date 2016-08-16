package teamDTO;

import java.util.ArrayList;

//팀
public class TeamDTO {
	String teamName; //팀 이름 
	String supervisorpass;//감독 패스 워드
	boolean register; //출전 여부 
	ArrayList<PlayerDTO> playlist = new ArrayList<>(); //선수들
	
	public TeamDTO() {
	}
	
	public TeamDTO(String teamName, String supervisorpass, boolean register, ArrayList<PlayerDTO> playlist) {
		this.teamName = teamName;
		this.supervisorpass = supervisorpass;
		this.register = register;
		this.playlist = playlist;
	}

	
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getSupervisorpass() {
		return supervisorpass;
	}
	public void setSupervisorpass(String supervisorpass) {
		this.supervisorpass = supervisorpass;
	}
	public boolean isRegister() {
		return register;
	}
	public void setRegister(boolean register) {
		this.register = register;
	}
	public ArrayList<PlayerDTO> getPlaylist() {
		return playlist;
	}
	public void setPlaylist(ArrayList<PlayerDTO> playlist) {
		this.playlist = playlist;
	}
	@Override
	public String toString() {
		String pz ="";
		for(PlayerDTO p : playlist){
			System.out.println(p.name);
		  pz += p.name;
		}
		return pz;
	}
}
