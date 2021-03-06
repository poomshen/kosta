import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

class MyFrame extends Frame {
	public MyFrame(String title) {
		super(title);
	}
}

public class Ex15_awt_Frame {
	public static void main(String[] args) {
		MyFrame my = new MyFrame("Mylogin");
		my.setSize(350,300);
		my.setVisible(true);
		my.setLayout(new FlowLayout());
		
		Button button = new Button("나 버튼"); 
		button.setSize(100,80);
//		BtnclickHander bclick = new BtnclickHander();
//		button.addActionListener(new BtnclickHander());
//		BtnclickHander 자원은  button click 에서만 사용한다고 가정하고
		
		//굳이 클래스를 만들 필요가 있나? button 클릭시 만들어지고 버리자
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭?");
			}
		});
		
		TextField txtid = new TextField("ID 입력");
		TextField txtpwd = new TextField(0);
		txtpwd.setEchoChar('*');
		
		my.add(button);
		my.add(txtid);
		my.add(txtpwd);
		
		
	}
}

class BtnclickHander implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("나 클릭되었다.");
	}
	
}