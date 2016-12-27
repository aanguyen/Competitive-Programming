import java.util.*;

public class CCC_2011_S2 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = kbd.nextInt(), count = 0;
		char[] ans = new char[num], key = new char[num];
		for (int i = 0; i < num; i++)
			ans[i] = kbd.next().charAt(0);
		
		for (int i = 0; i < num; i++)
			key[i] = kbd.next().charAt(0);
		
		for (int i = 0; i < num; i++)
			if (ans[i]==key[i]) count++;
		System.out.println(count);
	}
}