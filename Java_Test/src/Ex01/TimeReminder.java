package Ex01;

import java.util.Calendar;

 class FakeTimeReminder implements TimeProvider{ //TimeProvider �׽�Ʈ ����
	private Calendar cal;
	
		
	public FakeTimeReminder(){
		cal = Calendar.getInstance();
	}
	
	public  FakeTimeReminder(int hours){
		cal = Calendar.getInstance();
		setHours(hours);
	}
	
	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours); //�־��� �ð����� ����
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY); //���� �ð� ��ȯ
	}
}

public class TimeReminder{
	TimeProvider tProv;
	
}