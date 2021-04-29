package domein;

public class StatisticsApplication extends Application {

	// creërt het passende document voor de application
	public Document createDocument() {
		return new StatisticsDocument();
	}
}
