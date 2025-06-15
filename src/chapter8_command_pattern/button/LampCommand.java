package src.chapter8_command_pattern.button;

public class LampCommand implements Command {

	private final Lamp lamp;

	public LampCommand(final Lamp lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		lamp.turnOn();
	}
}
