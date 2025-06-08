package src.chapter7_state_pattern.light;

public class Off implements State {

	@Override
	public void onButtonPushed(final Light light) {
		light.changeState(new On());
	}

	@Override
	public void offButtonPushed(final Light light) {
		// do nothing
	}
}
