/**
 * An enumeration representing the different geometrical positions
 * @author reynloui
 *
 */
public enum GeoPosition {

	/**
	 * The north position. 
	 */
	N(0,-1,0),
	/**
	 * The north-east position.
	 */
	NE(1,-1,1),
	/**
	 * The east position.
	 */
	E(2,0,1),
	/**
	 * The south-east position.
	 */
	SE(3,1,1),
	/**
	 * The south position.
	 */
	S(4,1,0),
	/**
	 * The south-west position.
	 */
	SW(5,1,-1),
	/**
	 * The west position.
	 */
	W(6,0,-1),
	/**
	 * The north-west position.
	 */
	NW(7,-1,-1);
	
	/**
	 * represents the x variation of the geometrical movement
	 */
	protected int x;
	/**
	 * represents the y variation of the geometrical movement
	 */
	protected int y;
	/**
	 * represents the number of the variation of the geometrical movement
	 */
	protected int number;
	
	/**
	 * Creates a new geometrical position
	 * @param pos represents the number of the variation
	 * @param x1 represents the x variation
	 * @param y1 represents the y variation
	 */
	private GeoPosition(int pos, int x1, int y1)
	{
		this.number = pos;
		this.x = x1;
		this.y = y1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getNumber(){
		return number;
	}
	
}
