import java.io.File;

public class Ex09_File {
	public static void main(String[] args) {
//		System.out.println(args[0] + "/" +args[1]);
//		System.out.println("MAIN");
		if(args.length != 1){
			System.out.println("���� : java ���ϸ� [���丮���� �Է�]");
			System.exit(100);
		}
		//java Ex09_File kkk
		File f = new File(args[0]);//("kkk") ("C:\\Temp")
		///���� Ŭ���� ���� 
		if(!f.exists()|| !f.isDirectory()){ //���� �ϴ���
			System.out.println("��ȿ���� �ʴ� ���丮 �Դϴ�.");
			System.exit(0);
		}
		//��ȿ�� ����
		//file , Directory > File Ŭ����
		File[] files = f.listFiles(); // Temp ���� �ȿ� �ִ� ����,���� �迭�ȿ� ��
		for(int i = 0; i<files.length ; i++){
			String name = files[i].getName(); //������ �������� �����̶�� ���ϸ���
			System.out.println(files[i].isDirectory() ?"DIR : "+name:name);
		}
		
	}
}