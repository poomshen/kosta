import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class LoginForm3 extends Frame{
   Label lbl_id;
   Label lbl_pwd;
   TextField txt_id;
   TextField txt_pwd;
   Button btn_ok;
   public LoginForm3(String title){
      super(title);
      lbl_id = new Label("ID:",Label.RIGHT);
      lbl_pwd = new Label("PWD:",Label.RIGHT);
      txt_id = new TextField(10);
      txt_pwd = new TextField(10);
      txt_pwd.setEchoChar('#');
      btn_ok = new Button("login");
      
      this.setLayout(new FlowLayout());//�������
      this.setSize(500,100);
      this.setVisible(true);
      
      //Frame add
      this.add(lbl_id);
      this.add(txt_id);
      this.add(lbl_pwd);
      this.add(txt_pwd);
      this.add(btn_ok);
      
      
      //Inner class
      //���� : OuterClass �ڿ��� ���� �� �� �ִ�
      /*class Btn_Handler implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent e) {
            String id = txt_id.getText(); // outer �ڿ��� ...
            String pwd = txt_pwd.getText(); 
            
            System.out.println(id + " / " + pwd);
            
            if(!id.equals("kglim")){
               System.out.println("��ȿ���� ���� ID");
               txt_id.requestFocus();
               txt_id.selectAll();
            }else if(!pwd.equals("1004")){
               System.out.println("��ȿ���� ���� PWD");
               txt_pwd.requestFocus();
               txt_pwd.selectAll();
            }else{
               System.out.println("�����ڴ� : " + txt_id.getText() );
            }
         }
         
      }*/
      
      //�������̽� ���� ����
      this.btn_ok.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            String id = txt_id.getText(); // outer �ڿ��� ...
            String pwd = txt_pwd.getText(); 
            
            System.out.println(id + " / " + pwd);
            
            if(!id.equals("kglim")){
               System.out.println("��ȿ���� ���� ID");
               txt_id.requestFocus();
               txt_id.selectAll();
            }else if(!pwd.equals("1004")){
               System.out.println("��ȿ���� ���� PWD");
               txt_pwd.requestFocus();
               txt_pwd.selectAll();
            }else{
               System.out.println("�����ڴ� : " + txt_id.getText() );
            }
            
         }
      });
   /*   this.addWindowListener(new WindowListener() {
         
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
            e.getWindow().setVisible(false); //������ �ʱ�
            e.getWindow().dispose(); //�޸� ����
            
         }
         
         @Override
         public void windowClosed(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void windowActivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
         }
      });*/
   
      //���࿡ WindowListener �������̽� ��� �ڿ� ���� ����
      //�ڵ� ���� : WindowAdapter �ʿ��� �� ������
      this.addWindowListener(new WindowAdapter() {

         @Override
         public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false); //������ �ʱ�
            e.getWindow().dispose(); //�޸� ����
         }
         
      });
   }
}
public class Ex21_Event_Login3 {

   public static void main(String[] args) {
      LoginForm3 login = new LoginForm3("�������̽� ����");

   }

}