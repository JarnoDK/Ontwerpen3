package domein;

// extend menubuilder om subklasse van menu te maken en definieer de verschillende abstracte methoden van menu
public class JapaneseMenuBuilder extends MenuBuilder {

	public void buildDrink() {
		getMenu().setDrink("Sake");
	}

	public void buildMainCourse() {
		getMenu().setMainCourse("Sushi");
	}

	public void buildSide() {
		getMenu().setSide("Miso soup");
	}
}
