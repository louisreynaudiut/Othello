/**
 * Represent a game of Othello (also named as Reversi).
 * Othello's game: https://en.wikipedia.org/wiki/Reversi
 * @author reynloui
 *
 */
public class OthelloGame 
{
	// TODO write comment
	private Player player1;

	// TODO write comment
	private Player player2;
	
	// TODO write comment
	private Gameboard gameboard;
	
	/**
	 * creates a new game of Othello ready to be played.
	 * (two players ready to play, with a gameboard in its starting configuration)
	 */
	public OthelloGame()
	{
		this.player1 = new Player(1); 
		this.player2 = new Player(2);
		this.gameboard = new Gameboard();
	}
	
	// TODO rename this method (it is not just about starting the game)
	/**
	 * start the game of Othello ready to be played. 
	 */
	public void start()
	{
	
		// TODO fix encoding
		System.out.println("La partie est pr�te � �tre lanc�e.");
		/**
		 * The game start with the player 1.
		 */	
	}
}
