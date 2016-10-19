import java.util.*;
public class CCC_2014_J1

{
	public static Scanner kbd = new Scanner (System.in);	
	
	public static void main (String [] args)
	{
		int sideA = kbd.nextInt();
		int sideB = kbd.nextInt();
		int sideC = kbd.nextInt();
		if ((sideA + sideB + sideC) != 180)
			System.out.println("Error");
		else if (sideA == 60 && sideB == 60)
			System.out.println("Equilateral");
		else if (sideA != sideB && sideA != sideC && sideB != sideC)
			System.out.println("Scalene");
		else
			System.out.println("Isosceles");
	}
}
