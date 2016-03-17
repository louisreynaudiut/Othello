/**
 * Represents a game of Othello (also named as Reversi).
 * Othello's game: https://en.wikipedia.org/wiki/Reversi
 * @author reynloui/palmierb
 *
 */
public class OthelloGame 
{
	/**
	 * the light disks player. 
	 */
	private Player player1;

	/**
	 * the dark disks player. 
	 */
	private Player player2;
	
	/**
	 * the game board 
	 */
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
	
	// TODO detail algorithm (ask for advice)
	/**
	 * play the game 
	 * Game's algorithm :
	 * 
	 * while game isn't over(each square of the board is filled with a player's disk)
	 * {
	 * 		the player looks for possible adding of disks;
	 * 		if(disks add is possible)
	 *		 {
	 * 			the player adds a disk on the board;
	 * 			the player swaps the color of opponent bounded disks;
	 *		 }
	 * 		give the turn to the other player; 
	 * }
	 * The game return each player score and the winner
	 * 
	 */
	public void play()
	{
		System.out.println("La partie est prete a etre lancee.");
	}
}
