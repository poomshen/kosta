package FactoryTest01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
//	private ThroughputScheduler scheduler;
	
	//�־��� �� ��ŭ�� ElevatorController�� ������
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for(int i = 0; i< controllerCount ; i++){
			ElevatorController controller = new ElevatorController(i+1);
			controllers.add(controller);
		}
//		scheduler = new ThroughputScheduler();
	}
						//���� �ް� 
	void requestElevator(int destination , Direction direction){
		ElevatorScheduler scheduler;
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour < 12)//��������  ResponsTimeScheduler�� �̿���
		scheduler = new ResponseTimeScheduler();
		else// ���Ŀ���  ThroughputSheduler�� �̿���
		scheduler = new ThroughputSheduler();
		
		//ThroughputScheduler�� �̿��� ���������͸� ������
		int selectedElevator = scheduler.selectElevator(this, destination,direction);
		controllers.get(selectedElevator).gotofloor(destination);
		
		//���õ� ������������ �̵���Ŵ
	}
	
}
