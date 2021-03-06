import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.WindowConstants;

//이벤트 처리
//1.Event Resource : 발생기 (Button , TextField , TextArea)
//2.Event Handler : 처리기 (버튼 클릭 > 창닫기 , 열기)
//Java API (인터 페이스 설계)

class WindowEventHandler implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {//발생지 (frame)
		e.getWindow().setVisible(false);//보이지 않기
		e.getWindow().dispose();//메모리 제거
		System.out.println("창닫기 성공");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class Ex17_Event {
	public static void main(String[] args) {
		Frame f = new Frame("logen");
		f.setSize(300,300);
		f.addWindowListener(new WindowEventHandler());
		f.setVisible(true);
	}

}
