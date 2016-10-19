import java.util.* ;
public class CCC_2014_J3
{
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main( String[] args)
	{
		int pointsA = 100;
		int pointsD = 100;
		int numRounds = kbd.nextInt();
		for (int i = 0; i < numRounds; i++)
		{
			int rollA = kbd.nextInt();
			int rollD = kbd.nextInt();
			if (rollA < rollD)
				pointsA -= rollD;
			else if (rollD < rollA)
				pointsD -= rollA;
		}
		System.out.println(pointsA + "\n" + pointsD);
	}
}
