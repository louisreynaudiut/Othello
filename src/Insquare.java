/**
 * An enumeration representing the content of a square.
 * @author reynloui
 *
 */
public enum Insquare {
	
	/**
	 * an empty square.(ND means "no disks") 
	 */
	ND("+"),
	/**
	 * a square filled with a light disk.(LD means "light disks") 
	 */
	LD("O"),
	/**
	 * a square filled with a dark disk.(DD means "dark disks") 
	 */
	DD("X");

	protected String content;
	/**
	 * Create a new square content with a given content.
	 * @param fill represent the content of the square.
	 */
	private Insquare(String fill)
	{
		this.content= fill;
	}

	public String getcontent() {
		return content;
	}
	
}
