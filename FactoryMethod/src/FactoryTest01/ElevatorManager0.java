package FactoryTest01;

import java.util.ArrayList;
import java.util.List;
// ó�� ���������� ����
public class ElevatorManager0 {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	//�־��� �� ��ũ�� ElevatorController�� ������
	public ElevatorManager0(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for(int i = 0; i< controllerCount ; i++){
			ElevatorController controller = new ElevatorController(1);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler();
	}
						//���� �ް� 
	void requestElevator(int destination , Direction direction){
		//ThroughputScheduler�� �̿��� ���������͸� ������
//		int selectedElevator = scheduler.selectElevator(this, destination,direction);
		
		//���õ� ������������ �̵���Ŵ
//		controllers.get(selectedElevator).gotofloor(destination);
	}
	
}
