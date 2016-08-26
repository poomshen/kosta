package FactoryTest01;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager{

	public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
		super(controllerCount);
	}

	@Override
	protected ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler =ElevatorScheduler.getInstance();
		return scheduler;
	}
	
}
