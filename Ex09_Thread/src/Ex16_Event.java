import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex16_Event {
	public static void main(String[] args) {
		Button btn = new Button("Click");
//		btn.addActionListener(new EventHandler());
		
		//익명 클래스 활용(좀 더 효율적인 코드 방식)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}	

//ActionListener( 인터 페이스)
//ActionListener 감지 (click)
class EventHandler  implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//구현 코드
		//acto
	}
	
}