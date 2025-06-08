package src.chapter7_state_pattern.light;

public interface State {

	void onButtonPushed(final Light light);
	void offButtonPushed(final Light light);
}
