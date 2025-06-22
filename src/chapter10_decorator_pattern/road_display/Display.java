package src.chapter10_decorator_pattern.road_display;

public abstract class Display {

	protected Display display;

	protected Display(final Display display) {
		this.display = display;
	}

	public abstract void draw();
}
