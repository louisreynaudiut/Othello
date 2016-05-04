/**
 * an Othello Player.
 * @author reynloui/palmierb
 *
 */
public class Player {
	
	/**
	 * the color of the player disks.
	 */
	protected Color color;
	
	/**
	 * Create a new player with a given color
	 * @param playerColor represent the player disks color.
	 */
	public Player(Color playerColor)
	{
		this.color = playerColor;
	}

	public Color getColor() {
		return color;
	}
	
}
