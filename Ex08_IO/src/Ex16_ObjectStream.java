import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//파일의 객체 (write) :직렬화
//파일에서 객체 (read) :역직렬화
public class Ex16_ObjectStream {
	public static void main(String[] args) {
		String filename = "UserData.ser";//실제로 존재하지 않는 확장자. 실험용
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//객체 대한 작업 
			ObjectOutputStream out = new ObjectOutputStream(bos);
			UserInfo u1 = new UserInfo("superman", "super", 1000);
			UserInfo u2 = new UserInfo("scott", "tiger", 40);
			
			//u1 은 완성된 객체 이다. u2도
			out.writeObject(u1); //과정 : 직렬화
			out.writeObject(u2);
			//직렬화 완료 
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("파일생성 .>직렬화 > 객체  > 파일 쓰기");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
