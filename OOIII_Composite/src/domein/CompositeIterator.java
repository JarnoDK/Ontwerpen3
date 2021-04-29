package domein;

import java.util.*;
import java.util.Iterator;

public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }
    
    /**
     * controleert of een stack met menu components nog een element bevat
     * en retourneert het eerst volgende element
     */
    @Override
    public MenuComponent next() { 
        if (hasNext()) { 
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {     
        	return null;      
        }    
    }

    // controleert of er nog een element op de stack ligt
    @Override
    public boolean hasNext() {
        if (stack.empty()) { 
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) { 
                stack.pop();
                return hasNext();
            } else { 
                return true;
            }
        }
    }
}
