import java.io.DataOutputStream;
import java.io.FileOutputStream;

//���� ��Ʈ��
//java 8���� �⺻ Ÿ�� (read , Write ) �Լ� ����
//DataInputStream , DataOutputStream
//���� : DataOutputStream(write) -> DataInputStream(read)
//ä�� �ʿ��� �ٽ� ����
public class Ex14_Data_Stream {
	public static void main(String[] args) {
		int[]score = {100,90,80,10,60};
		try {
			FileOutputStream fos= new FileOutputStream("score.txt");
			//���� ��Ʈ�� 
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