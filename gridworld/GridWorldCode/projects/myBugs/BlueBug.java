// BlueBug.java


//imports:
import info.gridworld.actor.Bug;
import java.awt.Color;

public class BlueBug extends Bug 
{
	
	public BlueBug()
	{
		super(Color.BLUE);
	}
	
	public void setColor(Color c)
	{}
	
	public void act()
	{
		if(canMove())
			move();
		else 
		{
			for (int i = 0; i < 7; i++)
				turn();	
		}
	}
}