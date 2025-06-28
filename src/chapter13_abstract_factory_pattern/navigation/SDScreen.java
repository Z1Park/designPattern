package src.chapter13_abstract_factory_pattern.navigation;

public class SDScreen implements Screen {
	@Override
	public void drawMap(final Map map) {
		System.out.printf("Draw map %s on SD screen%n", map.getClass().getName());
	}
}
