package domein;

import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.tree.TreeNode;


/**
 * Adapter
 * @author jarno
 *
 */
//iterator roept enumeration functies aan

public class EnumerationIterator<T> implements Iterator<T> {

	private Enumeration<T> enumeration;

//	public EnumerationIterator(Enumeration<T> enumeration) {
//		this.enumeration = enumeration;
//	}

	public EnumerationIterator(Enumeration<T> enumeration) {
		// TODO Auto-generated constructor stub
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {

		return enumeration.hasMoreElements();
	}

	@Override
	public T next() {
		
		
		return enumeration.nextElement();
	} 

    
}
