package teamDTO;


//선수
public class PlayerDTO extends SituationDTO {
	String name; //이름
	int nober; //등번호 
	String position; //포지션
	
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
		String key = (keyPlayer)?"주전":"후보";
		String msg = "선수이름:"+name+"  등번호:"+nober+"  포지션" + position +"   "+key+" 선수상태:"+condition;
		return msg;
	}

}