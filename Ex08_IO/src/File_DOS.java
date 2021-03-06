import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class File_DOS {
   static String path = "C:\\Temp";
   static int totalFiles = 0;
   static int totalDirs = 0;

   public static void main(String[] args) {

      while (true) {

         System.out.printf(path + ">");
         Scanner sc = new Scanner(System.in);
         String command = sc.nextLine();
         String[] comarray = command.split(" ");
         

         File f = new File(path);
         if (comarray[0].equals("cd") && (comarray.length == 1)) {
            System.out.println(f.getPath());
         } else if (comarray.length != 1) {
            path = comarray[1];
         } else if (comarray[0].equals("cd..")) {
            path = f.getParent();
         } else if (comarray[0].equals("exit")) {
            System.exit(0);
         }/*else if (!f.exists() || !f.isDirectory()) {// 존재하지 않거나 디렉토리가 아니라면
            System.out.println("유효하지 않은 폴더입니다");
            System.exit(0);*/
         else if (comarray[0].equals("dir")) {
            printFileList(f);
            dir(f);
            System.out.println("총 파일 수 : " + totalFiles);
            System.out.println("총 폴더 수 : " + totalDirs);
            
         }
         else if(comarray[0].equals("md")){
            create(comarray);
         }else if(comarray[0].equals("delete")){
            delete(comarray);
         }else if(comarray[0].equals("rename")){
            rename(comarray);
         }
      }
   }

   static void printFileList(File dir) {
      System.out.println("[File path : " + dir.getAbsolutePath() + "]");

      ArrayList<Integer> subDir = new ArrayList<Integer>();
      File[] files = dir.listFiles();

      for (int i = 0; i < files.length; i++) {

         String filename = files[i].getName();

         if (files[i].isDirectory()) {

            filename = "<DIR> [ " + filename + "]";
            subDir.add(i);

         } else {

            filename = filename + "/" + files[i].length() + "Byte";

         }
         System.out.println(filename);

      }

      int DirNum = subDir.size();
      int FileNum = files.length - subDir.size();
      totalDirs += DirNum;
      totalFiles += FileNum;

      System.out.println("[Current DirNum] : " + DirNum);
      System.out.println("[Current FileNum] : " + FileNum);
      System.out.println("**********************************");

      for (int j = 0; j < subDir.size(); j++) {
         int index = subDir.get(j);
         printFileList(files[index]);
      }
   }
   
   static void dir(File dir){
   
   File[] files = dir.listFiles();
   for (int i = 0; i < files.length; i++) {
      File file = files[i];
      String name = file.getName();
      
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-aHH-mm"); // 날짜를 내가 원하는 형태로
                                 
      
      String attribute = "";
      String size = "";

   
      if (files[i].isDirectory()) {// 폴더인 경우는 true
         attribute = "<DIR>";

      } else {// 파일인 경우
         size = file.length() + "Byte";
         attribute = file.canRead()? "R" :"";
         attribute+=file.canWrite()? "W" :"";
         attribute+=file.isHidden()? "H" :"";
         
      }
      System.out.printf("%s %3s %6s %s \n",df.format(new Date(file.lastModified())),attribute,size,name);//최종 수정날짜
   }

}
   static void create(String[] s){
     // args[1] = 함수 이름이 md 이면 true
        File f2 = new File(s[1], s[2]); // args[1]= 경로,  agrs[2]= 저장할 파일 이름
        if (!f2.isDirectory()) {
           f2.mkdir();
        } else {
           System.out.println("동일한 폴더명이 있습니다.");
        }
     
   }
   static void delete(String[] s){
     
        File f2 = new File(s[1], s[2]); // args[0]= 경로, args[2] = 삭제할 파일이름
        if (f2.isDirectory()) {
           f2.delete();
        } else {
           System.out.println("일치하는 폴더명이 없습니다");
        }
     }
   

   static void rename(String[] args){
     
        File f1 = new File(args[1], args[2]); 
        if (f1.isDirectory()) {
           File f2 = new File(args[1], args[3]); //
           f1.renameTo(f2); // args[3] = 변경할 파일명
        } else {
           System.out.println("일치하는 폴더명이 없습니다.");
        }
     }
}