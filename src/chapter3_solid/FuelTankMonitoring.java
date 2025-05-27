package src.chapter3_solid;

public class FuelTankMonitoring {

	private final FuelTankChecker fuelTankChecker;
	private final SignalTransmitter signalTransmitter;

	public FuelTankMonitoring(final FuelTankChecker fuelTankChecker, final SignalTransmitter signalTransmitter) {
		this.fuelTankChecker = fuelTankChecker;
		this.signalTransmitter = signalTransmitter;
	}

	public void checkAndWarn() {
		// ...

		if (fuelTankChecker.checkFuelTank()) {
			signalTransmitter.giveWarningSignal();
		}
	}
}
