package Quiz;

public class Member {
//	 이름 , 아이디, 패스워드 ,나이
	String name;
	String ID;
	String pass;
	int age;
	public Member() {
	}
	
	public Member(String name ,String ID ,String pass , int age) {
		this.name = name;
		this.ID = ID;
		this.pass = pass;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
