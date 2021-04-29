package domein;

public class DrawingDocument implements Document {

	// opent document
	public void open() {
		System.out.println("Open Drawing document");
	}

	//sluit document
	public void close() {
		System.out.println("Closing Drawing document");
	}
}
