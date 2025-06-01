package src.chapter5_strategy_pattern.robot;

public class Atom extends Robot {

	public Atom(final String name, final AttackStrategy attackStrategy, final MovingStrategy movingStrategy) {
		super(name, attackStrategy, movingStrategy);
	}
}
