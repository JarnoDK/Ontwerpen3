package domein;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {

	private List<Menu> menus;

	// constructor voegt lijst met menus toe
	public Waitress(List<Menu> menulijst) {

		menus = menulijst;

	}
	

	//printen door middel van de create iterator 
	public void printMenu() {

		menus.forEach(men -> 
		{men.createIterator();
		 System.out.printf("\n" + men.getTitle() + "\n\n");
		 printMenu(men.createIterator());
		}
		);
	}

	// printen van iterator
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}