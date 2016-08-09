import java.io.Serializable;

//객체 통신
//직렬화 (객체를 분해해서 줄을 세워 보내는 과정
//단 조건 (클래스 설계시 단서 : implements Serializable)
// 프로세스 간에 네트워크간에 객체를 주고 받을 수 있다.

public class UserInfo implements Serializable{
	public String  name;
	public String  pass;
	public int age;
	
	public UserInfo(){
		
	}
	public UserInfo(String name ,String pass,int age){
		this.name = name;
		this.pass = pass;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pass=" + pass + ", age=" + age + "]";
	}
	
}
