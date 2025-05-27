package src.chapter3_solid.time_reminder;

public class TimeReminder {

	private MP3 m;
	private Calender cal;

	public TimeReminder(final Calender cal) {
		this.cal = cal;
	}

	public void reminder() {
		m = new MP3();
		final int hour = cal.get(Calender.HOUR_OF_DAY);

		if (hour >= 22) {
			m.playSong();
		}
	}
}
