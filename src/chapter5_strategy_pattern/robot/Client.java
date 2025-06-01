package src.chapter5_strategy_pattern.robot;

public class Client {

	public static void main(String[] args) {
		final Robot taekwonV = new TaekwonV("TaekwonV", new Missile(), new Walking());
		taekwonV.attack();
		taekwonV.move();

		final Robot atom = new Atom("Atom", new Punch(), new Fly());
		atom.attack();
		atom.move();
	}
}