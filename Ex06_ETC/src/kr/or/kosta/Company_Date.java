package kr.or.kosta;

import java.util.Calendar;

public class Company_Date {
//�ý��� ����ϴ� ��¥�����ϴ� �Լ�
//��¥��� �Լ��� ���󵵰� ����.
//static �Լ�
	public static String DateStirng(Calendar date){
		//2016��8��3�� ������ return �Լ�
		String ru = date.get(Calendar.YEAR)+ "��" + ((date.get(Calendar.MONTH))+1) +"��"
				+ date.get(Calendar.DATE)+"��";
		return ru;
	}
	//(date,"/" ) >2016/8/3    (date,".") > 2016.8.3 ���
	public static String DeteString(Calendar date,String opr) {
		String ru = date.get(Calendar.YEAR)+ opr + ((date.get(Calendar.MONTH))+1) +opr
				+ date.get(Calendar.DATE)+opr;
		return ru;
	}
	//�� ���� > 1~9 ���ڸ�  , 10~12 ���ڸ�
	//2016�� 02�� 16�� , 2016�� 12�� 10��
	//�Լ� �ȿ���
	public static String MonthFormat_DateString(Calendar date) {
		String ru = null;
		if(((date.get(Calendar.MONTH))+1)<10){
			ru = date.get(Calendar.YEAR)+ "��" + "0"+((date.get(Calendar.MONTH))+1) +"��";
			ru += (date.get(Calendar.DATE)<10)?"0"+date.get(Calendar.DATE)+"��":date.get(Calendar.DATE)+"��";
		}else{
			ru = date.get(Calendar.YEAR)+ "��" + ((date.get(Calendar.MONTH))+1) +"��";
			ru += (date.get(Calendar.DATE)<10)?"0"+date.get(Calendar.DATE)+"��":date.get(Calendar.DATE)+"��";
		}
		return ru;
	}
}