package kr.or.kosta;

import java.util.Calendar;

public class Company_Date {
//시스템 사용하는 날짜제공하는 함수
//날짜라는 함수는 사용빈도가 높다.
//static 함수
	public static String DateStirng(Calendar date){
		//2016년8월3일 형식을 return 함수
		String ru = date.get(Calendar.YEAR)+ "년" + ((date.get(Calendar.MONTH))+1) +"월"
				+ date.get(Calendar.DATE)+"일";
		return ru;
	}
	//(date,"/" ) >2016/8/3    (date,".") > 2016.8.3 출력
	public static String DeteString(Calendar date,String opr) {
		String ru = date.get(Calendar.YEAR)+ opr + ((date.get(Calendar.MONTH))+1) +opr
				+ date.get(Calendar.DATE)+opr;
		return ru;
	}
	//년 월일 > 1~9 한자리  , 10~12 두자리
	//2016년 02월 16일 , 2016년 12일 10일
	//함수 안에서
	public static String MonthFormat_DateString(Calendar date) {
		String ru = null;
		if(((date.get(Calendar.MONTH))+1)<10){
			ru = date.get(Calendar.YEAR)+ "년" + "0"+((date.get(Calendar.MONTH))+1) +"월";
			ru += (date.get(Calendar.DATE)<10)?"0"+date.get(Calendar.DATE)+"일":date.get(Calendar.DATE)+"일";
		}else{
			ru = date.get(Calendar.YEAR)+ "년" + ((date.get(Calendar.MONTH))+1) +"월";
			ru += (date.get(Calendar.DATE)<10)?"0"+date.get(Calendar.DATE)+"일":date.get(Calendar.DATE)+"일";
		}
		return ru;
	}
}
