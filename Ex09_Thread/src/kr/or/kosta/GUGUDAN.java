package kr.or.kosta;
import javax.swing.JOptionPane;

class InputGuguDan extends Thread {
 
 static int result = 0; //���� �����ϱ�
 @Override
 public void run() {
  System.out.println("[ �ð� �ȿ� �� �Է� ]");
  while (true) {
         int dan = (int) (Math.random() * 8) + 2;
   int su =  (int) (Math.random() * 9) + 1;
    String input = JOptionPane.showInputDialog(dan + " * " + su + " = " + "??");
   
    
   int vomit = Integer.parseInt(input);
    if (vomit == (dan * su)) {
    result++;
    System.out.println("[" + dan + " * " + su + " = " + vomit + "]");
   } else {
    System.out.println("����� ����: " + input + " \n���� Ʋ�Ⱦ�. ������ " + dan * su);
    System.out.println("���ݱ��� ���� ����: " + result);
    //return; �Լ��� ����� �ؼ�  �� ���� ������ ���� ���ٸ� ����
    System.exit(0); //���μ��� ����
   }
  }
 }
}
 
class GuguDanTimer extends Thread {
 
 public void run() {
 
  for (int i = 20; i > 0; i--) {
   System.out.println(i);
   try {
    Thread.sleep(1000); // 1��
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
  //���������� �ð��� �帥 ��� ó�� ////////////////////////////////////
  System.out.println("������ ����");
  System.out.println("������� ����  " + InputGuguDan.result);
  System.exit(0); // �̷��� ���� ������ �ܾ�â�� ���ֳ׿� ���μ��� ���ᰨ��
 
 }
}
 
public class GUGUDAN {
 
 public static void main(String[] args) {
  InputGuguDan Th_gugudan = new InputGuguDan();
  GuguDanTimer Th_timer = new GuguDanTimer();
 
  Th_gugudan.start();
  Th_timer.start();
 
 }
 
}
 