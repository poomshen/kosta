package Quze;

import javax.swing.JOptionPane;

//문제
//main 제외한 Thread 객체 2개
//1. 시간(WordTime) 처리 하는 Thread
//2. 단어  입력창을 띄우는 처리하는 Thread
//main  함수에서  2객  Thread start()
//단 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하세요
//공유자원 (hint)
class WordInputProcess extends Thread{
	@Override
	public void run(){
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요"); //하나의 쓰레드
		if(inputdata != null && !inputdata.equals(""))
		{
			Ex05_Word_Game.inputcheck = true;
		} //추가코드
		System.out.println("당신이 입력한 값은 : " + inputdata);
	}
}
class WordTimeOut extends Thread{
	@Override
	public void run(){
		for(int i = 10 ; i > 0 ; i--){
			if(Ex05_Word_Game.inputcheck) return; //추가코드
			try{
				System.out.println("남은 시간 : " + i);
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
