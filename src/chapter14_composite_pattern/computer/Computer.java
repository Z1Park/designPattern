package src.chapter14_composite_pattern.computer;

import java.util.List;

public class Computer implements ComputerDevice {

	private List<ComputerDevice> computerDevices;

	public Computer(final List<ComputerDevice> computerDevices) {
		this.computerDevices = computerDevices;
	}

	public int getPrice() {
		return computerDevices.stream()
			.mapToInt(ComputerDevice::getPrice)
			.sum();
	}

	public int getPower() {
		return computerDevices.stream()
			.mapToInt(ComputerDevice::getPower)
			.sum();
	}
}
