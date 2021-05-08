package domein;

public class Persistence {
	// aanmaken van de factory + aanroepen correcte methode op basis van persistence factory type
    private PersistenceFactory persistenceFactory;
    public Persistence(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }
    public Reader newReader() {
        return persistenceFactory.createReader();
    }
    public Writer newWriter() {
        return persistenceFactory.createWriter();
    }
}
