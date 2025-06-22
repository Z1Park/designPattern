package src.chpater11_template_method_pattern.motor;

public class Door {

	private DoorStatus doorStatus;

	public Door() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}

	public void close() {
		doorStatus = DoorStatus.CLOSED;
	}
}
