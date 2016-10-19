import java.util.* ;
public class CCC_2014_J5_S2
{
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main( String[] args)
	{
		boolean GoodOrBad = true;
		int students = kbd.nextInt();
		String [] [] partners = new String [2] [students];
		String [] names = new String [students];
		for (int i = 0; i < names.length; i++)
		{
			names[i] = kbd.next();
		}
		int compare = 1;
		int check = 1;

		String [] names2 = new String [students];
		for (int i = 0; i < names.length; i++)
		{
			names2[i] = kbd.next();
		}

		//Putting partners in a table
		for (int i = 0; i < students; i++)
		{
			PairUp (partners, names[i], names2[i], i);
		}
		//Checking to see if they are paired with the same person
		for (int a = 0; a < students; a++)
		{
			for (int b = 0; b < 2; b++)
			{
				for (int i = 0; i < students; i++)
				{
					for (int j = 0; j < 2; j++)
					{
						compare = partners[b][a].compareTo(partners[j][i]);
						//Once a match has been found, check to see if that person is
						//paired with the same person
						if (compare == 0)
						{
							if (b == 0 && j == 0)
								check = partners[1][a].compareTo(partners[1][i]);
							else if (b == 1 && j == 0)
								check = partners[0][a].compareTo(partners[1][i]);
							else if (b == 1 && j == 1)
								check = partners[0][a].compareTo(partners[0][i]);
							else if (b == 0 && j == 1)
								check = partners[1][a].compareTo(partners[0][i]);
							if (check != 0)
								GoodOrBad = false;
						}
					}
				}
			}
		}


		//Checking to see if anybody is paired with themself
		for (int i = 0; i < students; i++)
		{
			boolean self = names[i].equals(names2[i]);
			if (self == true)
				GoodOrBad = false;
		}


		if (GoodOrBad == false)
			System.out.println("bad");
		else if (GoodOrBad == true)
			System.out.println("good");
	}
	public static void PairUp (String[][]array, String a, String b, int col)
	{
		array[0][col] = a;
		array[1][col] = b;
	}
}
