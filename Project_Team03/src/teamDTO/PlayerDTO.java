package teamDTO;


//����
public class PlayerDTO extends SituationDTO {
	String name; //�̸�
	int nober; //���ȣ 
	String position; //������
	
	public PlayerDTO() {
		// TODO Auto-generated constructor stub
	}	

	public PlayerDTO(String name, int nober, String position){
		this.name = name;
		this.nober = nober;
		this.position = position;
	}

	public void allPlayer(String name,int nober ,String position,boolean keyPlayer){
		this.name = name;
		this.nober = nober;
		this.position = position;
		this.keyPlayer =keyPlayer;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNober() {
		return nober;
	}
	public void setNober(int nober) {
		this.nober = nober;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		String key = (keyPlayer)?"����":"�ĺ�";
		String msg = "�����̸�:"+name+"  ���ȣ:"+nober+"  ������" + position +"   "+key+" ��������:"+condition;
		return msg;
	}

}