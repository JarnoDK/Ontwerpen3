package mealapp;

import domein.ItalianMenuBuilder;
import domein.JapaneseMenuBuilder;
import domein.Menu;
import domein.MenuBuilder;
import domein.MenuDirector;

public class MealApp {

   public static void main(String[] args) {
      new MealApp();
   }
   
   public MealApp() {
       
        //TODO
	   
        System.out.printf("menu is: %s%n", maakMenu(new ItalianMenuBuilder()));
        
        System.out.printf("menu is: %s%n", maakMenu(new JapaneseMenuBuilder()));
    }
   
   private Menu maakMenu(MenuBuilder builder) {
	   MenuDirector menudirector = new MenuDirector(builder);
	   menudirector.buildMenu();
	   return menudirector.getMenu();
   }

   
}
