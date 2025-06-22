package src.chapter10_decorator_pattern.road_display;

public class Client {

	public static void main(String[] args) {
		final RoadDisplay roadDisplay = new RoadDisplay(null);
		final RoadDisplayWithLane roadDisplayWithLane = new RoadDisplayWithLane(roadDisplay);
		final RoadDisplayWithTraffic roadDisplayWithTraffic = new RoadDisplayWithTraffic(roadDisplayWithLane);

		roadDisplayWithTraffic.draw();
	}
}
