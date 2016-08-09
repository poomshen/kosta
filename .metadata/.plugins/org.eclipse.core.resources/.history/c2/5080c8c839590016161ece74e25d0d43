import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//보조 스트림 (파일처리)
//단독 사용 금지
//new 생성시 (생성자를 통해서 반드시 stream 객체 전달)
//주 스트림(InputStream , OutputStream 구현하는 클래스)
//장점: File(Input, Output) I/O 양을  줄일 수 있다.
// Line 단위의 데이터 처리 가능

//의무적으로 file 사용시 
//BufferedInputStream
//BufferedOutputStream

public class Ex04_Stream_Buffer_File {
	public static void main(String[] args) {
//		BufferedInputStream  bs= new BufferedInputStream(FileInputStream)
		FileOutputStream fos = null;
		BufferedOutputStream  bos = null;
		try {
			 fos = new FileOutputStream("data.txt");
			 bos = new BufferedOutputStream(fos);
			//buffer 에게 FileOutputStream 객체 전달
			 for(int i ='1';i<='9' ; i++){
				 bos.write(i);//buffer 를 통해서 한번에 data.txt > write
			 }
			 //강제로 내보내기
			 //buffer 8kbyte(8192byte)
			 //특징 : 버퍼의 내용이 채워지지 않으면 내보내지 않아요
			 //flush() 또는  close()  자원 (내부 flush)
			 // bos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
