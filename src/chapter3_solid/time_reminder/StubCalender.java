package src.chapter3_solid.time_reminder;

public class StubCalender extends Calender {

	@Override
	public int get(final int hourOfDay) {
		return 22;
	}
}
