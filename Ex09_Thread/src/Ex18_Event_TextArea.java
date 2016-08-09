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
		super("이벤트");
		ta = new TextArea();
		b1 = new Button("이벤트 생성");
		b2 = new Button("종료");
		
		b1.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
			System.out.println("구현~");
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
		
		//layout 설정
		this.add("North",b1);
		this.add("Center",ta);
		this.add("South", b2);
	}
	
}

class BtnActionHandler implements ActionListener{

	//버튼 : 버튼 클릭시 호출 (actionPerformed)
	//Textfield : 엔터시 호출 (actionPerformed)
	@Override
	public void actionPerformed(ActionEvent e) {
		//ActionEvent e : 사건을 일으킹 자원 정보를 받아요
		System.out.println("불을 끄세요");
	}
	
}
public class Ex18_Event_TextArea {
	public static void main(String[] args) {
		EventExam ex = new EventExam();
		ex.setSize(400,400);
		ex.setVisible(true);
	}
}
