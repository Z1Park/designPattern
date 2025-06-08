package src.chapter7_state_pattern.light;

public class Light {

	private State state;

	public Light() {
		state = new Off();
	}

	public void onButtonPushed() {
		state.onButtonPushed(this);
	}

	public void offButtonPushed() {
		state.offButtonPushed(this);
	}

	public void changeState(final State state) {
		this.state = state;
	}
}
