import java.util.Scanner;

public class Square {
	
	public final static int Local_X=0;
	public final static int Local_Y=0;
	int x;
	int y;

	public Square()
	{
		this.x = Local_X;
		this.y = Local_Y;
	}
	
	public Square(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void modifySquare() throws UnsupportedKeyBoardEntry
	{
		 
		Scanner scx = new Scanner(System.in);
		Scanner scy = new Scanner(System.in);
		
		int i=10;
		int j=10;
		System.out.println("Please enter the x and y coordinates of the square you want to fill.\n");
		System.out.println("x:");
		while(this.x != i)
		{
			String x = scx.nextLine();
			try 
			{ 
				i = Integer.parseInt(x);
				this.x = i;
			} 
			catch (Exception e) 
			{ 
				System.out.println("The entry isn't a int. Please enter an int."); 
			}
		}
		
		System.out.println("y:");
		while(this.y != j)
		{
			String y = scx.nextLine();
			try 
			{ 
				j = Integer.parseInt(y);
				this.y = j;
			} 
			catch (Exception e) 
			{ 
				System.out.println("The entry isn't a int. Please enter an int."); 
			}
		
		}
		scx.close();
		scy.close();

	}
	
}
