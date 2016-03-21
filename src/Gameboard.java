/**
 * Represents an Othello gameboard.
 * @author reynloui/palmierb
 *
 */
public class Gameboard {
	
	/**
	 * the maximum number of lines and columns in the board. 
	 */
	private final static int BOARD_LINE_COLUMN_GEOLOCATION_STANDARD = 8;
		
	/**
	 * a Othello board. Each table value represents a square of the board.
	 */
	private Insquare[][] boardtable;
	/**
	 * a x position for a given square.
	 */
	private int squarex;
	
	/**
	 * a x position for a given square.
	 */
	private int squarey;
	
	/**
	 * Creates a new gameboard , in its starting configuration (a 8*8 square table 
	 * which each square is initialized empty except the four middle squares, 2 black and two light). 
	 */
	public Gameboard()
	{
		this.boardtable= new Insquare[BOARD_LINE_COLUMN_GEOLOCATION_STANDARD][BOARD_LINE_COLUMN_GEOLOCATION_STANDARD];
		
		for(int tableline=0;tableline<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tableline++)
		{
			for(int tablecolumn=0;tablecolumn<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tablecolumn++)
			{
				this.boardtable[tableline][tablecolumn]= Insquare.ND;
			}
		}
		this.boardtable[3][3]=Insquare.LD;
		this.boardtable[3][4]=Insquare.DD;
		this.boardtable[4][3]=Insquare.DD;
		this.boardtable[4][4]=Insquare.LD;
	}
	
	/**
	 * Looks if the position given is a possible movement.
	 * @param x represents the given x position.
	 * @param y represents the given y position.
	 */
	public boolean IsPossibleMovement(int x, int y)
	{
		this.boardtable[squarex][squarey] = boardtable[x][y];
		if( this.boardtable[squarex][squarey]==Insquare.LD)	
			return false;
		if( this.boardtable[squarex][squarey]==Insquare.DD)
			return false;
		for (int geopos=GeoPosition.N.number; geopos<8; geopos++)
		{
			
		}
		return true;
	}
	
	// TODO consider overriding toString to display an ASCII-art version of the board

	
}
