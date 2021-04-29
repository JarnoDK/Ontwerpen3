package domein;

import java.util.HashMap;
import java.util.Map;

// aanmaken van een applicatie per document 
public abstract class Application {

    private final Map<String, Document> documents = new HashMap<>();

    public void addNewDocument(String name) {
        
    	documents.put(name, createDocument());
    }

    public Document getDocument(String name) {
        return documents.get(name);
    }

    public Document removeDocument(String name) {
        return documents.remove(name);
    }

    // wordt gedefinieerd door een subklasse 
	protected abstract Document createDocument();
    
}
