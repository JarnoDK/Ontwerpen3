package domein;

import java.util.Iterator;

// null iterator gebruikt voor een element dat geen lijst meer heeft. 
public class NullIterator implements Iterator<AbstractFile> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AbstractFile next() {
		// TODO Auto-generated method stub
		return null;
	}

}
