package FactoryTest02;

public abstract class Motor {
	private MotorStatus motorStatus;
	public Motor(){
		motorStatus = motorStatus.STOPPED;
	}
	
	public MotorStatus getMotorStatus(){
		return motorStatus;
	}
	
	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction){
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == motorStatus.MOVING)return;
		moveMotor(direction);
		setMotorStatus(motorStatus.MOVING);
	}
	protected abstract void moveMotor(Direction direction);
	
	private void stop() {
		motorStatus = motorStatus.STOPPED;
	}
}
