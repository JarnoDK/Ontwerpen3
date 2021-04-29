package domein;

public class StatisticsDocument implements Document {

	public void open() {
		System.out.println("Open Statistics document");
	}

	public void close() {
		System.out.println("Closing Statistics document");
	}
}
