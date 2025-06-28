package src.chapter13_abstract_factory_pattern.elevator_product;

public class Client {

	public static void main(String[] args) {
		final ElevatorFactory factory = new LGElevatorFactory();

		final Door door = factory.createDoor();
		final Motor motor = factory.createMotor();
		motor.setDoor(door);

		door.open();
		motor.move();
	}
}
