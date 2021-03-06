import java.util.HashMap;

import javax.swing.JOptionPane;

class WordTime extends Thread{
	static int time = 0 ;
	@Override
	public void run() {
		time = 0;
		for(int i=10 ; i>0 ; i--){
			System.out.println("남은 시간 :" +i);
			try {
				Thread.sleep(1000);
				time++;
				if(time ==10){
					System.out.println("시간 초과 되었습니다.");
					System.out.println("시스템 종료");
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
		String inputdata = JOptionPane.showInputDialog(" "+map.get(in).trouble +" 는 무엇일까요?");
		///시간 초가
		if(ckWord(in,inputdata)){
			//맞다면
			System.out.println("정답입니다.");
			cout++;
			Timer.stop();
			if(cout == 10){
				System.out.println("정답 "+ cout +"개를 모두 맞췄습니다.");
				System.exit(0);
			}
		}else if(!ckWord(in,inputdata)){
			//틀리다면
			System.out.println("오답입니다.");
			System.out.println("지금 까지 맞춘 개수는 "+cout +"입니다");
			System.exit(0);
//			inputcheck = false;
		}
	}
}
	//문제
	static public int word(){
		int  ck = 0;
		map.put( 1, new trouble("apple", "사과"));
		map.put( 2, new trouble("pizza", "피자"));
		map.put( 3, new trouble("chicken", "치킨"));
		map.put( 4, new trouble("hamburger", "햄버거"));
		map.put( 5, new trouble("taxi", "택시"));
		map.put( 7, new trouble("human", "사람"));
	    int i  = (int) (Math.random()*6);
		return i;
	}
	//문제가 맞는지
	static public boolean ckWord(int in,String ine){
		boolean  ck =false;
		if(map.get(in).reply.equals(ine)){
			ck = true;
		}
		return ck;
	}
}
