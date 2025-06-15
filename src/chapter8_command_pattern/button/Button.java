package src.chapter8_command_pattern.button;

public class Button {

	private Command command;

	public Button(final Command command) {
		this.command = command;
	}

	public void setCommand(final Command command) {
		this.command = command;
	}

	public void pressed() {
		command.execute();
	}
}
