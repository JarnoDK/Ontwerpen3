package domein;

//Template (stappen)
public abstract class Game {

	private int playerCount;

	// start een spel op basis van het aantal spelers
	public final void playOneGame(int playersCount) {
		// zet aantal spelers
		setPlayerCount(playersCount);
		// maakt spel
		initializeGame();
		// maakt een loop dat zolang het niet het einde van het spel is 
		int player = -1;
		while(!endOfGame()) {
			player = (player +1) % playersCount;
			makePlay(player);
		}
		printWinner(player);
	}

	// initializatie voo game
	protected abstract void initializeGame();

	// speel een spel
	protected abstract void makePlay(int player);

	// controleer of spel is geëindigd
	protected abstract boolean endOfGame();

	// print de speler dat won
	protected abstract void printWinner(int player);

	protected final int getPlayerCount() {
		return this.playerCount;
	}

	protected final void setPlayerCount(int amount) {
		this.playerCount = amount;
	}
}
