package domein;

public class DrawingApplication extends Application {
	// cre�rt het passende document voor de application

	public Document createDocument() {
		return new DrawingDocument();
	}
}
