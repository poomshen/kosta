import java.io.Serializable;

//��ü ���
//����ȭ (��ü�� �����ؼ� ���� ���� ������ ����
//�� ���� (Ŭ���� ����� �ܼ� : implements Serializable)
// ���μ��� ���� ��Ʈ��ũ���� ��ü�� �ְ� ���� �� �ִ�.

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
