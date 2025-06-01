package src.chapter5_strategy_pattern.robot;

public class Fly implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("fly");
	}
}
