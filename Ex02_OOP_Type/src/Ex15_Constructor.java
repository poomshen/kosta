class Note{
	//�����ڸ� ������ ���� �ʴ� ���
	//new ���ؼ� ��ü ������ �� �ڵ�(default) ���� public Note(){} ���� �ȴ�.
}
class Note2{
	public Note2(){
		//�����ڸ� ������ٸ� �ǵ� (�ʱ�ȭ)
		System.out.println("���� dafault �����ھ�");
	}
}
class Note3{
	public Note3(int num){
		System.out.println("�� oberloading �̾� ���� ���� : "+num);
	}
	
	//Note3  = new Note3(); �ȵǿ�
	//point  : overloading �����ڰ� �ϳ��� �ִٸ�
	//default �����ڴ� �������� ������ ����� ��  ����.
	//�ǵ����� ������ٸ� ������ ���� �ϳ��� �޾ƾ� �Ѵٶ�� ������ �Ѱ��̴�.
}
class Note4{
	public Note4() {
		System.out.println("�� dafault");
	}
	public Note4(int num) {
		System.out.println("�� overloading");
	}
}
public class Ex15_Constructor {
 public static void main(String[] args) {
	 Note n = new Note();
	 Note2 n2 = new Note2();
	 Note3 n3 = new Note3(100);
	 
}
}
