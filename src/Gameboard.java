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
	 * the drawing of the board.
	 */
	private String boarddrawn;
	
	/**
	 * The player color on the board.
	 */
	private String colorplayer;
	/**
	 * Creates a new gameboard , in its starting configuration (a 8*8 square table 
	 * which each square is initialized empty except the four middle squares, 2 black and two light). 
	 */
	public Gameboard()
	{
		this.colorplayer = Insquare.LD.content;
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
		
		this.boardtable[squarex][squarey] = boardtable[x-1][y-1];
		if(squarex>7 || squarey>7)
			return false;
		if( this.boardtable[squarex][squarey]==Insquare.LD || this.boardtable[squarex][squarey]==Insquare.DD)	
			return false;
		
			this.squarex+=GeoPosition.N.x;
			this.squarey+=GeoPosition.N.y;
			if(this.boardtable[squarex][squarey].content == colorplayer || this.boardtable[squarex][squarey].content == Insquare.ND.content )
			{
				return false;
			}
			else
			{
				for (int geopos=GeoPosition.N.number; ((squarex<8 && squarex>=0) || (squarey<8 && squarex>=0)); geopos++)
				{
					this.squarex+=GeoPosition.N.x;
					this.squarey+=GeoPosition.N.y;
					if(this.boardtable[squarex][squarey].content == colorplayer || this.boardtable[squarex][squarey].content == Insquare.ND.content )
					{
						return true;
					}
				}
			}
			
	
		return true;
	}
	/**
	 * looks if there is any empty square left.
	 * @return a boolean. True if there is some empty squares and no if not.
	 */
	public boolean AvailableMovement()
	{
		for(int tableline=0;tableline<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tableline++)
		{
			for(int tablecolumn=0;tablecolumn<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tablecolumn++)
			{
				if(this.boardtable[tableline][tablecolumn].content == "+")
					return true;
			}
		}
	return false;
	}
	
	// TODO(done) consider overriding toString to display an ASCII-art version of the board

	@Override
	public String toString() 
	{
		this.boarddrawn = "+12345678";
		for(int tableline=0;tableline<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tableline++)
		{
			this.boarddrawn += "\n"+(tableline+1);
			for(int tablecolumn=0;tablecolumn<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tablecolumn++)
			{
			this.boarddrawn += this.boardtable[tableline][tablecolumn].content;
			}
		}
	return this.boarddrawn;
	}
	
}
