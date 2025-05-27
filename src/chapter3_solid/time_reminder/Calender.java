package src.chapter3_solid.time_reminder;

import java.time.LocalDateTime;

public class Calender {

	public static final int HOUR_OF_DAY = 24;

	public static Calender getInstance() {
		return new Calender();
	}

	public int get(int hourOfDay) {
		return LocalDateTime.now().getHour();
	}
}
