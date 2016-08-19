package FactoryTest01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
//	private ThroughputScheduler scheduler;
	
	//주어진 수 만큼의 ElevatorController를 생성함
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for(int i = 0; i< controllerCount ; i++){
			ElevatorController controller = new ElevatorController(i+1);
			controllers.add(controller);
		}
//		scheduler = new ThroughputScheduler();
	}
						//층을 받고 
	void requestElevator(int destination , Direction direction){
		ElevatorScheduler scheduler;
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour < 12)//오전에는  ResponsTimeScheduler를 이용함
		scheduler = new ResponseTimeScheduler();
		else// 오후에는  ThroughputSheduler를 이용함
		scheduler = new ThroughputSheduler();
		
		//ThroughputScheduler를 이용해 럴리베이터를 선택함
		int selectedElevator = scheduler.selectElevator(this, destination,direction);
		controllers.get(selectedElevator).gotofloor(destination);
		
		//선택된 엘리베이터을 이동시킴
	}
	
}
