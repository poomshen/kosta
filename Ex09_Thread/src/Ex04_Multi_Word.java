import java.util.HashMap;

import javax.swing.JOptionPane;

class WordTime extends Thread{
	static int time = 0 ;
	@Override
	public void run() {
		time = 0;
		for(int i=10 ; i>0 ; i--){
			System.out.println("���� �ð� :" +i);
			try {
				Thread.sleep(1000);
				time++;
				if(time ==10){
					System.out.println("�ð� �ʰ� �Ǿ����ϴ�.");
					System.out.println("�ý��� ����");
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex04_Multi_Word{
	static HashMap<Integer,trouble> map = new HashMap<>();
	public static boolean inputcheck = false;
	

	public static void main(String[] args) {
		int cout = 0;
		while(true){
		int in = word();
		WordTime Timer = new WordTime();
		Timer.start();
		String inputdata = JOptionPane.showInputDialog(" "+map.get(in).trouble +" �� �����ϱ��?");
		///�ð� �ʰ�
		if(ckWord(in,inputdata)){
			//�´ٸ�
			System.out.println("�����Դϴ�.");
			cout++;
			Timer.stop();
			if(cout == 10){
				System.out.println("���� "+ cout +"���� ��� ������ϴ�.");
				System.exit(0);
			}
		}else if(!ckWord(in,inputdata)){
			//Ʋ���ٸ�
			System.out.println("�����Դϴ�.");
			System.out.println("���� ���� ���� ������ "+cout +"�Դϴ�");
			System.exit(0);
//			inputcheck = false;
		}
	}
}
	//����
	static public int word(){
		int  ck = 0;
		map.put( 1, new trouble("apple", "���"));
		map.put( 2, new trouble("pizza", "����"));
		map.put( 3, new trouble("chicken", "ġŲ"));
		map.put( 4, new trouble("hamburger", "�ܹ���"));
		map.put( 5, new trouble("taxi", "�ý�"));
		map.put( 7, new trouble("human", "���"));
	    int i  = (int) (Math.random()*6);
		return i;
	}
	//������ �´���
	static public boolean ckWord(int in,String ine){
		boolean  ck =false;
		if(map.get(in).reply.equals(ine)){
			ck = true;
		}
		return ck;
	}
}