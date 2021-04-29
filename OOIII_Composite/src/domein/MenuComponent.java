package domein;

import java.util.Iterator;

public abstract class MenuComponent {
//compositie-methoden
	
    private String name;
    private String description;
    
    
    public MenuComponent(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    //operatie methoden gebruikt door MenuItem, sommigen ook door Menu
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public abstract void print();

    public abstract Iterator<MenuComponent> createIterator();
}
