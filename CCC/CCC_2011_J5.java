import java.util.*;

public class CCC_2011_J5 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main (String[] args) {
		int people = kbd.nextInt();
		int[] invite = new int[people];
		for (int i = 1; i < people; i++)
			invite[i] = kbd.nextInt();
		System.out.println(ways(invite, people, people));
	}
	public static int ways(int[] invite, int people, int num) {
		int ans = 1;
		for (int i = 0; i < people; i++)
			if (invite[i]==num)
				ans *= (1+ways(invite, people, i+1));
		return ans;
	}
}
