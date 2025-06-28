package src.chapter13_abstract_factory_pattern.elevator_product;

public abstract class Door {

	private DoorStatus doorStatus;

	public Door() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}

	public void open() {
		if (doorStatus == DoorStatus.OPEN) {
			return;
		}
		doOpen();
		doorStatus = DoorStatus.OPEN;
	}

	public void close() {
		if (doorStatus == DoorStatus.CLOSED) {
			return;
		}
		doClose();
		doorStatus = DoorStatus.CLOSED;
	}

	protected abstract void doOpen();

	protected abstract void doClose();
}
