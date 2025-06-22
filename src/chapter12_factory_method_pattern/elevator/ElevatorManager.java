package src.chapter12_factory_method_pattern.elevator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

public class ElevatorManager {

	private List<ElevatorController> controllers;

	public ElevatorManager(final int controllerCount) {
		controllers = IntStream.range(0, controllerCount)
			.mapToObj(ElevatorController::new)
			.toList();
	}

	public void requestElevator(int destination) {
		final LocalDateTime now = LocalDateTime.now();

		final Scheduler scheduler;
		if (now.getHour() < 12) {
			scheduler = new ThroughputScheduler();
		} else {
			scheduler = new ResponseTimeScheduler();
		}
		final int elevator = scheduler.selectElevator(destination);
		controllers.get(elevator).gotoFloor(destination);
	}
}
