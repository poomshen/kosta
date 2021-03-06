package Ex01;

import java.util.Calendar;

 class FakeTimeReminder implements TimeProvider{ //TimeProvider 테스트 스텁
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
		cal.set(Calendar.HOUR_OF_DAY, hours); //주어진 시간으로 설정
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY); //현제 시간 변환
	}
}

public class TimeReminder{
	TimeProvider tProv;
	
}