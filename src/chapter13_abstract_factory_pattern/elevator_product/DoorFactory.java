package src.chapter13_abstract_factory_pattern.elevator_product;

public class DoorFactory {

	public static Door createDoor(final VendorId vendorId) {
		return switch (vendorId) {
			case LG -> new LGDoor();
			case HYUNDAI -> new HyundaiDoor();
		};
	}
}
