import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//JAVA API
//URL
//URLConnection
//http://www.kangcom.com/company/history.asp

public class Ex02_URL {
	public static void main(String[] args) throws IOException {
//		String urlstr = "http://www.kangcom.com/company/history.asp";
		String urlstr = "http://image3.kangcom.com/2007/12/b_pic/200712110004.gif";
	 URL url = new URL(urlstr);
	 
//	 FileInputStream in  = (FileInputStream)url.openStream();
//	 BufferedInputStream bis = new BufferedInputStream(in);
	 BufferedInputStream bis = new BufferedInputStream(url.openStream());
	 FileOutputStream fos = new FileOutputStream("copy.jpg");
	byte [] buffer = new byte[2048];
	int n = 0;
	int count = 0 ;
	URLConnection uc = url.openConnection();
	int filesize = uc.getContentLength();
	System.out.println("파일 크기 "+filesize);
	System.out.println("파일 형식 "+uc.getContentType());
	
	while((n =bis.read(buffer))!= -1){
		fos.write(buffer , 0,buffer.length);
		fos.flush();
		System.out.println("n : "+ n);
		count++;
	}
	System.out.println(count);
	bis.close();
	fos.close();
	}
}
