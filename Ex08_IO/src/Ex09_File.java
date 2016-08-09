import java.io.File;

public class Ex09_File {
	public static void main(String[] args) {
//		System.out.println(args[0] + "/" +args[1]);
//		System.out.println("MAIN");
		if(args.length != 1){
			System.out.println("사용법 : java 파일명 [디렉토리명을 입력]");
			System.exit(100);
		}
		//java Ex09_File kkk
		File f = new File(args[0]);//("kkk") ("C:\\Temp")
		///파일 클래스 만듬 
		if(!f.exists()|| !f.isDirectory()){ //존재 하는지
			System.out.println("유효하지 않는 디렉토리 입니다.");
			System.exit(0);
		}
		//유효한 폴더
		//file , Directory > File 클래스
		File[] files = f.listFiles(); // Temp 폴더 안에 있는 파일,폴더 배열안에 들어감
		for(int i = 0; i<files.length ; i++){
			String name = files[i].getName(); //폴더면 폴더명을 파일이라면 파일명을
			System.out.println(files[i].isDirectory() ?"DIR : "+name:name);
		}
		
	}
}
