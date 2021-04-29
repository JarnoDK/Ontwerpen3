package domein;

/**
 * eend omzetten naar kalkoen
 * @author jarno
 *
 */
//Implements duck <-- maak instantie van duck
public class TurkeyAdapter implements Duck {

	// Een variabele naar wat de methode moet worden omgezet
    private Turkey turkey;
    //turkey definiëren in constructor
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    // Duck#Quack == Turkey#Gobble
    // duck.quack() voert turkey.gobble() uit
    public void quack() {
        turkey.gobble();
    }

    // voert turkey.fly() uit (5 keer) 
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

}
