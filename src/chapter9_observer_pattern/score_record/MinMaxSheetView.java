package src.chapter9_observer_pattern.score_record;

import java.util.List;

public class MinMaxSheetView implements Observer {

	private ScoreRecord scoreRecord;

	public MinMaxSheetView(final ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() {
		final List<Integer> scores = scoreRecord.getScores();
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < scores.size(); i++) {
			min = Math.min(min, scores.get(i));
			max = Math.max(max, scores.get(i));
		}
		System.out.println(min + " " + max);
	}
}
