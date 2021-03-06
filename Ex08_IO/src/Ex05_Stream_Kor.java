import java.io.FileInputStream;
import java.io.IOException;

//영어 , 특수문자 , 공백 (1Byte)
//한글 한자 : 2Byte

//Stream> 데이터 입출력의 단위 (1byte)
public class Ex05_Stream_Kor {
	public static void main(String[] args) {
		FileInputStream input = null;
		try {
			input = new FileInputStream("kor.txt");
			//2Byte 데이터 처리 stream 불가능
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
