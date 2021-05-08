package domein;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class CompositeIterator implements Iterator<AbstractFile> {

	private Deque<Iterator<AbstractFile>> stack = new ArrayDeque<>();
	
	public CompositeIterator(Iterator<AbstractFile> iterator) {
		stack.push(iterator);
	}

	// controleert of er nog een element op de lijst is
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		}
		Iterator<AbstractFile> iterator = stack.peek();
		if (!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		}
		return true;
	}
	
	// krijg het volgende element van de lijst
	@Override
	public AbstractFile next() {
		if (hasNext()) {
			Iterator<AbstractFile> iterator = stack.peek();
			AbstractFile component = iterator.next();
			if (component instanceof Directory) {
				stack.push(component.createIterator());
			}
			return component;
		}
		return null;
	}

}
