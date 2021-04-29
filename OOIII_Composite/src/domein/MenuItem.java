package domein;

import java.util.Iterator;

public class MenuItem extends MenuComponent {


    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        super(name,description);

        this.vegetarian = vegetarian;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    // uitprinten van menuitem door MenuComponent#print
    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

    //aanroepen nulliterator, want geen lijst met menucomponent beschikbaar
    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
