package domein;

import java.util.Iterator;

public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {

    	// gebruikt een menucomponent om mogelijke menus te printen
    	// omvormen allmenus naar iterator
        Iterator<MenuComponent> iterator = new CompositeIterator(allMenus.createIterator());
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
             } catch (UnsupportedOperationException e) {
           }
        }
    }
}
