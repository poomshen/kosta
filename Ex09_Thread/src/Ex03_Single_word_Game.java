import javax.swing.JOptionPane;

//단어 맞추기 게임
//단어 맞추는 창(입력) : 일정한 시간이 부여 (시간)

//Single_Thread (main)
public class Ex03_Single_word_Game {
	public static void main(String[] args) {
		//AWT , SWING (현업.. 안씀)
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("당신이 입력한 값은 "+inputdata);
		Timer();
		
	}
	static void Timer(){
		for(int i=10 ; i>0 ; i--){
			System.out.println("남은 시간 :" +i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
