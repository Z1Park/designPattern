package src.chapter13_abstract_factory_pattern.navigation;

public class FastPathFinder implements PathFinder {

	@Override
	public Path findPath(final Location from, final Location to) {
		System.out.println("Fast Path Finder");
		return null;
	}
}
