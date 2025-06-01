package src.chapter5_strategy_pattern.muhayu_example;

public interface Analyzer {

	boolean isSupport(final Version version);
//	Version getVersion();

	void analyze();
}
