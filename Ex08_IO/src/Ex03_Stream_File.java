import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//��� : File
//File �� ������� (read, write)
//FileInputStream
//FileOutputStream

//��� ����:

public class Ex03_Stream_File {
	public static void main(String[] args) {
		/*
		 1�ܰ� �ڵ�
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
			//���� temp ������ new.txt ������ ������ ���ϻ��� ,������ ���Ͽ� write)
			//��¾ ���� ����Ǵ��� ã�� ������
//			fos = new FileOutputStream("C:\\Temp\\new.txt" ,true);
			//    ����(data append)
//			fos = new FileOutputStream("C:\\Temp\\new.txt" ,defaul false);
			//    ���� (date overwrite)
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			//���� ����, ������ ���� ���������� ����Ǵ� ����
			//IO (File ���) �� ������ �÷����� ���� ����� �ƴϴ�.
			//Closes this file input stream and releases any system resources associated with the stream. 
			//If this stream has an associated channel then the channel is closed as well.
			try { 
				//���������� close()
				fs.close(); //�ڿ�����(������)
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		}
		
	}
}