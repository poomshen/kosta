//�ý��� ��ü ���Ǵ�  ��Ģ�� �ڿ�
//������ �ִ� ������ ���� ǥ��
// �� ~��  , ����, ���� , �ڵ�� ������
//static Final
enum Season2{
	SPRING,SUMMER,FALL,WINTER
}
class kostaInfo{
	String classcode;
	String classname;
	Season2 kostaseason;
	
	public kostaInfo(String classcode, String classname, Season2 kostaseason) {
		this.classcode = classcode;
		this.classname = classname;
		this.kostaseason = kostaseason;
	}
}


public class Ex12_Enum {
	public static void main(String[] args) {
		kostaInfo  javaclass = new kostaInfo("192th", "java", Season2.SUMMER);
		System.out.println("���  :" + javaclass.classcode);
		System.out.println("���  :" + javaclass.classname);
		System.out.println("���  :" + javaclass.kostaseason);
		
		//JavaAPI ���� ������
		//color.BARK 
	}
}