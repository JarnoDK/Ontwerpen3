package document;

public abstract class Document {

	public final void print() {
		
		printHeader();
		printBody();
		printFooter();
	}

	//Uitgeschreven in sub-klasse, verplichte methode in subklasse door abstract
	protected abstract void printHeader();
	
	//Uitgeschreven in sub-klasse, verplichte methode in subklasse door abstract
	protected abstract void printBody();
	
	//Uitgeschreven in sub-klasse, verplichte methode in subklasse door abstract
	protected abstract void printFooter();
}
