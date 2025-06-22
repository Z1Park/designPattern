package src.chapter10_decorator_pattern.road_display;

public class RoadDisplayWithLane extends Display {

	public RoadDisplayWithLane(final Display display) {
		super(display);
	}

	@Override
	public void draw() {
		System.out.println("도로 차선 표시");
		if (display != null) {
			display.draw();
		}
	}
}
