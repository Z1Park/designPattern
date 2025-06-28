package src.chapter13_abstract_factory_pattern.navigation;

public class PreminumNavigationFactory implements NavigationFactory {
	@Override
	public GPS createGPS() {
		return new ExpensiveGPS();
	}

	@Override
	public Map createMap() {
		return new LargeMap();
	}

	@Override
	public Screen createScreen() {
		return new HDScreen();
	}

	@Override
	public PathFinder createPathFinder() {
		return new FastPathFinder();
	}
}
