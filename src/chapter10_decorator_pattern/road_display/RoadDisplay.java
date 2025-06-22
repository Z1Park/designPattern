package src.chapter10_decorator_pattern.road_display;

public class RoadDisplay extends Display {

	public RoadDisplay(final Display display) {
		super(display);
	}

	public void draw() {
		System.out.println("기본 도로 표시");
		if (display != null) {
			display.draw();
		}
	}
}
