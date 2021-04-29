package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public abstract class Document 
{
	
	// Lijst met mogelijke pagina's voor elk document
	public List<Page> pages;

	// geïnstantieerd in sub klassen
	protected abstract List<Page> createPages();

	// pages een lege lijst maken
    public Document() {
		pages = new ArrayList<Page>();
	}
    
    public String print() {
    	pages = createPages(); // definieren van pages door subklassen
        return pages.stream()
                .map(Page::print)
                .collect(Collectors.joining("\n")); // print methode voor elke page oproepen
    }
}
