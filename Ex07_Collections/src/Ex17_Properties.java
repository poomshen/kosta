import java.util.Properties;

//Map �� ����
//Ư���� Map ���� <String , String >
//Properties
//���ø����̼� ��ü�� ���� �Ӽ� (ȯ�溯��) �Ӽ��� ���� ����
//������  peoperty ������ ���� ��������
//�ٱ��� ó�� ����

//�� ����Ʈ
//�� ����Ʈ �ϴܿ� ������ email �ּ� : 200���� ��� email �ּ�
//admin@master.com -> master@star.com

public class Ex17_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master", "admin@naver.com");
		prop.setProperty("lang", "kr");
		prop.setProperty("version", "1.0");
		prop.setProperty("DefaultPath", "c:\\Temp\\Image");
		
		
		System.out.println("������Ʈ �ϴ� :" +prop.getProperty("master"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("DefaultPath"));
	}
}