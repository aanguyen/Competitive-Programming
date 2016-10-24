import java.util.*;

public class CCC_2012_J2 {
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main (String[] args) {
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		int c = kbd.nextInt();
		int d = kbd.nextInt();
		if (a>b&&b>c&&c>d)
			System.out.println("Fish Diving");
		else if (a<b&&b<c&&c<d)
			System.out.println("Fish Rising");
		else if (a==b&&b==c&&c==d)
			System.out.println("Constant Depth");
		else
			System.out.println("No Fish");
	}
}