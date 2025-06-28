package src.chapter13_abstract_factory_pattern.elevator_product;

public interface ElevatorFactory {

	Motor createMotor();
	Door createDoor();
}
