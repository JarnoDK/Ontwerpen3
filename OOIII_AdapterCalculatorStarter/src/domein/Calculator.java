package domein;

import calcLibrary.CalculatorLibrary;
import calcLibrary.TargetDouble;

/**
 * is een adapterklasse
 */
public class Calculator implements TargetLong {
	private TargetDouble calculator;

	public Calculator(long x, long y) {
		calculator = new CalculatorLibrary(x, y);
	}

	// Omzetten van double naar long 
	// calculator klasse add roept TargetDouble aan
	public Long add() {
		return (long)calculator.add();
	}
}
