package src.chapter12_factory_method_pattern.elevator;

import java.time.LocalDateTime;

public class SchedulerFactory {

	public static Scheduler getScheduler(final SchedulingStrategyType schedulingStrategyType) {
		return switch (schedulingStrategyType) {
			case RESPONSE_TIME -> new ResponseTimeScheduler();
			case THROUGHPUT -> new ThroughputScheduler();
			case DYNAMIC -> {
				final LocalDateTime now = LocalDateTime.now();
				if (now.getHour() < 12) {
					yield new ResponseTimeScheduler();
				} else {
					yield new ThroughputScheduler();
				}
			}
		};
	}
}
