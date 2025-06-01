package src.chapter5_strategy_pattern.muhayu_example;

public class AnalyzerV2 implements Analyzer {

	@Override
	public boolean isSupport(final Version version) {
		return version == Version.V2;
	}

//	@Override
//	public Version getVersion() {
//		return Version.V2;
//	}

	@Override
	public void analyze() {
		// V2 분석
	}
}
