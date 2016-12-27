import java.util.*;

public class CCC_2011_S3 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main (String[] args) {
		int t = kbd.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(isCrystal(kbd.nextInt(), kbd.nextInt(), kbd.nextInt()) ? "crystal" : "empty");
		}
	}
	public static boolean isCrystal(int m, int x, int y) {
		int x1 = (int)(x/Math.pow(5, m-1));
		int y1 = (int)(y/Math.pow(5, m-1));
		if (y1==0 && x1>0 && x1<4)
			return true;
		else if (y1==1 && x1==2)
			return true;
		else if ((y1==2&&x1==2)||(y1==1&&(x1==1||x1==3))) {
			return isCrystal(m-1, x%(int)Math.pow(5, m-1), y%(int)Math.pow(5, m-1));
		}
		return false;
	}
}