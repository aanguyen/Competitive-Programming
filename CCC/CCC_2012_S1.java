import java.util.*;

public class CCC_2012_S1 {
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main (String[] args) {
		int n = kbd.nextInt();
		n = (n-1)*(n-2)*(n-3)/6;
		System.out.println(n);
	}
}