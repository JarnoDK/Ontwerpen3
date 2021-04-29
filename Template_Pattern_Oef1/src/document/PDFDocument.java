package document;

//Extend document, document zal een methode (print) hebben voor het aanroepen van printheader, printbody en printfooter (stond niet in oef)
public class PDFDocument extends Document {

	@Override
	protected void printHeader() {
		System.out.println("Printing pdf header");
		
	}

	@Override
	protected void printBody() {
		System.out.println("Printing pdf body");
		
	}

	@Override
	protected void printFooter() {
		System.out.println("Printing pdf footer");
	}

}
