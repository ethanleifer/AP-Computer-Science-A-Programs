import info.gridworld.actor.ActorWorld;

public class MyBugRunner 
{
	public static void main(String[] args) 
	{
		ActorWorld world = new ActorWorld();
		world.add(new SteadyFlower());
		world.show();
	}
}