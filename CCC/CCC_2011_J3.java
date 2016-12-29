import java.util.*;

public class CCC_2011_J3 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main (String[] args) {
		int a = kbd.nextInt(), b = kbd.nextInt(), length = 2;
		while (b<a) {
			int temp = b;
			b = a-b;
			a = temp;
			length++;
		}
		System.out.println(length);
	}
}