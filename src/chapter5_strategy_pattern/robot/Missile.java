package src.chapter5_strategy_pattern.robot;

public class Missile implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("missile attack");
	}
}
