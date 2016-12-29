import java.util.*;

public class CCC_2011_S1 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main (String[] args) {
		int t = 0, s = 0;
		for (int i = kbd.nextInt(); i >= 0; i--) {
			String str = kbd.nextLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j)==84||str.charAt(j)==116) t++;
				if (str.charAt(j)==83||str.charAt(j)==115) s++;
			}
		}
		System.out.println((s>=t) ? "French" : "English");
	}
}