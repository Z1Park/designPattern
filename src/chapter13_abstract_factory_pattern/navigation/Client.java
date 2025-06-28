package src.chapter13_abstract_factory_pattern.navigation;

public class Client {

	public static void main(String[] args) {
		final Model model = Model.BASIC;
		final NavigationFactory navigationFactory = switch (model) {
			case BASIC -> new BasicNavigationFactory();
			case PREMIUM -> new PreminumNavigationFactory();
		};

		final Navigation navigation = new Navigation(
			navigationFactory.createGPS(),
			navigationFactory.createMap(),
			navigationFactory.createScreen(),
			navigationFactory.createPathFinder()
		);
		navigation.showMap();
		final Location destination = new Location();
		navigation.navigate(destination);
	}
}
