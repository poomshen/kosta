import javax.swing.JOptionPane;

//�ܾ� ���߱� ����
//�ܾ� ���ߴ� â(�Է�) : ������ �ð��� �ο� (�ð�)

//Single_Thread (main)
public class Ex03_Single_word_Game {
	public static void main(String[] args) {
		//AWT , SWING (����.. �Ⱦ�)
		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("����� �Է��� ���� "+inputdata);
		Timer();
		
	}
	static void Timer(){
		for(int i=10 ; i>0 ; i--){
			System.out.println("���� �ð� :" +i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
