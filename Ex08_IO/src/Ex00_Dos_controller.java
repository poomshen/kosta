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
		
		System.out.println("++��밡�� ���++");
		System.out.println("DIR : ��Ϻ��� ");
		System.out.println("********************************");
		System.out.println("���� : [DIR] ] ");
		System.out.println("���� : Ex11_FIle list C:\\Temp");
		System.out.println("********************************");
		System.out.println("DEL : ����");
		System.out.println("���� : [DEL] [���� �� ����] ");
		System.out.println("********************************");
		System.out.println("TYPE : �ؽ�Ʈ����");
		System.out.println("���� : [TYPE] [���� ��  .txt����] ");
		System.out.println("********************************");
		System.out.println("RENAME : �̸��ٲٱ�");
		System.out.println("���� : [RENAME] [�ٲ�����] [�ٲ����ϸ�] ");
		System.out.println("********************************");
		System.out.println("create : ���� ����");
		System.out.println("���� : [create] [������ų����] ");
		System.out.println("********************************");
		System.out.println("COPY : ����");
		while (true) {
			System.out.printf(path + ">");
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine();
			args = command.split(" ");
			// System.exit(0);//���α׷� ����
		    manuChoice(args);

		}
	}

	// ���� �ϱ�
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
			System.out.println("����!!");
			System.exit(0);
		default:
			System.out.println("�߸� �� ���·� �Է� �߽��ϴ�.");
			System.exit(0);
			break;
		}
	}

	// ��� ����
	static public void DIR(String[] args) {
		File dir = new File(path); // File["C:\\Temp"]
		if (search(dir)) {
			System.out.println("[Full pat : " + dir.getAbsolutePath() + " ]");
			// ���� ����
			ArrayList<Integer> subDir = new ArrayList<>();
			File[] files = dir.listFiles(); // files �迭 (Temp ���� �Ʒ� > ����)
			for (int i = 0; i < files.length; i++) {
				// ��� ���
				String filename = files[i].getName();// ���� �̸�, ���� �̸�
				if (files[i].isDirectory()) {
					// ����
					filename = "<DIR>  [" + filename + "]";
					subDir.add(i);
				} else {
					// ����
					filename = filename + " / " + files[i].length() + "Byte";
				}
				System.out.println("  " + filename);
			}
			int DirNum = subDir.size();
			int FileNum = files.length - DirNum;

			totalDirs += DirNum;
			totalFiles += FileNum;
			System.out.println("[Current DirNum] ���� ���� :" + DirNum);
			System.out.println("[Current FileNum] ���� ����" + FileNum);
			System.out.println("*********************************************************");
		}
	}

	// ����
	static public void DEL(String[] args) {
		// f.delete ���� ���� (�������� ����)
		File dir = new File(path,args[1]);
		if (search(dir)) {
			if (dir.isDirectory()) {
				System.out.println("������ �����Դϴ� ������ �����Ͻø� ���� �����͵� ������ϴ� ���� �Ͻðڽ��ϱ� ? Y  /  N");
				String ck = sc.nextLine();
				if (ck.equals("y") || ck.equals("Y")) {
					dir.delete();
					System.out.println("������ �Ϸ� ����ϴ�.");
				} else if (ck.equals("N") || ck.equals("n")) {
					System.out.println("������ ��� �ϼ̽��ϴ�.");
					System.exit(0);
				}
			} else {
				dir.delete();
			}
		}
	}

	// �ؽ�Ʈ ����
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
			System.out.println(" �ؽ�Ʈ ������ �ƴմϴ�.(�̸��� .txt�� ���ּ���)");
		}
	}

	// �̸� �ٲٱ�
	static public void RENAME(String[] args) {
		/*File dir = new File(args[1]);//������ ����
		if(search(dir)){
		File dir2 = new File(args[2]);// �����ϴ� ����
		dir.renameTo(dir2);
		}*/
	    File f1 = new File(path, args[1]); 
        if (f1.isDirectory()) {
           File f2 = new File(path, args[2]); //
           f1.renameTo(f2); // args[3] = ������ ���ϸ�
        } else {
           System.out.println("��ġ�ϴ� �������� �����ϴ�.");
        }
     }
//	}

	// ���� �ϱ�
	static public void COPY(String[] args) {

	}
	
	 static void create(String[] s){
		     // args[1] = �Լ� �̸��� md �̸� true
		        File f2 = new File(path, s[1]); // args[1]= ���,  agrs[2]= ������ ���� �̸�
		        if (!f2.isDirectory()) {
		           f2.mkdir();
		        } else {
		           System.out.println("������ �������� �ֽ��ϴ�.");
		        }
	  }

	static public boolean search(File dir) {
		boolean ck = true;
		if (!dir.exists() || !dir.isAbsolute()) {
			System.out.println("��ȿ���� ���� ����&���� �Դϴ�^^");
			ck = false;
		}
		return ck;
	}
}