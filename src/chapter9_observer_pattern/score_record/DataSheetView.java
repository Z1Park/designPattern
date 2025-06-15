package src.chapter9_observer_pattern.score_record;

import java.util.List;

public class DataSheetView implements Observer {

	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(final ScoreRecord scoreRecord, final int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	public void update() {
		final List<Integer> scores = scoreRecord.getScores();
		for (int i = 0; i < Math.min(scores.size(), viewCount); i++) {
			System.out.println(scores.get(i));
		}
	}
}
