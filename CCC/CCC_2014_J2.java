import java.util.*;
public class CCC_2014_J2

{
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main( String[] args)
	{
		int votesA = 0;
		int votesB = 0;
		int numVotes = kbd.nextInt();
		String votes = kbd.next();

		for (int i = 0; i < numVotes; i++)
		{
			String temp = votes.substring(i, i+1);
			String a = "A";

			int compare = temp.compareTo(a);

			if (compare == 0)
				votesA ++;
			else if (compare == 1)
				votesB ++;
		}

		if (votesA > votesB)
			System.out.println("A");
		else if (votesB > votesA)
			System.out.println("B");
		else
			System.out.println("Tie");
	}
}
