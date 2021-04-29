package domein;

import java.util.ArrayList;
import java.util.List;

// maakt iterator voor over de lijst met menu items te gaan
public class PancakeIterator implements Iterator {

	private int position = 0;
	private List<MenuItem> menuitems;
	
	public PancakeIterator(ArrayList<MenuItem> menuItems) {
		this.menuitems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return position < menuitems.size();
	}

	@Override
	public Object next() {
		return menuitems.get(position++);
	}
	

	

}
