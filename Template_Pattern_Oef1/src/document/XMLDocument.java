package document;

//Extend document, document zal een methode (print) hebben voor het aanroepen van printheader, printbody en printfooter
public class XMLDocument extends Document {

	@Override
	protected void printHeader() {
		System.out.println("Printing XML Header");
	}

	@Override
	protected void printBody() {
		System.out.println("Printing XML Body");
	}

	@Override
	protected void printFooter() {
		System.out.println("Printing XML Footer");
	}

}
