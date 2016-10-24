import java.util.*;

public class CCC_2012_J4 {
	public static Scanner kbd = new Scanner (System.in);
	public static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static void main (String[] args) {
		int n = kbd.nextInt();
		String str = kbd.next();
		char [] word = str.toCharArray();
		char [] decode = new char[word.length];
		for (int i = 0; i < word.length; i++) {
			decode[i] = decode(word[i], i+1, n);
		}
		for (int i = 0; i < word.length; i++) {
			System.out.print(decode[i]);
		}
	}
	public static char decode (char a, int p, int k) {
		int index = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i]==a) {
				index = i;
				i = alphabet.length;			
			}

		}
		index -= (3*p+k);
		if (index < 0)
			index += 26;
		return alphabet[index];
	}
}