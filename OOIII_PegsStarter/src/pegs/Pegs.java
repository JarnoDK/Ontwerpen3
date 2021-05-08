package pegs;

import domein.IRoundPeg;
import domein.ISquarePeg;
import domein.PegAdapter;
import domein.RoundPeg;
import domein.SquarePeg;

/**
 * Adapter pattern
 * @author jarno
 *
 */
public class Pegs {

    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        
        ISquarePeg peg = new PegAdapter(roundPeg);
        peg.insert("test");
        peg.insert("inserting a square peg");

        
        IRoundPeg peg2 = new PegAdapter(squarePeg);
        peg2.insertIntoHole("inserting a round peg");
        //do nu een insertIntoHole met een squarepeg 

    }
}
