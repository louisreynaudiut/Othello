import java.util.Scanner;


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
	protected Gameboard gameboard;
	
	/**
	 * creates a new game of Othello ready to be played.
	 * (two players ready to play, with a gameboard in its starting configuration)
	 */
	public OthelloGame()
	{
		this.player1 = new Player(Color.LD); 
		this.player2 = new Player(Color.DD);
		this.gameboard = new Gameboard();
	}
	
	/**
	 * play the game 
	 * Game's algorithm :
	 * 
	 * while <game isn't over(each square of the board is filled with a player's disk)>
	 * 	<ask current player for a position to add a disks>
	 * 		if(<position is a possible movement>)
	 * 			<update board>
	 * 			<change current player>
	 * 
	 * 
	 * 
	 */
	public void play() throws Exception
	{
		// TODO implement algorithm
		/**
		 * the current player
		 */
		Scanner sc = new Scanner(System.in);
		Player currentplayer;
		currentplayer = this.player1;
		System.out.println("the game is ready to be played with the player "+this.player1.color+" and "+this.player2.color+"\n");
		System.out.println(gameboard.toString());
		Square pointedsquare = new Square();
		while (gameboard.isFull()==false)
		{
			System.out.println("this is player "+currentplayer.color.content+" turn.");
			if(gameboard.playerHasMovementAvailable(currentplayer.color)== true)
			{
				boolean played=false;
				while(played == false)
				{
					pointedsquare.modifySquare(sc);
					try
					{
						gameboard.isPossibleMovement(pointedsquare, currentplayer.color);
						gameboard.putADisk(pointedsquare, currentplayer.color);
						gameboard.swap(pointedsquare, currentplayer.color);
						System.out.println(gameboard.toString());
						played = true;
					}
					catch (NotInTheBoardException a)
					{
						System.err.println("The entry isn't in the board. Please enter an int between 1 and 8.");
					}
					catch (NotAnEmptySquareChosenException b)
					{
						System.err.println("The square chosen already has a disk. Please choose an empty one.");
					}
					catch (NoMovementAvailableException c)
					{
						System.err.println("No movement possible from this Square. Please try another one.");
					}
				}
				
			}
		
			else
			{
			System.out.println("No movement available for this player. The hand goes to the other player.");
			}
			
			if(currentplayer==this.player1)
				currentplayer = this.player2;
			else
				currentplayer = this.player1;
		}
		sc.close();
	}
	
}

