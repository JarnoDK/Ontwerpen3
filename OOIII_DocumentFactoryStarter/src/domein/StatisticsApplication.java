package domein;

public class StatisticsApplication extends Application {

	// cre�rt het passende document voor de application
	public Document createDocument() {
		return new StatisticsDocument();
	}
}
