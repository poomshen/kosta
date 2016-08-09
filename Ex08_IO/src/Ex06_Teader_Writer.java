import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//문자기반의 데이터 처리
//문자 (2byte> char[] 관리)
//추상클래스: Reader , Writer
//구현하는 클래스
//대상: File : FileReader , FileWriter
//대상: Memory  : CharArrayReader , CharArrayWriter
public class Ex06_Teader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("data.txt");
			fw = new FileWriter("copy_Ex01_Strem.txt");
			int data = 0 ;
			while((data = fr.read()) != -1){
//				System.out.println("read data :" +data+"변환"+(char)data);
				//fw.write(data);
				//QUIZ
				//엔터, 공백, 탭 이런 문자는 write 하지마세요
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
