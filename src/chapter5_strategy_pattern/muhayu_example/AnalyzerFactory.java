package src.chapter5_strategy_pattern.muhayu_example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@RequiredArgsConstructor
public class AnalyzerFactory {

	private List<Analyzer> analyzers;
//	private Map<Version, Analyzer> analyzers;

	public AnalyzerFactory(final List<Analyzer> analyzers) {
		this.analyzers = analyzers;
//		this.analyzers = analyzers.stream()
//			.collect(Collectors.toMap(
//				analyzer -> analyzer.getVersion(),
//				analyzer -> analyzer
//			));
	}

	public Analyzer getAnalyzer(final Version version) {
		return analyzers.stream()
			.filter(analyzer -> analyzer.isSupport(version))
			.findFirst()
			.orElseThrow(() -> new RuntimeException("버전 없음"));
//		return analyzers.get(version);
	}
}
