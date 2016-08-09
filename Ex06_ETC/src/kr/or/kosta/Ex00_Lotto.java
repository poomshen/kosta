package kr.or.kosta;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ex00_Lotto {
	//�Ӽ� : �ɹ����� (�ζ� , Random...) , ������ Ȱ��
	static int []lotto = new int [45];
	static int n = 0;//50��
	static int temp = 0;
	static Scanner sc = new Scanner(System.in);
	static String path = "C:\\Temp\\Lotto.txt";
	
	//�ζ� ������ �̿� ����
	public Ex00_Lotto() {
		for(int i=0;i<this.lotto.length ;i++){
			this.lotto[i] = i+1;
		}
	}
	
	//�޴� ��� �޼���
	static void menuLotto(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@�λ� �� ��@@@@@@@@@");
		System.out.println("@@@@@@@@@��� �� ��@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("1.�⺻�ζ� 2.�ּ��ִ�ζ� 3.10���ڸ����·ζ� 4.�����������ŷζ� 5.�����̾� 6.����");
		System.out.print("���� :");
		int ck = Integer.parseInt(sc.nextLine());
		switch (ck) {
		case 1:
			lotto();
			rangeLotto();
			printLotto();
			Fileinster("�⺻�ζ� :");
			break;
		case 2:
			System.out.println("������ ���� �����մϴ�");
			System.out.print("�ּҰ� :");
			int su = Integer.parseInt(sc.nextLine());
			System.out.print("�ִ밪 :");
			int su2 = Integer.parseInt(sc.nextLine());
			if(su <= su2){
				termsLotto(su,su2);
				printLotto();
				Fileinster("�ּ��ִ�ζ� :");
			}else {
				System.out.println("�ִ밪���� �ּҰ��� �� Ů�ϴ�.");
			}
			break;
		case 3:
			termsLotto2();
			printLotto();
			Fileinster("10�ڸ��� ���� �ζ� :");
			break;
		case 4:
			System.out.println("��µ��� �ʾ����� ���� ���� �Է��ϼ���");
			int su3 = Integer.parseInt(sc.nextLine());
			termsLotto3(su3);
			printLotto();
			Fileinster("��µ��� �ʾ����� �ζ� :");
			break;
		case 5:
			System.out.println("��µǾ����� ������ �ڸ����� �Է��ϼ��� ��) ���� 3  -> 33,23,13 ������ �ϳ� ����");
			int su4 = Integer.parseInt(sc.nextLine());
			termsLotto4(su4);
			printLotto();
			Fileinster("1�ڸ� �� �ζ� :");
			break;
		case 6:
			System.out.println("����");
			System.exit(100);
		default:
			System.out.println("1~3���� ����");
			break;
		}
	}
	
	//�ζ� �ߺ� ���� �ż��� 
	static void lotto(){
		for(int y=0; y<1000; y++){
			n =(int)((Math.random()*45));//45��
			int temp = lotto[0];
			lotto[0] = lotto[n];
			lotto[n] = temp;
		}
		temp =0;
	}
	
	//�ζ� ���� �޼���
	static void rangeLotto(){
	for(int i = 0; i<6; i++){
		for(int j=0; j<6; j++){
			if(lotto[i]<lotto[j]){
				temp=lotto[i];
				lotto[i]=lotto[j];
				lotto[j]=temp;
			}
		}
		temp =0;
	}
	}
	
	//��� �޼���
	static void printLotto(){
			for(int i= 0; i<6; i++){
				System.out.print(" ��ȣ:"+ lotto[i]);
			}
			System.out.println();
	}
	
	//���� 1 �޼���
	static void termsLotto(int su,int su2){
		boolean ck = true;
		int sum = 0;
		while(ck){
			sum = 0;
			lotto();
			rangeLotto();
			for(int i= 0; i<6; i++){
				 sum += lotto[i] ;
			}
			ck = !(su<=sum&&su2>=sum)?true:false;
		}
		System.out.println("�ζ��� ������ :"+sum);
	}
	
	//���� 2 10~19�ΰ� ���� ����
	static void termsLotto2(){
		boolean ck = true;
		while(ck){
			lotto();
			rangeLotto();
			for(int i= 0; i<6; i++){
				 ck = (9<lotto[i]&&20>lotto[i])?true:false;
				 if(ck){
					 break;
				 }
			}
		}
	}
	
	//���� ������ ���� ������ �ʱ�
	static void termsLotto3(int su){
		boolean ck = true;
		while(ck){
			lotto();
			rangeLotto();
			for(int i= 0; i<6; i++){
				ck = (lotto[i]==su)?true:false;
				if(ck){
					break;
				}
			}
		}
	}
	
	//���� ������ �ڸ��� ���� ������
	static void termsLotto4(int su){
		boolean ck = true;
		while(ck){
			lotto();
			rangeLotto();
			String str = "";
			for(int i= 0; i<6; i++){
				//���⼭
				str = ""+lotto[i];
				if(str.length()==2){
					int gub = Integer.parseInt(str.substring(1));
					ck = !(gub==su)?true:false;
				}else{
					int gub = Integer.parseInt(str.substring(0));
					ck = !(gub == su)?true:false;
				}
				//�ѹ��̶� false �� ������ ��
				if(!ck){
					break;
				}
			}
		}
	}
	
	//���� �����
	public static void Fileinster(String nam){
		FileWriter file = null;
		BufferedWriter fo = null;
		for(int i= 0; i<6; i++){
			nam += " ��ȣ:"+ lotto[i];
		}
		try {
			byte [] nam2 = nam.getBytes();
			file = new FileWriter(path ,true);
			fo = new BufferedWriter(file);
			fo.write(nam);
			fo.newLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fo.close();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}