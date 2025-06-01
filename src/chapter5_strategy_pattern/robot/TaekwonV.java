package src.chapter5_strategy_pattern.robot;

public class TaekwonV extends Robot {

	public TaekwonV(final String name, final AttackStrategy attackStrategy, final MovingStrategy movingStrategy) {
		super(name, attackStrategy, movingStrategy);
	}
}
