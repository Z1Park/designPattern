package src.chapter13_abstract_factory_pattern.navigation;

public interface PathFinder {

	Path findPath(final Location from, final Location to);
}
