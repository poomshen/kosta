package kr.or.kosta;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ex00_Lotto {
	//속성 : 맴버변수 (로또 , Random...) , 생성자 활용
	static int []lotto = new int [45];
	static int n = 0;//50개
	static int temp = 0;
	static Scanner sc = new Scanner(System.in);
	static String path = "C:\\Temp\\Lotto.txt";
	
	//로또 생성자 이용 생성
	public Ex00_Lotto() {
		for(int i=0;i<this.lotto.length ;i++){
			this.lotto[i] = i+1;
		}
	}
	
	//메뉴 출력 메서드
	static void menuLotto(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@인생 한 방@@@@@@@@@");
		System.out.println("@@@@@@@@@대박 로 또@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("1.기본로또 2.최소최대로또 3.10의자리없는로또 4.지정숫자제거로또 5.프리미엄 6.종료");
		System.out.print("선택 :");
		int ck = Integer.parseInt(sc.nextLine());
		switch (ck) {
		case 1:
			lotto();
			rangeLotto();
			printLotto();
			Fileinster("기본로또 :");
			break;
		case 2:
			System.out.println("총합을 설정 가능합니다");
			System.out.print("최소값 :");
			int su = Integer.parseInt(sc.nextLine());
			System.out.print("최대값 :");
			int su2 = Integer.parseInt(sc.nextLine());
			if(su <= su2){
				termsLotto(su,su2);
				printLotto();
				Fileinster("최소최대로또 :");
			}else {
				System.out.println("최대값보다 최소값이 더 큽니다.");
			}
			break;
		case 3:
			termsLotto2();
			printLotto();
			Fileinster("10자리수 없는 로또 :");
			break;
		case 4:
			System.out.println("출력되지 않았으면 좋을 수를 입력하세요");
			int su3 = Integer.parseInt(sc.nextLine());
			termsLotto3(su3);
			printLotto();
			Fileinster("출력되지 않았으면 로또 :");
			break;
		case 5:
			System.out.println("출력되었으면 좋으실 자리수를 입력하세요 예) 선택 3  -> 33,23,13 등으로 하나 뽑힘");
			int su4 = Integer.parseInt(sc.nextLine());
			termsLotto4(su4);
			printLotto();
			Fileinster("1자리 수 로또 :");
			break;
		case 6:
			System.out.println("종료");
			System.exit(100);
		default:
			System.out.println("1~3까지 선택");
			break;
		}
	}
	
	//로또 중복 배제 매서드 
	static void lotto(){
		for(int y=0; y<1000; y++){
			n =(int)((Math.random()*45));//45개
			int temp = lotto[0];
			lotto[0] = lotto[n];
			lotto[n] = temp;
		}
		temp =0;
	}
	
	//로또 정렬 메서드
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
	
	//출력 메서드
	static void printLotto(){
			for(int i= 0; i<6; i++){
				System.out.print(" 번호:"+ lotto[i]);
			}
			System.out.println();
	}
	
	//조건 1 메서드
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
		System.out.println("로또의 총합은 :"+sum);
	}
	
	//조건 2 10~19인값 받지 말기
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
	
	//조건 지정한 숫자 나오지 않기
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
	
	//조건 지정한 자리수 숫자 나오기
	static void termsLotto4(int su){
		boolean ck = true;
		while(ck){
			lotto();
			rangeLotto();
			String str = "";
			for(int i= 0; i<6; i++){
				//여기서
				str = ""+lotto[i];
				if(str.length()==2){
					int gub = Integer.parseInt(str.substring(1));
					ck = !(gub==su)?true:false;
				}else{
					int gub = Integer.parseInt(str.substring(0));
					ck = !(gub == su)?true:false;
				}
				//한번이라도 false 가 찍히면 끝
				if(!ck){
					break;
				}
			}
		}
	}
	
	//파일 만들기
	public static void Fileinster(String nam){
		FileWriter file = null;
		BufferedWriter fo = null;
		for(int i= 0; i<6; i++){
			nam += " 번호:"+ lotto[i];
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
