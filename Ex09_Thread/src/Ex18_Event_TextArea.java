import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class EventExam  extends Frame {
	TextArea ta ;
	Button  b1 , b2 ;
	public EventExam() {
		super("�̺�Ʈ");
		ta = new TextArea();
		b1 = new Button("�̺�Ʈ ����");
		b2 = new Button("����");
		
		b1.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
			System.out.println("����~");
		}	});
//		b1.addActionListener(new BtnActionHandler());
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("dd");
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//layout ����
		this.add("North",b1);
		this.add("Center",ta);
		this.add("South", b2);
	}
	
}

class BtnActionHandler implements ActionListener{

	//��ư : ��ư Ŭ���� ȣ�� (actionPerformed)
	//Textfield : ���ͽ� ȣ�� (actionPerformed)
	@Override
	public void actionPerformed(ActionEvent e) {
		//ActionEvent e : ����� ����ŷ �ڿ� ������ �޾ƿ�
		System.out.println("���� ������");
	}
	
}
public class Ex18_Event_TextArea {
	public static void main(String[] args) {
		EventExam ex = new EventExam();
		ex.setSize(400,400);
		ex.setVisible(true);
	}
}