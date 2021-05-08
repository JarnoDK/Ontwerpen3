package domein;

public class PegAdapter implements ISquarePeg, IRoundPeg {

	private IRoundPeg peg;
	private ISquarePeg squarepeg;

	/**
	 * Create adapter van square naar round
	 * 
	 * @param peg
	 */
	public PegAdapter(IRoundPeg peg) {
		this.peg = peg;
	}

	/**
	 * Create adapter van round naar square
	 * 
	 * @param peg
	 */
	public PegAdapter(ISquarePeg peg) {
		this.squarepeg = peg;
	}

	/**
	 * Omvormen Squarepeg#insert naar Roundpeg#insertIntoHole
	 * if voor controle of de juiste constructor is aangeroepen
	 */
	@Override
	public void insert(String mes) {
		if (peg != null)
			peg.insertIntoHole(mes);

	}

	/**
	 * Omvormen RoundPeg#insertIntoHole naar Squarepeg#insert
	 * if voor controle of de juiste constructor is aangeroepen
	 */
	@Override
	public void insertIntoHole(String mes) {
		if (squarepeg != null)
			squarepeg.insert(mes);

	}

}
