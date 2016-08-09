package kr.or.kosta;

import javax.swing.JOptionPane;

class WordInput extends Thread{ 
    static int cnt = 0;  //���� Ƚ���� �����ϱ� ���� static ����
 
    @Override
    public void run(){
        
        while (true){
            //string �迭 �� ���� �����ؼ� �ѱ� �ܾ� 8���� ���� ������ ��Ī�ϴ� ���� �ܾ� 8���� �޴´�.
            String[] Word = {"��", "�ð�", "���", "Ŀ��", "����", "�׸�", "�б�" ,"ģ��"};
            String[] Word_Eng = {"rice", "watch", "apple", "coffee", "music",
                    "picture", "school","friend" };
 
            int i = (int)(Math.random()*8); 
            //������ �����ϰ� ���� ���� ���� �߻�
            //i�� Word_Eng�� �迭�� ��ȣ�� �־� ������ �迭�� �濡 �ִ� �ܾ �ҷ��´�.
 
            String input = JOptionPane.showInputDialog(Word[i]); 
 
            try {
                if(input.equals(Word_Eng[i])){ 
                    cnt ++;   
                    System.out.println("����� �Է��� ���� : " + input); 
                    System.out.println("�����Դϴ�.");
                    System.out.println("���ݱ��� ���� ����: " + cnt );
                }else if(input.equals("")){
                    System.out.println("����� �Է��� ���� : " + input);
                    System.out.println("���� �Է����ּ���.");
                }else{
                    System.out.println("����� �Է��� ���� : " + input);
                    System.out.println("Ʋ�Ƚ��ϴ�.");
                }
            }catch(Exception e){
                System.out.println("���� �Է����ּ���.");
            }
        }
    }
}
 
class TimeOut extends Thread{
    @Override
    public void run(){
        for (int i = 30 ; i > 0 ; i--){ //�� 30�ʵ��� ������ �����
            try{
                System.out.println("���� �ð� : " + i);
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("��������");
        System.out.println("���� ���� : " + WordInput.cnt);
        System.exit(0);
    }
}
 
public class Word{
    public static void main(String[] args){
        WordInput wordinput = new WordInput();
        TimeOut wordtime = new TimeOut();
 
        wordinput.start();
        wordtime.start();
 
        System.out.println("���õǴ� �ѱ� �ܾ �´� ���� �ܾ �Է��ϼ���");
    }
}