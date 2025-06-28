package src.chapter13_abstract_factory_pattern.navigation;

public class BasicNavigationFactory implements NavigationFactory {
	@Override
	public GPS createGPS() {
		return new CheapGPS();
	}

	@Override
	public Map createMap() {
		return new SmallMap();
	}

	@Override
	public Screen createScreen() {
		return new SDScreen();
	}

	@Override
	public PathFinder createPathFinder() {
		return new SlowPathFinder();
	}
}
