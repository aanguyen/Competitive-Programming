import java.util.*;

public class CCC_2011_J2 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main (String[] args) {
		int h = kbd.nextInt();
		int max = kbd.nextInt();
		int t = 1;
		while (t <= max) {
			int alt = -6*(int)Math.pow(t, 4)+h*(int)Math.pow(t, 3)+2*(int)Math.pow(t, 2)+t;
			if (alt <= 0) break;
			t++;
		}
		System.out.println((t==max+1) ? "The balloon does not touch ground in the given time." : "The balloon first touches ground at hour:\n" + t);
	}
}