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
      
      this.setLayout(new FlowLayout());//순서대로
      this.setSize(500,100);
      this.setVisible(true);
      
      //Frame add
      this.add(lbl_id);
      this.add(txt_id);
      this.add(lbl_pwd);
      this.add(txt_pwd);
      this.add(btn_ok);
      
      
      //Inner class
      //장점 : OuterClass 자원에 접근 할 수 있다
      /*class Btn_Handler implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent e) {
            String id = txt_id.getText(); // outer 자원을 ...
            String pwd = txt_pwd.getText(); 
            
            System.out.println(id + " / " + pwd);
            
            if(!id.equals("kglim")){
               System.out.println("유효하지 않은 ID");
               txt_id.requestFocus();
               txt_id.selectAll();
            }else if(!pwd.equals("1004")){
               System.out.println("유효하지 않은 PWD");
               txt_pwd.requestFocus();
               txt_pwd.selectAll();
            }else{
               System.out.println("관리자님 : " + txt_id.getText() );
            }
         }
         
      }*/
      
      //인터페이스 직접 구현
      this.btn_ok.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            String id = txt_id.getText(); // outer 자원을 ...
            String pwd = txt_pwd.getText(); 
            
            System.out.println(id + " / " + pwd);
            
            if(!id.equals("kglim")){
               System.out.println("유효하지 않은 ID");
               txt_id.requestFocus();
               txt_id.selectAll();
            }else if(!pwd.equals("1004")){
               System.out.println("유효하지 않은 PWD");
               txt_pwd.requestFocus();
               txt_pwd.selectAll();
            }else{
               System.out.println("관리자님 : " + txt_id.getText() );
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
            e.getWindow().setVisible(false); //보이지 않기
            e.getWindow().dispose(); //메모리 제거
            
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
   
      //만약에 WindowListener 인터페이스 모든 자원 강제 구현
      //코드 개선 : WindowAdapter 필요한 것 재정의
      this.addWindowListener(new WindowAdapter() {

         @Override
         public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false); //보이지 않기
            e.getWindow().dispose(); //메모리 제거
         }
         
      });
   }
}
public class Ex21_Event_Login3 {

   public static void main(String[] args) {
      LoginForm3 login = new LoginForm3("인터페이스 구현");

   }

}