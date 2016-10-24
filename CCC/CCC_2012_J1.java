import java.util.*;

public class CCC_2012_J1 {
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main (String[] args) {
		int limit = kbd.nextInt();
		int speed = kbd.nextInt();
		if (limit-speed>-1) 
			System.out.println("Congratulations, you are within the speed limit!");
		else {
			int fine;
			if (speed-limit<21)
				fine = 100;
			else if (speed-limit>30)
				fine = 500;
			else
				fine = 270;
			System.out.println("You are speeding and your fine is $" + fine + ".");
		}
	}
}