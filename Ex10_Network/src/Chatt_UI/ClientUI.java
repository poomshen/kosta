package Chatt_UI;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ClientUI {
	public static void main(String[] args) {
		ClientUI cui = new ClientUI();
	}
	
	MultiClient client = null;
	
	final static String SCREEN_CONN = "CONN";
	final static String SCREEN_NAME = "NAME";
	final static String SCREEN_CHAT = "CHAT";
	
	JFrame wnd = null;
	CardLayout screenCard = new CardLayout();
	JTextArea taMsgs = null;
	DefaultListModel lstUserData = null;
	JComboBox cbUsers = null;
	JTextField tfMsg = null;
	JButton btnSend = null;
	JScrollPane scrollMsg = null;
	
	String myName = null;
	public ClientUI(){
		client = new MultiClient(this);
		setUIElements();
		
	}
	
	private void setUIElements(){
		
		//창 설정
		wnd = new JFrame();
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wnd.setTitle("채팅 클라이언트");
		wnd.setSize(550, 300);
		wnd.setResizable(false);
		wnd.getContentPane().setLayout(screenCard);
		//IP, PORT 입력하고 서버에 접속하는 화면
		JPanel panelConnectParent = new JPanel(new FlowLayout());
		JPanel panelConnect = new JPanel(new BorderLayout());
		{
			JPanel pnInput = new JPanel(new GridLayout(4,1));
			pnInput.add(new JLabel("IP주소"));
			TextField tfIP = new TextField("127.0.0.1");
			pnInput.add(tfIP);
			pnInput.add(new JLabel("PORT번호"));
			TextField tfPORT = new TextField("9999");
			pnInput.add(tfPORT);
			
			JButton btnConn = new JButton("서버에\n연결");
			btnConn.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					client.connect(tfIP.getText(), tfPORT.getText());
					//connect(tfIP.getText(), tfPORT.getText());
				}
			});
			
			

			panelConnect.add(pnInput, "Center");
			panelConnect.add(btnConn, "East");
		}

		JPanel panelName = new JPanel(new FlowLayout());
		{
			panelName.add(new JLabel("이름 입력 : "));
			JTextField tfName = new JTextField();
			tfName.setPreferredSize(new Dimension(150,20));
			panelName.add(tfName);
			JButton btnOK = new JButton("확인");
			btnOK.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					myName = tfName.getText();
					client.send(myName);
					openScreen(2);
				}
			});
			panelName.add(btnOK);
		}
		
		panelConnectParent.add(panelConnect,"Center");
		
		
		
		
		//채팅 화면
		JPanel panelChat = new JPanel(new BorderLayout());
		{
			JPanel centerArea = new JPanel(new BorderLayout());
			{
				taMsgs = new JTextArea();
				taMsgs.setEditable(false);
				scrollMsg = new JScrollPane(taMsgs);
				
				centerArea.add(scrollMsg, "Center");
			}
			
			
			JPanel bottomArea = new JPanel(new BorderLayout());
			{
				cbUsers = new JComboBox(){
					@Override
					public Dimension getPreferredSize() {
						return new Dimension(120, 30);
					}
				};
				cbUsers.addItem("전체");
				bottomArea.add(cbUsers, "West");
				tfMsg = new JTextField();
				tfMsg.setActionCommand("SEND");
				tfMsg.addActionListener(btnActions);
				btnSend = new JButton("전송");
				btnSend.setActionCommand("SEND");
				btnSend.addActionListener(btnActions);
				bottomArea.add(tfMsg, "Center");
				bottomArea.add(btnSend, "East");
			}
			
			panelChat.add(centerArea, "Center");
			panelChat.add(bottomArea,"South");
		}
		
		wnd.add(panelConnectParent, SCREEN_CONN);
		wnd.add(panelName, SCREEN_NAME);
		wnd.add(panelChat, SCREEN_CHAT);
		
		openScreen(0);
		wnd.setVisible(true);
	}
	
	private ActionListener btnActions = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent event) {
			switch(event.getActionCommand()){
				case "SEND":
					if(cbUsers.getSelectedIndex() != 0){
						System.out.println(cbUsers.getSelectedItem());
						client.whisper(cbUsers.getSelectedItem().toString(), tfMsg.getText());
					} else {
						client.send(tfMsg.getText());
					}
					
					tfMsg.setText("");
					break;
			}
		}
	};

	
	public void openScreen(int idx){
		if(idx == 0){
			screenCard.show(wnd.getContentPane(), SCREEN_CONN);
		} else if(idx==1){
			screenCard.show(wnd.getContentPane(), SCREEN_NAME);
		}else {
			wnd.setTitle("채팅 클라이언트 : " + myName);
			screenCard.show(wnd.getContentPane(), SCREEN_CHAT);
		}
	}
	public void msgWindowUpdate(String msg){
		this.taMsgs.append(msg + "\n");
		//scrollMsg.
		scrollMsg.getVerticalScrollBar().setValue(scrollMsg.getVerticalScrollBar().getMaximum());
	}
	
	public void userListUpdate(String msg){
		
		String[] data  = msg.split("\n");
		System.out.println("접속자 목록 업데이트" + data.length);
		cbUsers.removeAllItems();
		cbUsers.addItem("전체");
		
		for(int i=1;i<data.length-1;i++){
			data[i] = data[i].trim();
			if(!data[i].startsWith(myName)){
				if(data[i].endsWith("(*)")){
					data[i] = data[i].substring(0,data[i].length()-3);
				}
				cbUsers.addItem(data[i]);
			}
		}
	}
}
