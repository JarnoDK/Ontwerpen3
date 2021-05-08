package domein;

// implementatie voor een specifieke factory en aanroepen correcte klasse
public class XMLPersistenceFactory implements PersistenceFactory {
    public Reader createReader() {
        return new XMLReader();
    }
    public Writer createWriter() {
        return new XMLWriter();
    }
}
