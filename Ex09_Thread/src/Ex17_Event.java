import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.WindowConstants;

//�̺�Ʈ ó��
//1.Event Resource : �߻��� (Button , TextField , TextArea)
//2.Event Handler : ó���� (��ư Ŭ�� > â�ݱ� , ����)
//Java API (���� ���̽� ����)

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
	public void windowClosing(WindowEvent e) {//�߻��� (frame)
		e.getWindow().setVisible(false);//������ �ʱ�
		e.getWindow().dispose();//�޸� ����
		System.out.println("â�ݱ� ����");
		
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