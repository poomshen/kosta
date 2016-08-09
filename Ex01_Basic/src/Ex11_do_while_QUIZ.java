import java.util.Scanner;

public class Ex11_do_while_QUIZ {
	static Scanner sc =new Scanner(System.in);
	static void inputRecord(){
		System.out.println("성적 데이터 입력");
	}
	static void deleteRecord(){
		System.out.println("성적 데이터 삭제");
	}
	static void sortRecord(){
		System.out.println("성적 데이터 정렬");
	}
	static int displayMenu(){
		System.out.println("*****************************");
		System.out.println("***********[성적관리]**********");
		System.out.println("1.학생 성적 입력하기 ");
		System.out.println();
		System.out.println("2.학생 성적 삭제 ");
		System.out.println();
		System.out.println("3.학생 데이터 정렬 ");
		System.out.println();
		System.out.println("4.프로그램 종료 ");
		int menu= 0;
		do{
			try{
				menu= Integer.parseInt(sc.nextLine());
				if(menu>=1 && menu <=4){
					break;
				}else {
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("메뉴를 잘못선택");
				System.out.println("원하는 메뉴를 1~4까지 선택 해주세요");
			}
		}while(true);
		return menu;
		
		
	}
	public static void main(String[] args) {
		while(true){
			switch(displayMenu()){
			case 1:
				inputRecord();
				break;
			case 2:
				deleteRecord();
				break;
			case 3:
				sortRecord();
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
				
			}
		}
	}
}
