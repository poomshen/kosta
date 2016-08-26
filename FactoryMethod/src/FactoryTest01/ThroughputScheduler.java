package FactoryTest01;

public class ThroughputScheduler implements ElevatorScheduler {
	private static ElevatorScheduler scheduler;
	public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
		return 0; //임의로 선택함
	}

	public static ElevatorScheduler getInstance() {
		if(scheduler == null)
			scheduler = new ThroughputScheduler();
		return scheduler;
	}

}
