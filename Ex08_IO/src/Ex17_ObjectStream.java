import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//UserData.ser ���Ͽ��� 
//����ȭ�� ��ü write �Ǿ� �ִ� ��Ȳ

//������ȭ ����(����) -> ������ ����
public class Ex17_ObjectStream {
	public static void main(String[] args) {
		String filename = "UserData.ser";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try{
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			//������ȭ
			in = new ObjectInputStream(bis);
			
			UserInfo r1 = (UserInfo)in.readObject(); //UserData.ser ���� read
			UserInfo r2 = (UserInfo)in.readObject();
			
			System.out.println("���� ������(��ü) : " + r1.toString());
			System.out.println("���� ������(��ü) : " + r2.toString());
		}catch(Exception e){
			
		}finally {
			try {
				in.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}