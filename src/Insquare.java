/**
 * An enumeration representing the content of a square.
 * @author reynloui
 *
 */
public enum Insquare {
	
	/**
	 * an empty square.(ND means "no disks") 
	 */
	ND(0),
	/**
	 * a square filled with a light disk.(LD means "light disks") 
	 */
	LD(1),
	/**
	 * a square filled with a dark disk.(DD means "dark disks") 
	 */
	DD(2);

	private int content;
	/**
	 * Create a new square content with a given content.
	 * @param fill represent the content of the square.
	 */
	private Insquare(int fill)
	{
		this.content= fill;
	}

	public int getcontent() {
		return content;
	}
	
}
