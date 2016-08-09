import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//���ڸ� �ٷ궧�� Buffer ���� (I/O)
//Buffer ����: Line() ���� ó�� ����
//Buffer �ϸ� ���� ������ ó���� ���� �����ϴ�.
public class Ex07_Reader_Writer_Buffer {
	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader br=  null;
		try {
			fileReader = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fileReader);
			String line = "";
							//������ �а� ���� �ƴҶ� ���� ��� ����
			for(int i = 0 ; (line = br.readLine()) != null;i++){
				if((line.indexOf(';')) != -1){ //indexOf �� ���ڰ� ������ ���� �ڸ��� ������ -1���� ����
				System.out.println(line); 
				//QUIZ > (;) �����ݷ��� �ִ� ���常 ����غ�����
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}