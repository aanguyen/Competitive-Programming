import java.util.* ;
public class CCC_2014_J4_S1
{
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main( String[] args)
	{
		int numFriends = kbd.nextInt();
		int numRounds = kbd.nextInt();
		int[] friends = new int [numFriends];
		for (int i = 0; i < numFriends; i++) {
			friends[i] = i + 1;
		}
		for (int i = 0; i < numRounds; i++) {
			int removeInterval = kbd.nextInt();
			removeFriends (friends, removeInterval);
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != 0)
				System.out.println(friends[i]);
		}

	}
	public static void removeFriends (int[] a, int b)
	{
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				counter ++;
			if (counter % b == 0)
				a[i] = 0;
		}
	}
}
