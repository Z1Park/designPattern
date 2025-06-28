package src.chapter13_abstract_factory_pattern.elevator_product;

public class MotorFactory {

	public static Motor createMotor(final VendorId vendorId) {
		return switch (vendorId) {
			case LG -> new LGMotor();
			case HYUNDAI -> new HyundaiMotor();
		};
	}
}
