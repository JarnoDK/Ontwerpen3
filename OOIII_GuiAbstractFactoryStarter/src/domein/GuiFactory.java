package domein;

// maakt knop en label voor een factory
public interface GuiFactory {

	Component createButton();

	Component createLabel();
}
