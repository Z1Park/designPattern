package src.chapter6_singleton_pattern.printer;

public class Client {

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			final Thread thread = new Thread(() -> {
				final Printer printer = Printer.getPrinter();
				System.out.println("printer = " + printer);
			});
			thread.start();
		}
	}
}
