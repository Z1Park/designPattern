package src.chpater11_template_method_pattern.motor;

public class HyundaiMotor extends Motor {

	public HyundaiMotor(final Door door) {
		super(door);
	}

	@Override
	protected void moveMotor() {
		// move motor
	}
}
