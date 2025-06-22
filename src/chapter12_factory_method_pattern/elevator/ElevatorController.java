package src.chapter12_factory_method_pattern.elevator;

public class ElevatorController {

	private int id;
	private int currentFloor;

	public ElevatorController(final int id) {
		this.id = id;
		this.currentFloor = 1;
	}

	public void gotoFloor(int destination) {
		// goto floor
	}
}
