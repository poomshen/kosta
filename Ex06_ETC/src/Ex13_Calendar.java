import java.util.Calendar;
import java.util.Date;

import kr.or.kosta.Company_Date;

//JAVA API
//날짜
/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
 * GregorianCalendar
   buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
   태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
   의 인스턴스를 반환한다
   GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
   그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
   그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
   이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      다른 종류의 역법의 사용하는 국가에서 실행하면 변경......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        다른 종류의 역법의 사용하는 국가에서 실행하면 변경......   }  }
  API : 생성자 Protected Calendar() 
 */
//JAVA API
//날짜 : Date (구) -> Calendar(신)
public class Ex13_Calendar {
	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);

		//상수 (열거형)
		System.out.println("년도  :" + today.get(Calendar.YEAR));
		System.out.println("월(0~11)  :"+((today.get(Calendar.MONTH))+1));
		System.out.println("일 : "+today.get(Calendar.DATE));
		System.out.println("이 달의 몇째 주"+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일"+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일  :" + today.get(Calendar.DAY_OF_WEEK));
		//기준 (일요일 (1) 수요일(4)
		//우리나라 기준(-1) 
		System.out.println("오전 : 오후:"+today.get(Calendar.AM_PM)); 
		//오전: 0 , 오후 : 1
		
		//시 , 분, 초  각각 출력하세요
		System.out.println(" 시 :" + today.get(Calendar.HOUR));
		System.out.println(" 분 :" + today.get(Calendar.MINUTE));
		System.out.println(" 초 :" + today.get(Calendar.SECOND));
		
		
		//모든 시스템 날짜
		//100개의 페이지 > 날짜>
		//우리 회사 : 2016년8월3일  ->2016/08/03
		//날짜 , 문자 , 페이지 세팅 하는 것은 무식한 짓이다
		//함수로 만들어서 처리하자(각 페이지에서는 함수를 호출하자)
		//class DeteUtill { public String today(return 날짜 조합) }
		//DateUtil d = new DateUtil();
//		 d.today(); > 날짜 출력
		//class DeteUtill { public static String today(return 날짜 조합) }
//	 	Date Util.today();
		
		Calendar date = Calendar.getInstance();
		System.out.println(Company_Date.DateStirng(date));
		System.out.println(Company_Date.DeteString(date, "/"));
		System.out.println(Company_Date.MonthFormat_DateString(date));
		
	}

}
