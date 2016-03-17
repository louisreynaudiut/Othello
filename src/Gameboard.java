// TODO(done) fix comment (this class creates nothing, it represents something)
/**
 * Represents an Othello gameboard.
 * @author reynloui/palmierb
 *
 */
public class Gameboard {
	
	// TODO think about it: is it a maximum or a standard?
	/**
	 * the maximum number of lines and columns in the board. 
	 */
	private final static int BOARD_LINE_COLUMN_MAX = 8;
	
	// TODO consider unsing an enumeration for cell states
	/**
	 * an empty square. 
	 */
	private final static int NO_DISKS=0;
	
	/**
	 * a square filled with a light disk.
	 */
	private final static int LIGHT_DISKS=1;
	
	/**
	 * a square filled with a dark disk.
	 */
	private final static int DARK_DISKS=2;
	
	// TODO fix comment (ask for advice)
	// TODO rename field (not compliant with coding conventions)
	/**
	 * Each table value represents a square of the board.
	 */
	private int[][] board_table;
	
	/**
	 * Creates a new gameboard , in its starting configuration (a 8*8 square table 
	 * which each square is initialized empty except the four middle squares, 2 black and two light). 
	 */
	public Gameboard()
	{
		// TODO use constants
		this.board_table= new int[8][8];
		
		// TODO rename variable (not compliant with coding conventions
		for(int table_line=0;table_line<BOARD_LINE_COLUMN_MAX;table_line++)
		{
			for(int table_column=0;table_line<BOARD_LINE_COLUMN_MAX;table_line++)
			{
				this.board_table[table_line][table_column]= NO_DISKS;
			}
		}
		this.board_table[3][3]=LIGHT_DISKS;
		this.board_table[3][4]=DARK_DISKS;
		this.board_table[4][3]=DARK_DISKS;
		this.board_table[4][4]=LIGHT_DISKS;
	}
	
}
