import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//UserData.ser 파일에는 
//직렬화된 객체 write 되어 있는 상황

//역직렬화 과정(복원) -> 원상태 조립
public class Ex17_ObjectStream {
	public static void main(String[] args) {
		String filename = "UserData.ser";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try{
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			//역직렬화
			in = new ObjectInputStream(bis);
			
			UserInfo r1 = (UserInfo)in.readObject(); //UserData.ser 파일 read
			UserInfo r2 = (UserInfo)in.readObject();
			
			System.out.println("복원 데이터(객체) : " + r1.toString());
			System.out.println("복원 데이터(객체) : " + r2.toString());
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
