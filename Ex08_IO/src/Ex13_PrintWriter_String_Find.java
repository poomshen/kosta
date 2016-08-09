import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex13_PrintWriter_String_Find {
	 String baseDir = "C:\\Temp";       //�˻��� ���丮
	    String word = "hello";            //�˻��� �ܾ�
	    String save = "result.txt";       //�˻������ ����� ���ϸ�
	    
	    public Ex13_PrintWriter_String_Find() throws IOException {
	        //�о���� ���丮�� ��ü
	        File dir = new File(baseDir);
	        
	        if(!dir.isDirectory()) {
	            //���丮�� �ƴϰų� ������ ����
	            System.out.println(baseDir + " is not directory or exist ");
	            System.exit(0);
	        }
	        
	        //������ ���� output stream ����
	        PrintWriter writer = new PrintWriter(new FileWriter(save));
	        
	        //�о���� ���� input stream ����
	        BufferedReader br = null;
	        
	        //�ش� ���丮�� ��� ������ ����Ʈȭ
	        File[] files = dir.listFiles();
	        for(int i = 0; i < files.length; i++) {
	            //������ �ƴ� ��� continue
	            if(!files[i].isFile()) {
	                continue;
	            }
	            
	            //input stream object ����
	            br = new BufferedReader(new FileReader(files[i]));
	            String line = "";
	            
	            //�� ������ �� ���ξ� �о���δ�.
	            while((line = br.readLine()) != null) {
	                //���� ������ �˻��ϰ��� �ܾ ������ ���Ͽ� ����Ѵ�.
	                System.out.println("Line : " + line);
	            	if(line.indexOf(word) != -1) {
	                    writer.write(word + "=" + files[i].getAbsolutePath() +"\n");
	                    
	                }
	            }
	            
	            writer.flush();
	        }
	        
	        //input stream close.
	        br.close();
	        
	        //output stream close.
	        writer.close();
	    }
	    
	    public static void main(String args[]) throws IOException {
	    	Ex13_PrintWriter_String_Find StringFind = new Ex13_PrintWriter_String_Find();
	    }
	}
	 