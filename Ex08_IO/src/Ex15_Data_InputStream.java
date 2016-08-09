import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Ex15_Data_InputStream {
	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while(true){
				score = dis.readInt();
				System.out.println("Score Int Ÿ�� :"+ score);
				sum += score;
			}
		} catch (Exception e) {
			System.out.println("���ܹ߻� :"+e.getMessage());
			System.out.println("sum ��� :"+sum);
		}finally{
//			if(dis!=null){try {dis.close();} catch (IOException e) {e.printStackTrace();}} //���� try catch��
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				// TODO Auto-generated catch block
		}
		
	}
}
