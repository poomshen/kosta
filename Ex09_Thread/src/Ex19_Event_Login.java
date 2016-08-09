import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Btn_Handler implements ActionListener{
	private TextField txtid;
	private TextField txtpwd;
	
	public Btn_Handler(TextField txtid , TextField txtpwd) {
		this.txtid = txtid;
		this.txtpwd = txtpwd;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(txtid.getText().equals("kglim")){
			System.out.println("방가" + "/ " + txtid);
		}else {
			System.out.println("로그인 실패");
		}
		
	}
	
}

class LoginForm extends Frame{
	Label lbl_id;
	Label lbl_pass;
	TextField txt_id;
	TextField txt_pass;
	Button btn_ok;
	
	public LoginForm(String title) {
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
		
		this.btn_ok.addActionListener(new Btn_Handler(txt_id, txt_pass));
		
	}
	
	
}

public class Ex19_Event_Login {
	public static void main(String[] args) {
		LoginForm loginForm = new LoginForm("로그인 폼");
	}

}
