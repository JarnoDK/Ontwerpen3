package domein;

public class DrawingApplication extends Application {
	// creërt het passende document voor de application

	public Document createDocument() {
		return new DrawingDocument();
	}
}
