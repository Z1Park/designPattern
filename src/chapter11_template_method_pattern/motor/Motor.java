package src.chapter11_template_method_pattern.motor;

public abstract class Motor {

	protected Door door;
	private MotorStatus motorStatus;

	public Motor(final Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	public void setMotorStatus(final MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	public void move() {
		if (getMotorStatus() == MotorStatus.MOVING) {
			return;
		}

		if (door.getDoorStatus() == DoorStatus.CLOSED) {
			door.close();
		}

		moveMotor();
		setMotorStatus(MotorStatus.MOVING);
	}

	protected abstract void moveMotor();
}
