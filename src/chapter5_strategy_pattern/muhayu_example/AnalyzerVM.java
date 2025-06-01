package src.chapter5_strategy_pattern.muhayu_example;

public class AnalyzerVM implements Analyzer {

	@Override
	public boolean isSupport(final Version version) {
		return version == Version.VM;
	}

//	@Override
//	public Version getVersion() {
//		return Version.VM;
//	}

	@Override
	public void analyze() {
		// VM 분석
	}
}
