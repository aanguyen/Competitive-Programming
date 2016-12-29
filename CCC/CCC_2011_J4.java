import java.util.*;

public class CCC_2011_J4 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main (String[] args) {
		//Note: ground array is accidentally set to [y][x]...
		
		int curX = 199, curY = 5;
		boolean[][] ground = new boolean[200][400];
		//False if undrilled. True if already drilled.
		//"0" = 200
		for (int i = 0; i < 200; i++)
			for (int j = 0; j < 400; j++)
				ground[i][j] = false;
		drillInit(ground);
		char dir = 0;
		boolean crash = false;
		while (dir!=113&&!crash) {		//"q" in ASCII is 113
			String str = kbd.next();
			dir = str.charAt(0);
			int num = kbd.nextInt();
			if (dir==108) {			//l
				crash = drill(ground, dir, num, curX, curY);
				curX = curX-num;
			}
			else if (dir==114) {	//r
				crash = drill(ground, dir, num, curX, curY);
				curX = curX+num;
			}
			else if (dir==100) {	//d
				crash = drill(ground, dir, num, curX, curY);
				curY = curY+num;
			}
			else if (dir==117) {	//u
				crash = drill(ground, dir, num, curX, curY);
				curY = curY-num;
			}
			if (dir!=113) {
				System.out.print((curX-200)+" "+(curY*-1));
				System.out.println( (crash)? " DANGER" : " safe");
			}
		}
		
	}
	public static void drillInit(boolean[][]ground) {
		ground[1][200] = true;
		ground[2][200] = true;
		for (int i = 200; i < 208; i++) {
			if (i!=204) ground[3][i] = true;
		}
		ground[4][203] = true;
		ground[5][203] = true;
		ground[4][205] = true;
		ground[5][205] = true;
		for (int j = 4; j < 8; j++) ground[j][207] = true;
		for (int i = 199; i < 207; i++) ground[7][i] = true;
		ground[6][199] = true;
		ground[5][199] = true;
	}
	public static boolean drill(boolean[][]ground, char dir, int num, int curX, int curY) {	//Returns true if there is a crash
		boolean check = false;
		if (dir==108) {
			for (int i = 1; i < num+1; i++) {
				if (ground[curY][curX-i]) {
					check = true;
					break;
				} else {
					ground[curY][curX-i] = true;
				}
			}
		}
		else if (dir==114) {
			for (int i = 1; i < num+1; i++) {
				if (ground[curY][curX+i]) {
					check = true;
					break;
				} else {
					ground[curY][curX+i] = true;
				}
			}
		}
		else if (dir==100) {
			for (int i = 1; i < num+1; i++) {
				if (ground[curY+i][curX]) {
					check = true;
					break;
				} else {
					ground[curY+i][curX] = true;
				}
			}
		}
		else if (dir==117) {
			for (int i = 1; i < num+1; i++) {
				if (ground[curY-i][curX]) {
					check = true;
					break;
				} else {
					ground[curY-i][curX] = true;
				}
			}			
		}
		return check;
	}
}