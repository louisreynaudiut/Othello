// TODO(done) fix comment (this class creates nothing, it represents something)
/**
 * Represents a new Othello gameboard.
 * @author reynloui/palmierb
 *
 */
public class Gameboard {
	
	/**
	 *Represents the number max of line and column in the board. 
	 */
	private final static int BOARD_LINE_COLUMN_MAX = 8;
	/**
	 * Represents an empty square. 
	 */
	private final static int NO_DISKS=0;
	/**
	 * Represents a square filled with a light disk.
	 */
	private final static int LIGHT_DISKS=1;
	/**
	 * Represents a square filled with a dark disk.
	 */
	private final static int DARK_DISKS=2;
	
	/**
	 * Each table value represents a square of the board.
	 */
	private int[][] board_table;
	
	// TODO(done) fix comment (ask for advice)
	/**
	 * Creates a new gameboard , in its starting configuration (a 8*8 square table 
	 * which each square is initialized empty except the four middle squares, 2 black and two light). 
	 */
	public Gameboard()
	{
		this.board_table= new int[8][8];
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
