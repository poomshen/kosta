import java.io.File;
import java.util.ArrayList;

public class Ex11_File_list {
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		//string [] args  활용
		//cmd 모드
		//java Ex11_File_list arge[0] arge[1]
		//java Ex11_FIle_list  aaa bbb
//		arge[0} > aaa
		
		if(args.length != 1 ){
			System.out.println("사용법 : [java파일명] [디렉토리경로]");
			System.out.println("예시 : Ex11_FIle list C:\\Temp");
			System.exit(0);//프로그램 종료
			
		}
		//
		File f = new File(args[0]); //File["C:\\Temp"]
		if(!f.exists() || !f.isAbsolute()){
			System.out.println("유효하지 않은 폴더입네다^^");
			System.exit(0);
		}
//		System.out.println("정보출력");
		printFileList(f);
		System.out.println("총파일 수 :"+totalFiles);
		System.out.println("총폴더 수 :"+totalDirs);

	}
	static void printFileList(File dir){
		System.out.println("[Full pat : "+dir.getAbsolutePath() + " ]");
		//하위 폴더
		ArrayList<Integer> subDir = new ArrayList<>();
		File[] files = dir.listFiles(); //files 배열 (Temp 폴더 아래 > 파일)
		for(int i =0; i<files.length ; i++){
			//목록 출력
			String filename = files[i].getName();//폴더 이름, 파일 이름
//			System.out.println(filename);
			if(files[i].isDirectory()){
				//폴더
				filename = "<DIR>  ["+filename +"]";
				subDir.add(i);
			}else {
				//파일
				filename = filename + " / " +files[i].length() + "Byte";
			}
			System.out.println("  "+filename);
		}
		int DirNum = subDir.size();
		int FileNum = files.length - DirNum;
		
		totalDirs += DirNum;
		totalFiles += FileNum;
		System.out.println("[Current DirNum] 폴더 개수 :"+DirNum);
		System.out.println("[Current FileNum] 파일 개수"+ FileNum);
		System.out.println("*********************************************************");
		//////////////////////////////////////////////////////////////////////////////
		//C:\Temp 하위 폴더 > aaa> bbb 폴더 (bbbb정보 출력(x)
		for(int j = 0 ; j<subDir.size() ; j++){
			int index = subDir.get(j);
			printFileList(files[index]);
		}
		
	}
	//파일 생성
	//f.createNewFile() 파일 생성
	//f.delete 파일 삭제 (하위폴더 고려)
}
