/**
 * a Player color.
 * @author reynloui/palmierb
 *
 */
public enum Color {
	
	/**
	 * represents the player 1, the light player.
	 */
	LD("O"),
	
	/**
	 * represents the player 2, the dark player.
	 */
	DD("X");
	
	protected String content;
	
	private Color(String cont)
	{
		this.content = cont; 
	}
	
	public String getcontent() 
	{
		return content;
	}
}
