package src.chapter8_command_pattern.button;

public class AlarmCommand implements Command {

	private final Alarm alarm;

	public AlarmCommand(final Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public void execute() {
		alarm.start();
	}
}
