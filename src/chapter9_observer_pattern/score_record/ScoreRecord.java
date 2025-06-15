package src.chapter9_observer_pattern.score_record;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {

	private List<Integer> scores = new ArrayList<>();
	private List<Observer> observers = new ArrayList<>();

	public List<Integer> getScores() {
		return List.copyOf(scores);
	}

	public void attach(final Observer observer) {
		observers.add(observer);
	}

	public void detach(final Observer observer) {
		observers.remove(observer);
	}

	public void addScore(final int score) {
		scores.add(score);
		for (final Observer observer : observers) {
			observer.update();
		}
	}
}
