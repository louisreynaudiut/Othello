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
	
	// TODO(done) detail algorithm (ask for advice)
	/**
	 * play the game 
	 * Game's algorithm :
	 * 
	 * while game isn't over(each square of the board is filled with a player's disk)
	 * {
	 * 		the game ask for a position to add a disks;
	 * 		if(position is a possible movement)
	 *		 {
	 * 			the game adds a player disk on the board;
	 * 			the game swaps the color of the player opponent bounded disks;
	 *		 }
	 * 		the game swap the turn to the other player; 
	 * }
	 * The game return each player score and the winner.
	 * 
	 */
	public void play()
	{
		System.out.println("the game is ready to be played with the player"+this.player1+","+this.player2+"on the board"+this.gameboard);
	}
}
