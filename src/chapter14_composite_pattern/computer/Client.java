package src.chapter14_composite_pattern.computer;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		final Body body = new Body(100, 70);
		final Monitor monitor = new Monitor(20, 30);
		final Keyboard keyboard = new Keyboard(5, 2);
		final Speaker speaker = new Speaker(10, 10);

		final Computer computer = new Computer(List.of(body, monitor, keyboard, speaker));

		final int power = computer.getPower();
		final int price = computer.getPrice();
		System.out.println("power = " + power);
		System.out.println("price = " + price);
	}
}
