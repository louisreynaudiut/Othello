/**
 * Represent a game of Othello (also named as Reversi).
 * Othello's game: https://en.wikipedia.org/wiki/Reversi
 * @author reynloui
 *
 */
public class OthelloGame 
{

	private Player player1;
	private Player player2;
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
	/**
	 * start the game of Othello ready to be played. 
	 */
	public void start()
	{
		
		System.out.println("La partie est prête à être lancée.");
		/**
		 * The game start with the player 1.
		 */	
	}
}
