import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//������ ��ü (write) :����ȭ
//���Ͽ��� ��ü (read) :������ȭ
public class Ex16_ObjectStream {
	public static void main(String[] args) {
		String filename = "UserData.ser";//������ �������� �ʴ� Ȯ����. �����
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//��ü ���� �۾� 
			ObjectOutputStream out = new ObjectOutputStream(bos);
			UserInfo u1 = new UserInfo("superman", "super", 1000);
			UserInfo u2 = new UserInfo("scott", "tiger", 40);
			
			//u1 �� �ϼ��� ��ü �̴�. u2��
			out.writeObject(u1); //���� : ����ȭ
			out.writeObject(u2);
			//����ȭ �Ϸ� 
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("���ϻ��� .>����ȭ > ��ü  > ���� ����");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
