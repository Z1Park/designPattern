package src.chapter13_abstract_factory_pattern.elevator_product;

public class LGElevatorFactory implements ElevatorFactory {

	@Override
	public Motor createMotor() {
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}
}
