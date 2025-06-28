package src.chapter11_template_method_pattern.motor;

public class LGMotor extends Motor {

	public LGMotor(final Door door) {
		super(door);
	}

	@Override
	protected void moveMotor() {
		// move motor
	}
}
