package src.chapter6_singleton_pattern.printer;

public class Printer {

	private static Printer INSTANCE;

	private Printer() {
	}

	public synchronized static Printer getPrinter() {
		if (INSTANCE == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}

	public void print(final Resource r) {
	}
}
