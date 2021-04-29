package domein;

import java.util.*;

public class Screen {

	// bevat een lijst met componenten
	private List<Component> componenten;
	private GuiFactory guifactory;
	
	// geef weer of er gebruik wordt gemaakt van windows of mac factory
    public Screen(GuiFactory guifac) {
        this.guifactory = guifac;
        componenten = new ArrayList<Component>();
    }

    public void addButton() {
        // afhankelijk van guifactory bepaalt of er gebruik wordt gemaakt van windows of mac button
    	componenten.add(guifactory.createButton());
    }

    public void addLabel() {
        // afhankelijk van guifactory bepaalt of er gebruik wordt gemaakt van windows of mac label

    	componenten.add(guifactory.createLabel());
    }

    // toont voor elk element welk component het is 
    public void viewComponents() {
        componenten.forEach(s -> s.show());
    }


}
