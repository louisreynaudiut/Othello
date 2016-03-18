// TODO(done) fix comment (this class creates nothing, it represents something)
/**
 * Represents an Othello gameboard.
 * @author reynloui/palmierb
 *
 */
public class Gameboard {
	
	// TODO(done) think about it: is it a maximum or a standard?
	/**
	 * the maximum number of lines and columns in the board. 
	 */
	private final static int BOARD_LINE_COLUMN_GEOLOCATION_STANDARD = 8;
	
	// TODO(done) consider using an enumeration for cell states
		
	// TODO(done) fix comment (ask for advice)
	// TODO(done) rename field (not compliant with coding conventions)
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
		// TODO(done) use constants
		this.boardtable= new Insquare[BOARD_LINE_COLUMN_GEOLOCATION_STANDARD][BOARD_LINE_COLUMN_GEOLOCATION_STANDARD];
		
		// TODO(done) rename variable (not compliant with coding conventions
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

	
}
