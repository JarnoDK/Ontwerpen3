package domein;
//extend menubuilder om subklasse van menu te maken en definieer de verschillende abstracte methoden van menu

public class ItalianMenuBuilder extends MenuBuilder {

	public void buildDrink() {
		getMenu().setDrink("Red Wine");
	}

	public void buildMainCourse() {
		getMenu().setMainCourse("Pizza margherita");
	}

	public void buildSide() {
		getMenu().setSide("Bread");
	}
}
