import java.io.DataOutputStream;
import java.io.FileOutputStream;

//보조 스트림
//java 8가지 기본 타입 (read , Write ) 함수 제공
//DataInputStream , DataOutputStream
//조건 : DataOutputStream(write) -> DataInputStream(read)
//채팅 쪽에서 다시 쓰임
public class Ex14_Data_Stream {
	public static void main(String[] args) {
		int[]score = {100,90,80,10,60};
		try {
			FileOutputStream fos= new FileOutputStream("score.txt");
			//보조 스트림 
			DataOutputStream dos = new DataOutputStream(fos);
			for(int i = 0; i<score.length ; i++){
				dos.writeInt(score[i]);//WriteInt
			}
			dos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
