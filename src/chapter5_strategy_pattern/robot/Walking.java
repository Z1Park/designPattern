package src.chapter5_strategy_pattern.robot;

public class Walking implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("walking");
	}
}
