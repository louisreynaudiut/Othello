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
	public void modifySquare(Scanner sc) throws NumberFormatException
	{
		 
		
		
		int i=10;
		int j=10;
		System.out.println("Please enter the x and y coordinates of the square you want to fill.\n");
		System.out.println("x:");
		while(this.x != i)
		{
			String x = sc.nextLine();
			try 
			{ 
				i = Integer.parseInt(x);
				this.x = i;
			} 
			catch (NumberFormatException e) 
			{ 
				System.out.println("The entry isn't a int. Please enter an int."); 
			}
		}
		
		System.out.println("y:");
		while(this.y != j)
		{
			String y = sc.nextLine();
			try 
			{ 
				j = Integer.parseInt(y);
				this.y = j;
			} 
			catch (NumberFormatException e) 
			{ 
				System.out.println("The entry isn't a int. Please enter an int."); 
			}
		
		}
		

	}
	
}
