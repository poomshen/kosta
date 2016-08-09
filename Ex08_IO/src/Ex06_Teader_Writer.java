import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//���ڱ���� ������ ó��
//���� (2byte> char[] ����)
//�߻�Ŭ����: Reader , Writer
//�����ϴ� Ŭ����
//���: File : FileReader , FileWriter
//���: Memory  : CharArrayReader , CharArrayWriter
public class Ex06_Teader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("data.txt");
			fw = new FileWriter("copy_Ex01_Strem.txt");
			int data = 0 ;
			while((data = fr.read()) != -1){
//				System.out.println("read data :" +data+"��ȯ"+(char)data);
				//fw.write(data);
				//QUIZ
				//����, ����, �� �̷� ���ڴ� write ����������
//				if(data !='\n' && data != '\t' && data != ' ' && data !='\r'){
					fw.write(data);
//				}
			}
		}catch (Exception e) {

		}
		finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}