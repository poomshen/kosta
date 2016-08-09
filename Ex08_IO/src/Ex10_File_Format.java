import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_File_Format {
	public static void main(String[] args) {
		File dir = new File("C:\\Temp");
		File[] files  = dir.listFiles();
		//C:\\Temp > a.txt  kglim���� ,b.txt
		for(int i = 0 ; i< files.length ; i++){
			File file = files[i];
			String name = file.getName();
//			System.out.println(name);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mma");//��¥�� ������ ����ؼ� ���ڰ� �ٸ��ټ� �ִ�
			String attribute = "";
			String size = "";
			
			//File [] > file , Directory
			if(files[i].isDirectory()){//������ ��� ture
			  attribute = "<DIR>";
			}else{
				//������ ���
				size = file.length() + "Byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}
			System.out.printf("%s  %3s  %10s %s \n", df.format(new Date(file.lastModified())),attribute,size,name);
				
			}
		}
	}