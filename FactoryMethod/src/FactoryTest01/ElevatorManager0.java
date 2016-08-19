package FactoryTest01;

import java.util.ArrayList;
import java.util.List;
// 처음 엘리베이터 설정
public class ElevatorManager0 {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	//주어진 수 만크의 ElevatorController를 생성함
	public ElevatorManager0(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for(int i = 0; i< controllerCount ; i++){
			ElevatorController controller = new ElevatorController(1);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler();
	}
						//층을 받고 
	void requestElevator(int destination , Direction direction){
		//ThroughputScheduler를 이용해 럴리베이터를 선택함
//		int selectedElevator = scheduler.selectElevator(this, destination,direction);
		
		//선택된 엘리베이터을 이동시킴
//		controllers.get(selectedElevator).gotofloor(destination);
	}
	
}
