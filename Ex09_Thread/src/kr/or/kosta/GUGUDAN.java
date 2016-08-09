package kr.or.kosta;
import javax.swing.JOptionPane;

class InputGuguDan extends Thread {
 
 static int result = 0; //점수 누적하기
 @Override
 public void run() {
  System.out.println("[ 시간 안에 값 입력 ]");
  while (true) {
         int dan = (int) (Math.random() * 8) + 2;
   int su =  (int) (Math.random() * 9) + 1;
    String input = JOptionPane.showInputDialog(dan + " * " + su + " = " + "??");
   
    
   int vomit = Integer.parseInt(input);
    if (vomit == (dan * su)) {
    result++;
    System.out.println("[" + dan + " * " + su + " = " + vomit + "]");
   } else {
    System.out.println("당신의 답은: " + input + " \n에휴 틀렸어. 정답은 " + dan * su);
    System.out.println("지금까지 맞춘 개수: " + result);
    //return; 함수를 벗어나게 해서  그 다음 수행할 것이 없다면 종료
    System.exit(0); //프로세스 종료
   }
  }
 }
}
 
class GuguDanTimer extends Thread {
 
 public void run() {
 
  for (int i = 20; i > 0; i--) {
   System.out.println(i);
   try {
    Thread.sleep(1000); // 1초
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
  //정상적으로 시간이 흐른 경우 처리 ////////////////////////////////////
  System.out.println("구구단 공부");
  System.out.println("정답맞춘 갯수  " + InputGuguDan.result);
  System.exit(0); // 이렇게 하지 않으면 단어창이 떠있네요 프로세스 종료감행
 
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
 