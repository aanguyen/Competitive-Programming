import java.util.*;

public class CCC_2011_J1 {
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main (String[] args) {
		int a, e;
		System.out.println("How many antennas?");
		a = kbd.nextInt();
		System.out.println("How many eyes?");
		e = kbd.nextInt();
		if (a>2&&a<5) {
			System.out.println("TroyMartian");
		}
		if (a<7&&a>1) {
			System.out.println("VladSaturnian");
		}
		if (a<3&&a<4) {
			System.out.println("GraemeMercurian");
		}
	}
}