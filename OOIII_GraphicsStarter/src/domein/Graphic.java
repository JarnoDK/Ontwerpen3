package domein;

/**
 * Superklasse voor diagram, line, rectangle en text
 * @author jarno
 *
 */
public abstract class Graphic {

	// wordt ge�nstantieerd in sub klasse
	public abstract void draw();

	public void add(Graphic graphic) {
		throw new UnsupportedOperationException();
	}

	public void remove(Graphic graphic) {
		throw new UnsupportedOperationException();
	}

	public Graphic getChild(int index) {
		throw new UnsupportedOperationException();
	}
}
