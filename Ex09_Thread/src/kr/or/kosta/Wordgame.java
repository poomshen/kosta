package kr.or.kosta;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class WordTime extends Thread {
	 
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("남은시간 : " + i);
            try {
                Thread.sleep(1000);
 
            } catch (Exception e) {
 
            }
        }
        System.out.println("시간떙땡떙떙떙");
        System.exit(0);
    }
}
 
public class Wordgame {
 
    static int point;
 
    public static void main(String[] args) {
 
        ArrayList<String> ans = new ArrayList<>();
        ans.add("Cotinue");
        ans.add("Firmino");
        ans.add("Gerrard");
        ans.add("Sturridge");
        ans.add("Milner");
        ArrayList<String> num = new ArrayList<>();
        num.add("10");
        num.add("11");
        num.add("8");
        num.add("15");
        num.add("7");
        WordTime timer = new WordTime();
        timer.start();
 
        for (int i = 0; i < ans.size(); i++) {
            String inputdata = JOptionPane.showInputDialog("====리버풀 문제다====\n" + ans.get(i) + "의 등번호는 : ");
            // num.get(i);
            System.out.println(ans.get(i) + "등 번호는? : " + inputdata);
            if (inputdata.equals(num.get(i))) {
                System.out.println("정답입니다.");
                point += 1;
            }
        }
        System.out.println("맞힌 개수는 " + point + "개입니다.");
        if (point == 5) {
            System.out.println("너는 진정한 콥이다 !!!!You Never Walk Alone!!!!");
        } else {
            System.out.println("ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ");
        }
        System.exit(0);
    }
 
}