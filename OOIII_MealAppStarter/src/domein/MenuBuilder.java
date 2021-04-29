package domein;

public abstract class MenuBuilder {

	// bevat instantie van menu
	private Menu menu;

	// maak menu
	public void createMenu() {
		menu = new Menu();
	}

	// wordt uitgewerkt in sub klasse
	public abstract void buildDrink();

	// wordt uitgewerkt in sub klasse
	public abstract void buildMainCourse();

	// wordt uitgewerkt in sub klasse
	public abstract void buildSide();

	// retourneert menu
	public Menu getMenu() {
		return this.menu;
	}
}
