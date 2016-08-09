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
		
		Button button = new Button("�� ��ư"); 
		button.setSize(100,80);
//		BtnclickHander bclick = new BtnclickHander();
//		button.addActionListener(new BtnclickHander());
//		BtnclickHander �ڿ���  button click ������ ����Ѵٰ� �����ϰ�
		
		//���� Ŭ������ ���� �ʿ䰡 �ֳ�? button Ŭ���� ��������� ������
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ŭ��?");
			}
		});
		
		TextField txtid = new TextField("ID �Է�");
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
		System.out.println("�� Ŭ���Ǿ���.");
	}
	
}