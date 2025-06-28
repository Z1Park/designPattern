package src.chapter13_abstract_factory_pattern.elevator_product;

public class HyundaiElevatorFactory implements ElevatorFactory {

	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}
}
