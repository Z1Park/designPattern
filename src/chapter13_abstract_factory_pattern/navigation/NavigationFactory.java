package src.chapter13_abstract_factory_pattern.navigation;

public interface NavigationFactory {

	GPS createGPS();

	Map createMap();

	Screen createScreen();

	PathFinder createPathFinder();
}
