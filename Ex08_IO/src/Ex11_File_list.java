import java.io.File;
import java.util.ArrayList;

public class Ex11_File_list {
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		//string [] args  Ȱ��
		//cmd ���
		//java Ex11_File_list arge[0] arge[1]
		//java Ex11_FIle_list  aaa bbb
//		arge[0} > aaa
		
		if(args.length != 1 ){
			System.out.println("���� : [java���ϸ�] [���丮���]");
			System.out.println("���� : Ex11_FIle list C:\\Temp");
			System.exit(0);//���α׷� ����
			
		}
		//
		File f = new File(args[0]); //File["C:\\Temp"]
		if(!f.exists() || !f.isAbsolute()){
			System.out.println("��ȿ���� ���� �����Գ״�^^");
			System.exit(0);
		}
//		System.out.println("�������");
		printFileList(f);
		System.out.println("������ �� :"+totalFiles);
		System.out.println("������ �� :"+totalDirs);

	}
	static void printFileList(File dir){
		System.out.println("[Full pat : "+dir.getAbsolutePath() + " ]");
		//���� ����
		ArrayList<Integer> subDir = new ArrayList<>();
		File[] files = dir.listFiles(); //files �迭 (Temp ���� �Ʒ� > ����)
		for(int i =0; i<files.length ; i++){
			//��� ���
			String filename = files[i].getName();//���� �̸�, ���� �̸�
//			System.out.println(filename);
			if(files[i].isDirectory()){
				//����
				filename = "<DIR>  ["+filename +"]";
				subDir.add(i);
			}else {
				//����
				filename = filename + " / " +files[i].length() + "Byte";
			}
			System.out.println("  "+filename);
		}
		int DirNum = subDir.size();
		int FileNum = files.length - DirNum;
		
		totalDirs += DirNum;
		totalFiles += FileNum;
		System.out.println("[Current DirNum] ���� ���� :"+DirNum);
		System.out.println("[Current FileNum] ���� ����"+ FileNum);
		System.out.println("*********************************************************");
		//////////////////////////////////////////////////////////////////////////////
		//C:\Temp ���� ���� > aaa> bbb ���� (bbbb���� ���(x)
		for(int j = 0 ; j<subDir.size() ; j++){
			int index = subDir.get(j);
			printFileList(files[index]);
		}
		
	}
	//���� ����
	//f.createNewFile() ���� ����
	//f.delete ���� ���� (�������� ����)
}