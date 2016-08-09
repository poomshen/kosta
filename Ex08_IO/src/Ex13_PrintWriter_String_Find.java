import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex13_PrintWriter_String_Find {
	 String baseDir = "C:\\Temp";       //검색할 디렉토리
	    String word = "hello";            //검색할 단어
	    String save = "result.txt";       //검색결과가 저장된 파일명
	    
	    public Ex13_PrintWriter_String_Find() throws IOException {
	        //읽어들일 디렉토리의 객체
	        File dir = new File(baseDir);
	        
	        if(!dir.isDirectory()) {
	            //디렉토리가 아니거나 없으면 종료
	            System.out.println(baseDir + " is not directory or exist ");
	            System.exit(0);
	        }
	        
	        //저장할 파일 output stream 생성
	        PrintWriter writer = new PrintWriter(new FileWriter(save));
	        
	        //읽어들일 파일 input stream 선언
	        BufferedReader br = null;
	        
	        //해당 디렉토리의 모든 파일을 리스트화
	        File[] files = dir.listFiles();
	        for(int i = 0; i < files.length; i++) {
	            //파일이 아닌 경우 continue
	            if(!files[i].isFile()) {
	                continue;
	            }
	            
	            //input stream object 생성
	            br = new BufferedReader(new FileReader(files[i]));
	            String line = "";
	            
	            //각 파일의 한 라인씩 읽어들인다.
	            while((line = br.readLine()) != null) {
	                //라인 내용중 검색하고자 단어가 있으면 파일에 기록한다.
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
	 