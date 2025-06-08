package src.chapter7_state_pattern.light;

public class On implements State {

	@Override
	public void onButtonPushed(final Light light) {
		// do nothing
	}

	@Override
	public void offButtonPushed(final Light light) {
		light.changeState(new Off());
	}
}
