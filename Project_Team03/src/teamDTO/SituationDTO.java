package teamDTO;

//선수 상태
public class SituationDTO {
	int condition; //선수 컨디션
	boolean matchCk; //경기 참가 여부
	boolean keyPlayer; //후보인지 아닌지
	
	public SituationDTO() {
		condition  =  (int)(Math.random()*50)+50;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public boolean isMatchCk() {
		return matchCk;
	}

	public void setMatchCk(boolean matchCk) {
		this.matchCk = matchCk;
	}

	public boolean isKeyPlayer() {
		return keyPlayer;
	}

	public void setKeyPlayer(boolean keyPlayer) {
		this.keyPlayer = keyPlayer;
	}
	
	
	/*public boolean Ck() {
		if(condition <= 30){ //컨디션이 30 이하면 출전 금지
			matchCk = false;
		}else if(condition >= 40 ){ //컨디션 40 이상이면 출전 가능
			matchCk = true;
		}else if(!keyPlayer){ //주전 선수가 아니라면 출전 불가
			matchCk = false;
		}
		return matchCk;
	}*/
}
