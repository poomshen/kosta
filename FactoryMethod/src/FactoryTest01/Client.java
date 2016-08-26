package FactoryTest01;

public class Client {
	public static void main(String[] args) {
		ElevatorManager emWithResponseTimeScheduler =
		new ElevatorManager(2) {
			@Override
			protected ElevatorScheduler getScheduler() {
				return null;
			}
		};
		emWithResponseTimeScheduler.requestElevator(20, Direction.UP);
		
		ElevatorManager emWithThroughputScheduler = new ElevatorManager(2) {
			@Override
			protected ElevatorScheduler getScheduler() {
				return null;
			}
		};
		emWithThroughputScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithDynamicScheduler = new ElevatorManager(2) {
			@Override
			protected ElevatorScheduler getScheduler() {
				return null;
			}
		};
		emWithDynamicScheduler.requestElevator(20, Direction.UP);
	}
				

}