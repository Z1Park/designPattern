package src.chapter3_solid.time_reminder;

public class TimeReminderTest {

	void reminderTest() {
		final TimeReminder timeReminder = new TimeReminder(new StubCalender());
		timeReminder.reminder();
	}
}
