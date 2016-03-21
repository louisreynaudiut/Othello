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
	 * the current player
	 */
	private Player currentplayer;
	/**
	 * the game board 
	 */
	protected Gameboard gameboard;
	
	/**
	 * creates a new game of Othello ready to be played.
	 * (two players ready to play, with a gameboard in its starting configuration)
	 */
	public OthelloGame()
	{
		this.player1 = new Player("O"); 
		this.player2 = new Player("X");
		this.gameboard = new Gameboard();
		this.currentplayer = this.player1;
	}
	
	/**
	 * play the game 
	 * Game's algorithm :
	 * 
	 * while <game isn't over(each square of the board is filled with a player's disk)>
	 * 	<ask current player for a position to add a disks>
	 * 		if(<position is a possible movement>)
	 * 			<update board>
	 * 		change current player
	 * 
	 * 
	 * 
	 */
	public void play()
	{
		// TODO implement algorithm
		System.out.println("the game is ready to be played with the player"+this.player1+","+this.player2+"\n");
		System.out.println(gameboard.toString());
		while (gameboard.AvailableMovement()==true)
		{
			System.out.println("Please enter the x and y coordinates of the square you want to fill.\n");
				do
				{	
					System.out.println("You can't make this movement. Please try somewhere else. ");
				}
				while(gameboard.AvailableMovement()==false);
					
				/*<update board>*/
			
				if(this.currentplayer == this.player1)
					this.currentplayer = this.player2;
				else this.currentplayer = this.player1;
		}
	}
}
