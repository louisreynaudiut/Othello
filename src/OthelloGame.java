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
	public void play()
	{
		// TODO implement algorithm
		/**
		 * the current player
		 */
		Scanner scx = new Scanner(System.in);
		Scanner scy = new Scanner(System.in);
		Player currentplayer;
		currentplayer = this.player1;
		System.out.println("the game is ready to be played with the player "+this.player1.color+" and "+this.player2.color+"\n");
		System.out.println(gameboard.toString());
		while (gameboard.IsFull()==false)
		{
			System.out.println("Please enter the x and y coordinates of the square you want to fill.\n");
			System.out.println("x:");
			int x = scx.nextInt();
			
			System.out.println("y:");
			int y = scy.nextInt();
			
			Square pointedsquare = new Square(x,y);
			/*We use integers to find errors in the code.*/
			if(gameboard.isPossibleMovement(pointedsquare, currentplayer.color)==0)
			{
				gameboard.putADisk(pointedsquare, currentplayer.color);
				gameboard.swap(pointedsquare, currentplayer.color);
				System.out.println(gameboard.toString());
			}
			else
			{
				if(gameboard.isPossibleMovement(pointedsquare, currentplayer.color)==1)
					System.out.println("You can't make this movement(error 1). Please try somewhere else. ");
				if(gameboard.isPossibleMovement(pointedsquare, currentplayer.color)==2)
					System.out.println("You can't make this movement(error 2). Please try somewhere else. ");
				if(gameboard.isPossibleMovement(pointedsquare, currentplayer.color)==3)
					System.out.println("You can't make this movement(error 3). Please try somewhere else. ");
			}
			if(currentplayer==this.player1)
				currentplayer = this.player2;
			else
				currentplayer = this.player1;
		
		}
		scx.close();
		scy.close();
	}
}
