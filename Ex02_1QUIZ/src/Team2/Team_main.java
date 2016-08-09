package Team2;

import java.util.Scanner;

public class Team_main {
	
	public static void main(String[] args) {
		Team_BOOK []book = new Team_BOOK[]{new Team_BOOK("홍길동전","생각",10),
		new Team_BOOK("자바의 정석", "제임스", 2),new Team_BOOK("연예의정석", "카사노바", 3),
		new Team_BOOK("우리아기", "전효성", 5),new Team_BOOK("원", "더", 1),
		new Team_BOOK("제인", "제임스", 6),new Team_BOOK("광수", "생각", 3)
		};
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@3조 도서관@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(" 1. 조회  2. 검색  3. 대출  4. 반납  5. 종료 ");
//			대출,반납, 검색(책제목,저자정보)->(책 제목,저자정보,재고) ,조회
			int choice = Integer.parseInt(sc.nextLine());
		ba_a:	switch (choice) {
			case 1://조회
				for(int i=0; i<book.length; i++){
					book[i].bookSearch();
				}
				break;
			case 2://검색
				String ins1 =null;
				String ins2 =null;
				int getstock = 0;
				
				
				System.out.println("검색 1.제목 2.저자 3.재고 4.검색 선택");
				int choicesc1 = Integer.parseInt(sc.nextLine());
				
				//1번째 물음에 눌렀을 경우
				if(choicesc1==1){
					System.out.print("제목:");
					String bookname = sc.nextLine();
					ins1 = bookname;
					System.out.println("검색 2.저자 3.재고 4.전체검색 선택");
				}
				else if(choicesc1==2){
					System.out.print("저자:");
					String bookWiter = sc.nextLine();
					ins1 = bookWiter;
					System.out.println("검색 1.제목 3.재고 4.전체검색 선택");
				}
				else if(choicesc1==3){
					System.out.print("재고:");
					int bookStock = Integer.parseInt(sc.nextLine());
					getstock = bookStock;
					System.out.println("검색 1.제목 2.저자 4.전체검색 선택");
				}
				else if(choicesc1==4){
					for(int i=0; i<book.length; i++){
						book[i].bookSearch();
					}
					break;
				}else {
					System.out.println("1~4 중 선택 해주세요");
					choice = 2;
					break;
				}
				
				///2번째 물음
				
				int choicesc2 = Integer.parseInt(sc.nextLine());
				if(choicesc2==1){
					System.out.print("제목:");
					String bookname = sc.nextLine();
					ins2 = bookname;
					if(choicesc1 ==2){
						System.out.println("검색 3.재고 4.검색 선택");
					}else if(choicesc1 ==3){
						System.out.println("검색 2.저자 4.검색 선택");
					}
				}
				else if(choicesc2==2){
					System.out.print("저자:");
					String bookWiter = sc.nextLine();
					ins2 = bookWiter;
					if(choicesc1==1){
						System.out.println("검색 3.재고 4.검색 선택");
					}else if(choicesc1==3){
						System.out.println("검색 1.제목 4.검색 선택");
					}
				}
				else if(choicesc2==3){
					System.out.print("재고:");
					int bookStock = Integer.parseInt(sc.nextLine());
					getstock = bookStock;
					if(choicesc1 ==1){
						System.out.println("검색 2.저자 4.검색 선택");
					}else if(choicesc1==2){
						System.out.println("검색 1.제목 4.검색 선택");
					}
				}
				else if(choicesc2==4){
					System.out.println("검색을 실행 하겠습니다.");
					//여기서 
					//중간에 검색을 했을때 1번째 검색
					if(choicesc1 == 3){
							for(int i=0; i<book.length; i++){
								if(book[i].bookSearch(getstock)){
									book[i].bookSearch();
								}
							}
					}else{
						for(int i=0; i<book.length; i++){
							if(book[i].bookSearch(ins1)){
								book[i].bookSearch();
							}
						}
					}
					break;
				}else{
					System.out.println("올바르게 선택 해주세요");
				}
				
				//3번째 마지막 물음
				int choicesc3 = Integer.parseInt(sc.nextLine());
				//물음 답을 했을때
				
				//모두 선택 넣었을때
				if(choicesc3!=4){
					if(choicesc1==3||choicesc2==3||choicesc3==3){
						System.out.print("재고 :");
						int bookStock = Integer.parseInt(sc.nextLine());
						getstock = bookStock;
					}else if(choicesc2 ==1){
						System.out.print("제목");
						String bookname = sc.nextLine();
						ins1 = bookname;
					}else{
						System.out.print("저자");
						String bookWiter = sc.nextLine();
						ins2 =bookWiter;
					}
					for(int i=0; i<book.length; i++){
						if(book[i].bookSearch(ins1,ins2,getstock)){
							book[i].bookSearch();
						}
						break;
					}
				}else {
				}
				//마지막
				//중간에 검색을 했을때
				if(choicesc1 == 3 ||choicesc2 ==3){
					//재고 검색이 있을시
						for(Team_BOOK bok : book){
							if(bok.bookSearch(getstock, ins1)){
								bok.bookSearch();
							}
						}
				}else {
					for(Team_BOOK bok : book){
						if(bok.bookSearch(ins1,ins2)){
							bok.bookSearch();
						}
					}
				}
				break;
			case 3://대출
				System.out.println("대출 하실  책의 이름과  저자를  입력해 주세요");
				System.out.print("제목:");
				String bookname1 = sc.nextLine();
				System.out.print("저자:");
				String bookwiter1 = sc.nextLine();
				for(int i=0; i<book.length; i++){
					//제목 ,저자 맞는거 다찾음
				if(book[i].bookSearch(bookname1,bookwiter1)){
					if(book[i].getBookName().equals(bookname1)&&book[i].getBookWiter().equals(bookwiter1)){
						book[i].bookStockDown();
						System.out.println("대출되었습니다.");
						book[i].bookSearch();
						break ba_a;
					}else{
						System.out.println("이런책들도 있군요!!");
						book[i].bookSearch();
					}
				}else{
				}
				}
				System.out.println("존재 하지 않는 책 입니다.");
				
				break;
			case 4://반납
				System.out.println("반납 하실  책의 이름과  저자를  입력해 주세요");
				System.out.print("제목:");
				String bookname2 = sc.nextLine();
				System.out.print("저자:");
				String bookwiter2 = sc.nextLine();
				for(int i=0; i<book.length; i++){
					
					//제목 ,저자 맞는거 다찾음
				if(book[i].bookSearch(bookname2,bookwiter2)){
					if(book[i].getBookName().equals(bookname2)&&book[i].getBookWiter().equals(bookwiter2)){
						book[i].bookStockUP();
						book[i].bookSearch();
						System.out.println("반납되었습니다.");
						break ba_a;
					}
//					System.out.println("이 책은 저희 책이 아닙니다.");
					}
				}
				System.out.println("이 책은 저희 책이 아닙니다.");
				
				break;
			case 5:
				System.out.println("시스템 종료");
				System.exit(10);
				break;
			default:
				System.out.println("올바른 선택을 하세요");
				break;
			}
		}
		
	}

}
