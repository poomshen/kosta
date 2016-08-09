import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class LoginForm2 extends Frame{
	Label lbl_id;
	Label lbl_pass;
	TextField txt_id;
	TextField txt_pass;
	Button btn_ok;
	
	public LoginForm2(String title) {
		super(title);
		lbl_id = new Label("ID" ,Label.RIGHT);
		lbl_pass = new Label("Pwd" , Label.RIGHT);
		txt_id = new TextField(10);
		txt_pass = new TextField(10);
		txt_pass.setEchoChar('*');
		btn_ok = new Button("Login");
		this.setSize(400 , 500);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		
		this.add(lbl_id);
		this.add(txt_id);
		this.add(lbl_pass);
		this.add(txt_pass);
		this.add(btn_ok);
		
//		this.btn_ok.addActionListener(new Btn_Handler(txt_id, txt_pass));
		class Btn_Handler2 implements ActionListener{
			
		@Override
		public void actionPerformed(ActionEvent e) {
			String  id = txt_id.getText();
			String pass = txt_pass.getText();
			//outer 자원을 .. 사용할 수 있다.
			if(id.equals("kglim")){
				System.out.println("방가" + "/ " + id);
			}else {
				System.out.println("로그인 실패");
			}
			
		}
		}
		
	}
	
	
}


public class Ex20_Event_Login2 {
	public static void main(String[] args) {
		LoginForm2 LoginForm = new LoginForm2("로그인 폼222");
	}
}
