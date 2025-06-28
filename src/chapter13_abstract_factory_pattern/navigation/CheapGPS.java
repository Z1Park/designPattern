package src.chapter13_abstract_factory_pattern.navigation;

public class CheapGPS implements GPS {
	@Override
	public Location findCurrentLocation() {
		System.out.println("Find current location with Cheap GPS");
		return null;
	}
}
