package Quze;

import javax.swing.JOptionPane;

//����
//main ������ Thread ��ü 2��
//1. �ð�(WordTime) ó�� �ϴ� Thread
//2. �ܾ�  �Է�â�� ���� ó���ϴ� Thread
//main  �Լ�����  2��  Thread start()
//�� �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰� �ϼ���
//�����ڿ� (hint)
class WordInputProcess extends Thread{
	@Override
	public void run(){
		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���"); //�ϳ��� ������
		if(inputdata != null && !inputdata.equals(""))
		{
			Ex05_Word_Game.inputcheck = true;
		} //�߰��ڵ�
		System.out.println("����� �Է��� ���� : " + inputdata);
	}
}
class WordTimeOut extends Thread{
	@Override
	public void run(){
		for(int i = 10 ; i > 0 ; i--){
			if(Ex05_Word_Game.inputcheck) return; //�߰��ڵ�
			try{
				System.out.println("���� �ð� : " + i);
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

public class Ex05_Word_Game {
	
	public static boolean inputcheck = false;
	
	public static void main(String[] args) {
		
		WordInputProcess wordinput = new WordInputProcess();
		WordTimeOut wordtime = new WordTimeOut();
		wordinput.start();
		wordtime.start();
		
		System.out.println("Main END");

	}

}