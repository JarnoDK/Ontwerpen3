package domein;

import java.util.Enumeration;
import java.util.Iterator;

// enumeration roept iterator functies aan
public class IteratorEnumeration<T> implements Enumeration<T> {

	private Iterator<T> iterator;
	public IteratorEnumeration(Iterator<T> iterator) {
		this.iterator = iterator;
	}
	
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		
		return this.iterator.hasNext();
	}

	@Override
	public T nextElement() {
		// TODO Auto-generated method stub
		return iterator.next();
	}

    
   
}
