import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//대상 : File
//File 을 대상으로 (read, write)
//FileInputStream
//FileOutputStream

//대상 파일:

public class Ex03_Stream_File {
	public static void main(String[] args) {
		/*
		 1단계 코드
		 try {
			FileInputStream fs = new FileInputStream("C:\\Temp\\file.txt");
			int data = 0 ;
			try {
				while((data = fs.read())!=-1){
//					System.out.println(data);
					char c= (char)data;
					System.out.println(c);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}*/ 
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\file.txt";
		
		try{
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt",true);
			int date = 0;
			while((date= fs.read()) != -1){
				fos.write(date);
			}
			//실제 temp 폴더에 new.txt 파일이 없으면 파일생성 ,생성된 파일에 write)
			//어쩐 사항 변경되는지 찾아 보세요
//			fos = new FileOutputStream("C:\\Temp\\new.txt" ,true);
			//    파일(data append)
//			fos = new FileOutputStream("C:\\Temp\\new.txt" ,defaul false);
			//    파일 (date overwrite)
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			//정상 실행, 비정상 실행 강제적으로 실행되는 블럭
			//IO (File 등등) 은 가비지 컬렉터의 관리 대상이 아니다.
			//Closes this file input stream and releases any system resources associated with the stream. 
			//If this stream has an associated channel then the channel is closed as well.
			try { 
				//습관적으로 close()
				fs.close(); //자원해제(명시적)
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		}
		
	}
}
