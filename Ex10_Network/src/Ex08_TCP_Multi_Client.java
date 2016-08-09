import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class Ex08_TCP_Multi_Client extends JFrame implements ActionListener , Runnable {
	JTextArea ta;//���â
	JTextField txtinput; //�Է�â
	DataInputStream in;
	DataOutputStream out;
	
	public Ex08_TCP_Multi_Client(){
		//UI
		this.setTitle("Multi ä��");
		ta = new JTextArea();
		txtinput = new JTextField();
		JScrollPane sp = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				                         ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setAutoscrolls(true);
		ta.setBackground(Color.yellow);
		ta.setLineWrap(true);//�ؽ�Ʈ �ڵ� �ٹٲ�
		ta.setEditable(false);//���� �ȵ�
		
		txtinput.setText("��ȭ�Է�â");
		this.add(sp,"Center");
		this.add(txtinput,"South");
		this.setSize(400, 500);
		this.setVisible(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtinput.requestFocus();
		txtinput.selectAll();
		
		//�̺�Ʈ ó��
		txtinput.addActionListener(this);
		
		
		//���� �����ϱ�
		try{


			Socket socket = new Socket("192.168.0.161",9999);
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			//������ ����
			ta.append("������ ���ӵǾ����ϴ�\r\n");
			
			Thread thread = new Thread(this);
			thread.start();//run() �Լ� ����
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
	}

	public static void main(String[] args) {
		Ex08_TCP_Multi_Client client = new Ex08_TCP_Multi_Client();

	}

	
	
	
	@Override
	public void run() {
		try{
			String msg = in.readUTF();
			ta.append(msg + "\r\n");
			while(in != null){
				msg = in.readUTF();
				ta.append(msg +"\r\n");
			}
			
		}catch(Exception e){
			System.out.println("������ ������ ���� ����");
			return;
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//TextField �Է��ϰ� Enter ó���ϸ� 
		//ActionEvent ��Ȱ (Resource  �ľ�)
		System.out.println(e.getSource());
		if(e.getSource().equals(txtinput)){
			String msg = txtinput.getText();
			try{
				out.writeUTF(msg); //Client �Է��� ���� ������ ���
				txtinput.setText("");
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
	}

}