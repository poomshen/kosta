package FactoryTest01;

import java.util.Calendar;

public class SchedulerFactory {
	public static ElevatorScheduler getScheduler(ScheulingStrategyID strategyID){
		ElevatorScheduler scheduler = null;
		switch(strategyID){
		case PESPONSE_TIME:
			scheduler = ResponseTimeScheduler.getInstance();
		break;
		case THROUGHPUT :
			scheduler = ThroughputScheduler.getInstance();
		case DYNAMIC:
			int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			if(hour <12 )
			scheduler = ResponseTimeScheduler.getInstance();
			else 
				scheduler = ThroughputScheduler.getInstance();
			break;
		}
		return scheduler;
	}
}
