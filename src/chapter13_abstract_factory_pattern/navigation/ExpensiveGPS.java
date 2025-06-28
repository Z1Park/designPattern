package src.chapter13_abstract_factory_pattern.navigation;

public class ExpensiveGPS implements GPS {
	@Override
	public Location findCurrentLocation() {
		System.out.println("Find current location with Expensive GPS");
		return null;
	}
}
