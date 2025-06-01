package src.chapter5_strategy_pattern.muhayu_example;

public class AnalyzerV3 implements Analyzer {

	@Override
	public boolean isSupport(final Version version) {
		return version == Version.V3;
	}

//	@Override
//	public Version getVersion() {
//		return Version.V3;
//	}

	@Override
	public void analyze() {
		// V3 분석
	}
}
