import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex00_Dos_controller {
	static String path = "C:\\Temp";
	static int totalFiles = 0;
	static int totalDirs = 0;
	static Scanner sc = new Scanner(System.in);

	static void menu(String[] args) {
		
		System.out.println("++사용가능 언어++");
		System.out.println("DIR : 목록보기 ");
		System.out.println("********************************");
		System.out.println("사용법 : [DIR] ] ");
		System.out.println("예시 : Ex11_FIle list C:\\Temp");
		System.out.println("********************************");
		System.out.println("DEL : 삭제");
		System.out.println("사용법 : [DEL] [삭제 할 파일] ");
		System.out.println("********************************");
		System.out.println("TYPE : 텍스트보기");
		System.out.println("사용법 : [TYPE] [보여 줄  .txt파일] ");
		System.out.println("********************************");
		System.out.println("RENAME : 이름바꾸기");
		System.out.println("사용법 : [RENAME] [바꿀파일] [바꿀파일명] ");
		System.out.println("********************************");
		System.out.println("create : 파일 생성");
		System.out.println("사용법 : [create] [생성시킬파일] ");
		System.out.println("********************************");
		System.out.println("COPY : 복사");
		while (true) {
			System.out.printf(path + ">");
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine();
			args = command.split(" ");
			// System.exit(0);//프로그램 종료
		    manuChoice(args);

		}
	}

	// 선택 하기
	static public void manuChoice(String[] args) {
		 File f = new File(path);
		switch (args[0]) {
		case "cd":
			if(args.length ==1){
				 System.out.println(f.getPath());
			}else {
				path = args[1];
			}
			break;
		case "cd..":
			  path = f.getParent();
			break;
		case "DIR":
			DIR(args);
			break;
		case "DEL":
			DEL(args);
			break;
		case "TYPE":
			TYPE(args);
			break;
		case "RENAME":
			RENAME(args);
			break;
		case "COPY":
			break;
		case "create":
			create(args);
		case "EXIT":
			System.out.println("종료!!");
			System.exit(0);
		default:
			System.out.println("잘못 된 형태로 입력 했습니다.");
			System.exit(0);
			break;
		}
	}

	// 목록 보기
	static public void DIR(String[] args) {
		File dir = new File(path); // File["C:\\Temp"]
		if (search(dir)) {
			System.out.println("[Full pat : " + dir.getAbsolutePath() + " ]");
			// 하위 폴더
			ArrayList<Integer> subDir = new ArrayList<>();
			File[] files = dir.listFiles(); // files 배열 (Temp 폴더 아래 > 파일)
			for (int i = 0; i < files.length; i++) {
				// 목록 출력
				String filename = files[i].getName();// 폴더 이름, 파일 이름
				if (files[i].isDirectory()) {
					// 폴더
					filename = "<DIR>  [" + filename + "]";
					subDir.add(i);
				} else {
					// 파일
					filename = filename + " / " + files[i].length() + "Byte";
				}
				System.out.println("  " + filename);
			}
			int DirNum = subDir.size();
			int FileNum = files.length - DirNum;

			totalDirs += DirNum;
			totalFiles += FileNum;
			System.out.println("[Current DirNum] 폴더 개수 :" + DirNum);
			System.out.println("[Current FileNum] 파일 개수" + FileNum);
			System.out.println("*********************************************************");
		}
	}

	// 삭제
	static public void DEL(String[] args) {
		// f.delete 파일 삭제 (하위폴더 고려)
		File dir = new File(path,args[1]);
		if (search(dir)) {
			if (dir.isDirectory()) {
				System.out.println("다음은 폴더입니다 폴더를 삭제하시면 안쪽 데이터도 사라집니다 삭제 하시겠습니까 ? Y  /  N");
				String ck = sc.nextLine();
				if (ck.equals("y") || ck.equals("Y")) {
					dir.delete();
					System.out.println("삭제가 완료 됬습니다.");
				} else if (ck.equals("N") || ck.equals("n")) {
					System.out.println("실행을 취소 하셨습니다.");
					System.exit(0);
				}
			} else {
				dir.delete();
			}
		}
	}

	// 텍스트 보기
	static public void TYPE(String[] args) {
		if (args[1].contains(".txt")) {
			File dir = new File(path, args[1]);
			FileReader reader = null;
			if (search(dir)) {
				try {
					reader = new FileReader(dir);
					int data = 0;
					try {
						while ((data = reader.read()) != -1) {
							System.out.print((char) data);
						}
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			System.out.println(" 텍스트 파일이 아닙니다.(이름에 .txt를 써주세요)");
		}
	}

	// 이름 바꾸기
	static public void RENAME(String[] args) {
		/*File dir = new File(args[1]);//참조할 파일
		if(search(dir)){
		File dir2 = new File(args[2]);// 참조하는 파일
		dir.renameTo(dir2);
		}*/
	    File f1 = new File(path, args[1]); 
        if (f1.isDirectory()) {
           File f2 = new File(path, args[2]); //
           f1.renameTo(f2); // args[3] = 변경할 파일명
        } else {
           System.out.println("일치하는 폴더명이 없습니다.");
        }
     }
//	}

	// 복사 하기
	static public void COPY(String[] args) {

	}
	
	 static void create(String[] s){
		     // args[1] = 함수 이름이 md 이면 true
		        File f2 = new File(path, s[1]); // args[1]= 경로,  agrs[2]= 저장할 파일 이름
		        if (!f2.isDirectory()) {
		           f2.mkdir();
		        } else {
		           System.out.println("동일한 폴더명이 있습니다.");
		        }
	  }

	static public boolean search(File dir) {
		boolean ck = true;
		if (!dir.exists() || !dir.isAbsolute()) {
			System.out.println("유효하지 않은 폴더&파일 입니다^^");
			ck = false;
		}
		return ck;
	}
}
