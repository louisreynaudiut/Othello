/**
 * an Othello Player.
 * @author reynloui/palmierb
 *
 */
public class Player {
	
	/**
	 * the color of the player disks.
	 */
	private String color;
	
	/**
	 * Create a new player with a given color
	 * @param playerColor represent the player disks color.
	 */
	public Player(String playerColor)
	{
		this.color = playerColor;
	}

	public String getColor() {
		return color;
	}
	
}
