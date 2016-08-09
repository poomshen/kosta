import java.io.FileInputStream;
import java.io.IOException;

//���� , Ư������ , ���� (1Byte)
//�ѱ� ���� : 2Byte

//Stream> ������ ������� ���� (1byte)
public class Ex05_Stream_Kor {
	public static void main(String[] args) {
		FileInputStream input = null;
		try {
			input = new FileInputStream("kor.txt");
			//2Byte ������ ó�� stream �Ұ���
			int data = 0;
			while((data = input.read())!=-1){
				System.out.println(data + " : "+(char)data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}