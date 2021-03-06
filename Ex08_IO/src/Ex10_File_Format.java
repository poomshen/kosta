import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_File_Format {
	public static void main(String[] args) {
		File dir = new File("C:\\Temp");
		File[] files  = dir.listFiles();
		//C:\\Temp > a.txt  kglim폴더 ,b.txt
		for(int i = 0 ; i< files.length ; i++){
			File file = files[i];
			String name = file.getName();
//			System.out.println(name);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mma");//날짜를 포멧을 사용해서 예쁘게 꾸며줄수 있다
			String attribute = "";
			String size = "";
			
			//File [] > file , Directory
			if(files[i].isDirectory()){//폴더인 경우 ture
			  attribute = "<DIR>";
			}else{
				//파일인 경우
				size = file.length() + "Byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}
			System.out.printf("%s  %3s  %10s %s \n", df.format(new Date(file.lastModified())),attribute,size,name);
				
			}
		}
	}
