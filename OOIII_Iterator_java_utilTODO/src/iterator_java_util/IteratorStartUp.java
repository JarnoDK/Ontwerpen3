package iterator_java_util;

import java.util.Arrays;

import domein.CafeMenu;
import domein.DinerMenu;
import domein.Menu;
import domein.PancakeHouseMenu;
import domein.Waitress;

public class IteratorStartUp {
	public static void main(String args[]) {

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Menu cafMenu = new CafeMenu();

		Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu,cafMenu));

		waitress.printMenu();

	}
}
