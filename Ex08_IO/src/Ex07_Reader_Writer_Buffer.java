import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//문자를 다룰때도 Buffer 성능 (I/O)
//Buffer 장점: Line() 단위 처리 가능
//Buffer 하면 한줄 단위의 처리가 쉽게 가능하다.
public class Ex07_Reader_Writer_Buffer {
	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader br=  null;
		try {
			fileReader = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fileReader);
			String line = "";
							//한줄을 읽고 널이 아닐때 까지 라는 조건
			for(int i = 0 ; (line = br.readLine()) != null;i++){
				if((line.indexOf(';')) != -1){ //indexOf 에 문자가 있으면 리턴 자리수 없으면 -1값을 리턴
				System.out.println(line); 
				//QUIZ > (;) 세미콜론이 있는 문장만 출력해보세요
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
