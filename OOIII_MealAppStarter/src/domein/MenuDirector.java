package domein;

public class MenuDirector {

	// bevat instance van menubuilder
	private MenuBuilder menuBuilder;

	// constructor met builder
	public MenuDirector(MenuBuilder menuBuilder) {
		this.menuBuilder = menuBuilder;
	}

	// roept de abstracte methodes aan voor het maken van een menu
	public void buildMenu() {
		menuBuilder.createMenu();
		menuBuilder.buildDrink();
		menuBuilder.buildMainCourse();
		menuBuilder.buildSide();
	}

	public Menu getMenu() {
		return menuBuilder.getMenu();
	}
}
