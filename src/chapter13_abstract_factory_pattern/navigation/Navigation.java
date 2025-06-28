package src.chapter13_abstract_factory_pattern.navigation;

public class Navigation {

	private GPS gps;
	private Map map;
	private Screen screen;
	private PathFinder pathFinder;

	public Navigation(final GPS gps, final Map map, final Screen screen, final PathFinder pathFinder) {
		this.gps = gps;
		this.map = map;
		this.screen = screen;
		this.pathFinder = pathFinder;
	}

	public void showMap() {
		screen.drawMap(map);
	}

	public void navigate(final Location destination) {
		final Location currentLocation = gps.findCurrentLocation();
		pathFinder.findPath(currentLocation, destination);
	}
}
