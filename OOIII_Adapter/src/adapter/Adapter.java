package adapter;

import domein.Duck;
import domein.MallardDuck;
import domein.TurkeyAdapter;
import domein.WildTurkey;

public class Adapter {

    public static void main(String[] args) {
    	// gewone eend
        MallardDuck duck = new MallardDuck();
        testDuck(duck);

        // definiëren van een turkey
        WildTurkey turkey = new WildTurkey();
        // turkey omzetten "naar duck"
        Duck turkeyAdapter
                = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
