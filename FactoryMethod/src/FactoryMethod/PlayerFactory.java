package FactoryMethod;

public abstract class PlayerFactory {
	public abstract Player createPlayer(String name ,int age);
	public abstract void redusterKBO(Player p);
	public abstract void redusterMLB(Player p);
	public abstract void redusterNPB(Player p);
	
	public void create(String name,int age){
		Player p = createPlayer(name,age);
		redusterKBO(p);
		redusterMLB(p);
		redusterNPB(p);
		System.out.println("플레이어가 생성 됫습니다.");
	}
	
}
