import document.Document;
import document.PDFDocument;
import document.XMLDocument;

public class StartUp {

	public static void main(String[] args) {
		Document doc = new XMLDocument();
		doc.print();
		
		doc= new PDFDocument();
		doc.print();
	}

}
