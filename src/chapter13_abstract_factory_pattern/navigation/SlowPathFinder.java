package src.chapter13_abstract_factory_pattern.navigation;

public class SlowPathFinder implements PathFinder {

	@Override
	public Path findPath(final Location from, final Location to) {
		System.out.println("Slow Path Finder");
		return null;
	}
}
