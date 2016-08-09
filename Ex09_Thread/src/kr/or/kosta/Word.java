package kr.or.kosta;

import javax.swing.JOptionPane;

class WordInput extends Thread{ 
    static int cnt = 0;  //정답 횟수를 저장하기 위한 static 변수
 
    @Override
    public void run(){
        
        while (true){
            //string 배열 두 개를 선언해서 한글 단어 8개와 같은 순서로 매칭하는 영어 단어 8개를 받는다.
            String[] Word = {"밥", "시계", "사과", "커피", "음악", "그림", "학교" ,"친구"};
            String[] Word_Eng = {"rice", "watch", "apple", "coffee", "music",
                    "picture", "school","friend" };
 
            int i = (int)(Math.random()*8); 
            //문제를 랜덤하게 내기 위한 난수 발생
            //i는 Word_Eng의 배열의 번호에 넣어 랜덤한 배열의 방에 있는 단어를 불러온다.
 
            String input = JOptionPane.showInputDialog(Word[i]); 
 
            try {
                if(input.equals(Word_Eng[i])){ 
                    cnt ++;   
                    System.out.println("당신이 입력한 값은 : " + input); 
                    System.out.println("정답입니다.");
                    System.out.println("지금까지 맞춘 개수: " + cnt );
                }else if(input.equals("")){
                    System.out.println("당신이 입력한 값은 : " + input);
                    System.out.println("답을 입력해주세요.");
                }else{
                    System.out.println("당신이 입력한 값은 : " + input);
                    System.out.println("틀렸습니다.");
                }
            }catch(Exception e){
                System.out.println("답을 입력해주세요.");
            }
        }
    }
}
 
class TimeOut extends Thread{
    @Override
    public void run(){
        for (int i = 30 ; i > 0 ; i--){ //총 30초동안 게임이 진행됨
            try{
                System.out.println("남은 시간 : " + i);
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("게임종료");
        System.out.println("맞춘 갯수 : " + WordInput.cnt);
        System.exit(0);
    }
}
 
public class Word{
    public static void main(String[] args){
        WordInput wordinput = new WordInput();
        TimeOut wordtime = new TimeOut();
 
        wordinput.start();
        wordtime.start();
 
        System.out.println("제시되는 한글 단어에 맞는 영어 단어를 입력하세요");
    }
}