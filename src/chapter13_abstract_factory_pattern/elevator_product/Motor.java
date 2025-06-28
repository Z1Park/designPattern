package src.chapter13_abstract_factory_pattern.elevator_product;

public abstract class Motor {

	private MotorStatus motorStatus;
	private Door door;

	public Motor() {
		motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	public void setDoor(final Door door) {
		this.door = door;
	}

	public void move() {
		door.close();
		motorStatus = MotorStatus.MOVING;
		moveMotor();
	}

	private void setMotorStatus(final MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	protected abstract void moveMotor();
}
