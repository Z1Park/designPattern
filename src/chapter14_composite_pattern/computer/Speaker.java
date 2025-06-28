package src.chapter14_composite_pattern.computer;

public class Speaker implements ComputerDevice {

	private int price;
	private int power;

	public Speaker(final int price, final int power) {
		this.price = price;
		this.power = power;
	}

	public int getPrice() {
		return price;
	}

	public int getPower() {
		return power;
	}
}
