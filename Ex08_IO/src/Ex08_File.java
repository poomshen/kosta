import java.io.File;

//File Ŭ����
//���ϰ� ���� (directory) �ٷ�� Ŭ����

//Ms > File , Directory Ŭ����
//java > File

//File : ���ο� ������ ����, ���� , ����
//     : ������ ���� , ���� , ����

//��� 
//������: C:\\ , D:\\ ,C:\kosta129\... 
//�����: ���� ��ġ 
public class Ex08_File {
	public static void main(String[] args) {
		String path ="C:\\Temp\\aaa\\aaa.txt"; //������
		File f = new File(path);
		
		//File Ŭ���� :���� ����
		String filename = f.getName();
		System.out.println(filename);
		
		//���� �̸� �� Ȯ����
		int pos = filename.indexOf(".");
		System.out.println(filename.substring(0,pos));//������ ���� �̸� ���� ����
		System.out.println(filename.substring(++pos));//������ Ȯ���� �� ���� ����
		
		//File Ŭ������ ������ �ִ� �Լ� (����)
		System.out.println("��ü���: "+f.getParent());//��ü���
//		System.out.println(f.getAbsolutePath());//���� ��� ���� ���� �Լ�
		System.out.println("�� ������?"+f.isDirectory());//���� ���� �������� �Ǵ� �ϴ� �Լ�
		System.out.println("�� �����̴�?"+f.isFile());//�����̶�� true 
		System.out.println("������  ũ�� : "+f.length() +"byte"); //������ ũ�� ����Ʈ ������
		System.out.println("�θ��� : "+f.getParent());//�ڽ��� ������ �� ���
		System.out.println("���� ���� ����"+f.exists());//������ ���� �ϴ� ��
		
		
	}
}
