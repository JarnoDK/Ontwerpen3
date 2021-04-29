package domein;

import java.util.Iterator;
// Maakt de methodes createiterator en gettitle , Menu#createIterator en Menu#getTitle kunnen worden aangeropen
public interface Menu {

	public Iterator<MenuItem> createIterator();
	public String getTitle();
}
