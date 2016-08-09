import java.util.Calendar;
import java.util.Date;

import kr.or.kosta.Company_Date;

//JAVA API
//��¥
/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
 * GregorianCalendar
   buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
   �±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
   �� �ν��Ͻ��� ��ȯ�Ѵ�
   GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
   �׷������¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
   �׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
   ������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......   }  }
  API : ������ Protected Calendar() 
 */
//JAVA API
//��¥ : Date (��) -> Calendar(��)
public class Ex13_Calendar {
	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);

		//��� (������)
		System.out.println("�⵵  :" + today.get(Calendar.YEAR));
		System.out.println("��(0~11)  :"+((today.get(Calendar.MONTH))+1));
		System.out.println("�� : "+today.get(Calendar.DATE));
		System.out.println("�� ���� ��° ��"+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�� ���� �� ��"+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("����  :" + today.get(Calendar.DAY_OF_WEEK));
		//���� (�Ͽ��� (1) ������(4)
		//�츮���� ����(-1) 
		System.out.println("���� : ����:"+today.get(Calendar.AM_PM)); 
		//����: 0 , ���� : 1
		
		//�� , ��, ��  ���� ����ϼ���
		System.out.println(" �� :" + today.get(Calendar.HOUR));
		System.out.println(" �� :" + today.get(Calendar.MINUTE));
		System.out.println(" �� :" + today.get(Calendar.SECOND));
		
		
		//��� �ý��� ��¥
		//100���� ������ > ��¥>
		//�츮 ȸ�� : 2016��8��3��  ->2016/08/03
		//��¥ , ���� , ������ ���� �ϴ� ���� ������ ���̴�
		//�Լ��� ���� ó������(�� ������������ �Լ��� ȣ������)
		//class DeteUtill { public String today(return ��¥ ����) }
		//DateUtil d = new DateUtil();
//		 d.today(); > ��¥ ���
		//class DeteUtill { public static String today(return ��¥ ����) }
//	 	Date Util.today();
		
		Calendar date = Calendar.getInstance();
		System.out.println(Company_Date.DateStirng(date));
		System.out.println(Company_Date.DeteString(date, "/"));
		System.out.println(Company_Date.MonthFormat_DateString(date));
		
	}

}