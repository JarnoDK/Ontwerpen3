package domein;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<>();


    public Menu(String name, String description) {
        super(name, description);
    }

    // toevoegen element
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    // verwijderen element
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    // opvragen menucomponent
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }


    
    public void print() {
    	// toevoegen header voor menus
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        
        // menucomponent heeft print, dus de lijst met menu items kan de print aanroepen voor elk element
        menuComponents.forEach(MenuComponent::print);
        

    }

    @Override
    public Iterator<MenuComponent> createIterator() {
    	// omvormen lijst naar iterator
        return menuComponents.iterator();
    }
}
