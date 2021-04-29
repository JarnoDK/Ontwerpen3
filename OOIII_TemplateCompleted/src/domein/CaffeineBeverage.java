package domein;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew(); 
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected final void boilWater() {
        System.out.println("Boiling water");
    }

    protected final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // wordt in subklasse geïnstantieerd (coffee)
    protected abstract void brew();

    // wordt in subklasse geïnstantieerd
protected abstract void addCondiments();

// true tenzij overschreven (coffeewithhook)
protected boolean customerWantsCondiments() { 
        return true;
    }
}
