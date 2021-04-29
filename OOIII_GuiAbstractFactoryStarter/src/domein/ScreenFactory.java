package domein;

public class ScreenFactory {

	// maakt scherm op
	public static Screen createScreen(String type) {

		return switch (type.toLowerCase()) {
		case "win" -> new Screen(new WinFactory());
		case "mac" -> new Screen(new MacFactory());
		default -> null;
		};
	}
	
}
