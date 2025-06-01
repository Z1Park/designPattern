package src.chapter5_strategy_pattern.robot;

public class Punch implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("punch attack");
	}
}
