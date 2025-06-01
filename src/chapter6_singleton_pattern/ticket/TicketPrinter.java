package src.chapter6_singleton_pattern.ticket;

public class TicketPrinter {

	private static final TicketPrinter INSTANCE = new TicketPrinter();

	private TicketPrinter() {
	}

	public TicketPrinter getInstance() {
		return INSTANCE;
	}

	public String printTicket() {
		return "ticket printed";
	}
}
