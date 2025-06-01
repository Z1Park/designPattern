package src.chapter5_strategy_pattern.robot;

public abstract class Robot {

	private String name;
	private AttackStrategy attackStrategy;
	private MovingStrategy movingStrategy;

	protected Robot(final String name,
					final AttackStrategy attackStrategy,
					final MovingStrategy movingStrategy) {
		this.name = name;
		this.attackStrategy = attackStrategy;
		this.movingStrategy = movingStrategy;
	}

	protected final String getName() {
		return name;
	}

	public final void attack() {
		attackStrategy.attack();
	}

	public final void move() {
		movingStrategy.move();
	}
}
