package teamDTO;

//���� ����
public class SituationDTO {
	int condition; //���� �����
	boolean matchCk; //��� ���� ����
	boolean keyPlayer; //�ĺ����� �ƴ���
	
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
		if(condition <= 30){ //������� 30 ���ϸ� ���� ����
			matchCk = false;
		}else if(condition >= 40 ){ //����� 40 �̻��̸� ���� ����
			matchCk = true;
		}else if(!keyPlayer){ //���� ������ �ƴ϶�� ���� �Ұ�
			matchCk = false;
		}
		return matchCk;
	}*/
}