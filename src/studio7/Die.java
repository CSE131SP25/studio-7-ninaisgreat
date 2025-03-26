package studio7;

public class Die {
private int sides;

public Die (int sides)
{
	this.sides = sides;
}

public int roll()
{
	int random = (int)(Math.random()*(sides))+1;
	return random;
}
public static void main (String [] args)
{
	Die d1 = new Die(5);
	System.out.println("Dice rolls: " + d1.roll());
}
}
