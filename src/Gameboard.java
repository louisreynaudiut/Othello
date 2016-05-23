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
	public boolean isPossibleMovement(Square pointedsquare, Color currentp) throws NotInTheBoardException, NotAnEmptySquareChosenException, NoMovementAvailableException
	{
		int squarex;
		int squarey;
		Color thecurrentp = currentp;
		GeoPosition[] Geo={GeoPosition.N, GeoPosition.NE, GeoPosition.E, GeoPosition.SE, GeoPosition.S, GeoPosition.SW, GeoPosition.W,GeoPosition.NW};
		squarex=pointedsquare.x-1;
		squarey=pointedsquare.y-1;
		/*this.boardtable[squarex][squarey] = this.boardtable[x-1][y-1];*/
		if(squarex>7 || squarey>7 || squarex<0 || squarey<0) throw new NotInTheBoardException();
		
		if( this.boardtable[squarex][squarey]!= Insquare.ND)
		{	
			throw new NotAnEmptySquareChosenException();
		}
		if(thecurrentp==Color.LD)
		{
			for(int actualgeo=0; actualgeo<8; actualgeo++)
			{
				squarex+=Geo[actualgeo].x;
				squarey+=Geo[actualgeo].y;
				if(squarex>7 || squarex<0)
					squarex-=Geo[actualgeo].x;
				if(squarey>7 || squarey<0)
					squarey-=Geo[actualgeo].y;
				while(this.boardtable[squarex][squarey]==Insquare.DD)
				{
					squarex+=Geo[actualgeo].x;
					squarey+=Geo[actualgeo].y;
					if(squarex>7 || squarex<0)
						squarex-=Geo[actualgeo].x;
					if(squarey>7 || squarey<0)
						squarey-=Geo[actualgeo].y;
						if(this.boardtable[squarex][squarey]==Insquare.LD)
						{
							return true;
						}
				}
				squarex=pointedsquare.x-1;
				squarey=pointedsquare.y-1;
			}
		}
		if(thecurrentp==Color.DD)
		{
			for(int actualgeo=0; actualgeo<8; actualgeo++)
			{
				squarex+=Geo[actualgeo].x;
				squarey+=Geo[actualgeo].y;
				if(squarex>7 || squarex<0)
					squarex-=Geo[actualgeo].x;
				if(squarey>7 || squarey<0)
					squarey-=Geo[actualgeo].y;
				while(this.boardtable[squarex][squarey]==Insquare.LD)
					{
						squarex+=Geo[actualgeo].x;
						squarey+=Geo[actualgeo].y;
						if(squarex>7 || squarex<0)
							squarex-=Geo[actualgeo].x;
						if(squarey>7 || squarey<0)
							squarey-=Geo[actualgeo].y;
						if(this.boardtable[squarex][squarey]==Insquare.DD)
						{
							return true;
						}
					}
				squarex=pointedsquare.x-1;
				squarey=pointedsquare.y-1;
			}
		}
		throw new NoMovementAvailableException();
	}
	
	/**
	 * looks if there is any empty square left.
	 * @return a boolean. True if there isn't any more movement and false if there is movements left.
	 */
	public boolean isFull()
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
	
	public void putADisk(Square pointedsquare, Color currentp)
	{
		Insquare filling;
		int squarex;
		int squarey;
		squarex=pointedsquare.x-1;
		squarey=pointedsquare.y-1;
		//this.boardtable[squarex][squarey] = this.boardtable[x-1][y-1];
		Color thecurrentp = currentp;
		if (thecurrentp==Color.LD)
			filling = Insquare.LD;
		else
			filling = Insquare.DD;
		this.boardtable[squarex][squarey] = filling;
		
	}
	
	public void swap(Square pointedsquare, Color currentp)
	{
		/**
		 * the square that is filled
		 */
		Insquare filling = null;
		
		/**
		 * a x position for a given square.
		 */
		int squarex;
		
		/**
		 * a y position for a given square.
		 */
		int squarey;
		
		squarex=pointedsquare.x-1;
		squarey=pointedsquare.y-1;
		/*this.boardtable[squarex][squarey] = this.boardtable[x-1][y-1];*/
		Color thecurrentp = currentp;
		GeoPosition[] Geo={GeoPosition.N, GeoPosition.NE, GeoPosition.E, GeoPosition.SE, GeoPosition.S, GeoPosition.SW, GeoPosition.W,GeoPosition.NW};
		for(int actualgeo=0; actualgeo<8; actualgeo++)
		{
			squarex+=Geo[actualgeo].x;
			squarey+=Geo[actualgeo].y;
			if(squarex>7 || squarex<0)
				squarex-=Geo[actualgeo].x;
			if(squarey>7 || squarey<0)
				squarey-=Geo[actualgeo].y;
			if(thecurrentp==Color.LD)
			{	
				while(this.boardtable[squarex][squarey]==Insquare.DD)
				{
					squarex+=Geo[actualgeo].x;
					squarey+=Geo[actualgeo].y;
					if(squarex>7 || squarex<0)
						squarex-=Geo[actualgeo].x;
					if(squarey>7 || squarey<0)
						squarey-=Geo[actualgeo].y;
					if(this.boardtable[squarex][squarey]==Insquare.LD)
					{
						while(squarex!=((pointedsquare.x)-1) || squarey!=((pointedsquare.y)-1))
						{
							squarex-=Geo[actualgeo].x;
							squarey-=Geo[actualgeo].y;
							filling = Insquare.LD;
							this.boardtable[squarex][squarey] = filling;
						}
					}
				}
			}
			if(thecurrentp==Color.DD)
			{
				while(this.boardtable[squarex][squarey]==Insquare.LD)
				{
					squarex+=Geo[actualgeo].x;
					squarey+=Geo[actualgeo].y;
					if(squarex>7 || squarex<0)
						squarex-=Geo[actualgeo].x;
					if(squarey>7 || squarey<0)
						squarey-=Geo[actualgeo].y;
					if(this.boardtable[squarex][squarey]==Insquare.DD)
					{
						while(squarex!=((pointedsquare.x)-1) || squarey!=((pointedsquare.y)-1))
						{
							squarex-=Geo[actualgeo].x;
							squarey-=Geo[actualgeo].y;
							if(squarex>7 || squarex<0)
								squarex-=Geo[actualgeo].x;
							if(squarey>7 || squarey<0)
								squarey-=Geo[actualgeo].y;
							filling = Insquare.DD;
							this.boardtable[squarex][squarey] = filling;
						}
					}
				}
			}
			squarex=pointedsquare.x-1;
			squarey=pointedsquare.y-1;
		}
	}

	// TODO(done) consider overriding toString to display an ASCII-art version of the board
	@Override
	public String toString() 
	{
		/**
		 * the drawing of the board.
		 */
		String boarddrawn;
		
		boarddrawn = "+12345678 | y";
		for(int tableline=0;tableline<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tableline++)
		{
			boarddrawn += "\n"+(tableline+1);
			for(int tablecolumn=0;tablecolumn<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tablecolumn++)
			{
			boarddrawn += this.boardtable[tableline][tablecolumn].content;
			}
		}
		boarddrawn += "\n"+"-"+"\n"+"x";
	return boarddrawn;
	}
/*
	public boolean IsFull() {
		for(int tableline=0;tableline<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tableline++)
		{
			for(int tablecolumn=0;tablecolumn<BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tablecolumn++)
			{
				if(this.boardtable[tableline][tablecolumn]==Insquare.ND)
				return false;
			}
		}
	return true;
	}
*/

	public boolean playerHasMovementAvailable(Color color) throws NotInTheBoardException, NotAnEmptySquareChosenException, NoMovementAvailableException {
		for(int tableline=1;tableline<=BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tableline++)
		{
			for(int tablecolumn=1;tablecolumn<=BOARD_LINE_COLUMN_GEOLOCATION_STANDARD;tablecolumn++)
			{
				Square thesquare = new Square(tableline,tablecolumn);
				try
				{
					this.isPossibleMovement(thesquare, color);
					return true;
				}
				catch (Exception e)
				{
					
				}
				
			}
		}
		return false;
	}
}
