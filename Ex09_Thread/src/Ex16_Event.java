import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex16_Event {
	public static void main(String[] args) {
		Button btn = new Button("Click");
//		btn.addActionListener(new EventHandler());
		
		//�͸� Ŭ���� Ȱ��(�� �� ȿ������ �ڵ� ���)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}	

//ActionListener( ���� ���̽�)
//ActionListener ���� (click)
class EventHandler  implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//���� �ڵ�
		//acto
	}
	
}