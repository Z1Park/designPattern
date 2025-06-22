package src.chapter10_decorator_pattern.road_display;

public class RoadDisplayWithTraffic extends Display {

	public RoadDisplayWithTraffic(final Display display) {
		super(display);
	}

	@Override
	public void draw() {
		System.out.println("도로 교통량 표시");
		if (display != null) {
			display.draw();
		}
	}
}
