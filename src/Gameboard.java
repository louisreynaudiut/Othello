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
		GeoPosition[] Geo={GeoPosition.N, GeoPosition.NE, GeoPosition.E, GeoPosition.SE, GeoPosition.S, GeoPosition.SW, GeoPosition.W,GeoPosition.NW};
		this.boardtable[squarex][squarey] = this.boardtable[x-1][y-1];
		if(squarex>7 || squarey>7)
			return false;
		if( this.boardtable[squarex][squarey].content!= "+")	
			return false;
		for(int actualgeo=0; actualgeo<8; actualgeo++)
		{
			this.squarex+=Geo[actualgeo].x;
			this.squarey+=Geo[actualgeo].y;
			while(this.boardtable[squarex][squarey].content=="DD")
				{
					this.squarex+=Geo[actualgeo].x;
					this.squarey+=Geo[actualgeo].y;
					if(this.boardtable[squarex][squarey].content=="LD")
						return true;
				}
		}
		return false;
	}
	
	/**
	 * looks if there is any empty square left.
	 * @return a boolean. True if there isn't any more movement and false if there is movements left.
	 */
	public boolean IsFull()
	{
		for(int tableline=0;tableline<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tableline++)
		{
			for(int tablecolumn=0;tablecolumn<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tablecolumn++)
			{
				if(this.boardtable[tableline][tablecolumn].content == "+")
					return false;
			}
		}
	return true;
	}
	
	public void PutADisk(int x, int y, Player currentp)
	{
		this.boardtable[squarex][squarey] = this.boardtable[x-1][y-1];
		Player thecurrentp = currentp;
		if(thecurrentp.color=="0")
			this.boardtable[squarex][squarey].content = "0";
		else
			this.boardtable[squarex][squarey].content = "X";
	}
	
	public void Swap(int x, int y, Player currentp)
	{
		this.boardtable[squarex][squarey] = this.boardtable[x-1][y-1];
		Player thecurrentp = currentp;
		GeoPosition[] Geo={GeoPosition.N, GeoPosition.NE, GeoPosition.E, GeoPosition.SE, GeoPosition.S, GeoPosition.SW, GeoPosition.W,GeoPosition.NW};
		for(int actualgeo=0; actualgeo<8; actualgeo++)
		{
			this.squarex+=Geo[actualgeo].x;
			this.squarey+=Geo[actualgeo].y;
			while(this.boardtable[squarex][squarey].content=="DD")
				{
					this.squarex+=Geo[actualgeo].x;
					this.squarey+=Geo[actualgeo].y;
					if(this.boardtable[squarex][squarey].content=="LD")
					{
						while(this.boardtable[squarex][squarey] != this.boardtable[x-1][y-1])
						{
							this.squarex-=Geo[actualgeo].x;
							this.squarey-=Geo[actualgeo].y;
							this.boardtable[squarex][squarey].content = thecurrentp.color;
						}
					}
				}
		}
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
