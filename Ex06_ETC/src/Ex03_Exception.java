//�� pc ���� ��ġ
//���� CD �ֱ�
//�ӽ����� (CD copy)
//�ν��� (�ӽ� ����)
//�ӽ����� ����

//�ν��� �Ǵ� ���� ���� > �ӽ����� ���� ����
//�������� �ν���       > �ӽ����� ���� ����

public class Ex03_Exception {
	static void startInstall(){
		System.out.println("install");
	}
	static void CopyFiles(){
		System.out.println("copy file");
	}
	static void DeletFiles(){
		System.out.println("delete file");
	}
	public static void main(String[] args) {
		try {
			startInstall();
			CopyFiles();
			//���� ���ܸ� ���� ..
//			Exception ex = new Exception("Copy ����");
//			throw ex;//���� ������
			throw new Exception("Copy ����");
		} catch (Exception e) {
//			System.out.println("install �� ���� �߽��ϴ�.");
			System.out.println("���� �߻� " + e.getMessage());
		}finally {
			//****try �Ǵ� catch������ return���� ������ finally���� ����ȴ�.
			//���α׷��� ����(���� ����)
			//���α׷��� ������ (���� ����)
			DeletFiles();
		}
	}
}
