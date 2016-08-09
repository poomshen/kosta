package Chatt_UI;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


 
class Send extends Thread implements ActionListener {
    Socket sk;
    TextField tf;
    Frame f;
    TextArea ta;
    PrintWriter pw;
 
    public Send(Socket sk, TextField tf, Frame f, TextArea ta) {
        this.sk = sk;
        this.tf = tf;
        this.f = f;
        this.ta = ta;
    }
 
    public void run() {
        try {
            tf.addActionListener(this); //액션, 엔터를 입력받기위한 설정
            pw = new PrintWriter(sk.getOutputStream(), true);
 
        } catch (IOException e1) {
            e1.printStackTrace();
        }
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) { 
        
        ta.append("나 : " + tf.getText() + "\n");
        pw.println(tf.getText());//값을 입력하고 엔터를 치면 그 내용을 TextArea에 뿌리고
        tf.setText("");//입력했던 내용을 지운다
    }
}
 
//메세지를 받는 클래스
class Receive extends Thread {
 
    Socket sk;
    TextArea ta;
 
    public Receive(Socket sk, TextArea ta) {
        this.sk = sk;
        this.ta = ta;
    }
 
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    sk.getInputStream()));
            String data = null;
            while (!(data = br.readLine()).equals("exit")) {
                ta.append("너 : " + data +"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
 
public class Server {
 
    public static void main(String[] args) throws Exception {
 
        ServerSocket ssk = new ServerSocket(9000);
        System.out.println("서버가 시작되었습니다.");
        Socket sk = ssk.accept();
        System.out.println("연결되엇습니다." + sk.getInetAddress());
 
        // 클라이언트와 연결되면 창 생성
        //값을 입력하는 TextField 와 값을 보여주는 TextArea 생성
        Frame f = new Frame("Server Kosta talk");
        f.setSize(500, 700);
        f.setLayout(new FlowLayout());
 
        TextArea ta = new TextArea();
        ta.setEditable(false);      //TextArea에 입력이 안되도록한다
        f.add(ta);
    
        TextField tf = new TextField(50);
        Label la = new Label("입력 : "); 
        f.add(la);
        f.add(tf);
 
        f.setVisible(true);
        Receive re = new Receive(sk,ta);
        re.start();
        Send send = new Send(sk, tf, f, ta);
        send.start();
    }
}
 
