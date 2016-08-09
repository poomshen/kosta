import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex12_PrintWriter {

		//PrintWriter 객체를 사용하면 [출력형식]을 정의하기 편하다
		//[ 웹 쪽  ]에서 일정 형식을 가지고 무었인가 데이터를 출력할때
			public static void main(String[] args) {
				try {
					//파일생성기능 가지고 있다
					PrintWriter pw = new PrintWriter("C:\\Temp\\homework2.txt");
					pw.println("*************************************");
					pw.println("*        HOMEWORK                   *");
					pw.println("*************************************");
					pw.printf("%3s  : %5d  %5d  %5d  %5.1f ", "아무개",10,30,50,(float)((10+30+50)/3));
					pw.println();
					pw.printf("%3s  : %5d  %5d  %5d  %5.1f ", "김유신",100,30,50,(float)((100+30+50)/3));
					pw.println();
					pw.printf("%3s  : %5d  %5d  %5d  %5.1f ", "이순신",10,90,50,(float)((10+90+50)/3));
					pw.println();
					pw.close(); //close() 실파일에 write
					
					//read....
					FileReader fr = new FileReader("C:\\Temp\\homework2.txt");
					BufferedReader br = new BufferedReader(fr); //장점 : line() enter 기반으로
					String s="";
					while((s = br.readLine()) != null){
						System.out.println(s);
					}
					br.close();
					fr.close();
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				

			}

		}
