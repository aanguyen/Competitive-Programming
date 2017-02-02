import java.util.*;

public class CCC_2012_S5 {
	public static Scanner kbd = new Scanner(System.in);
	
	public static void main (String[] args) {
		int row = kbd.nextInt();
		int col = kbd.nextInt();
		int[][] grid = new int[row+1][col+1];
		grid[0][1] = 1;
		boolean[][] isCat = new boolean[row+1][col+1];
		int cats = kbd.nextInt();
		int[][] catCells = new int[cats][2];
		for (int i = 0; i < cats; i++) {
			isCat[kbd.nextInt()][kbd.nextInt()] = true;
		}
		for (int i = 1; i < row+1; i++) {
			for (int j = 1; j < col+1; j++) {
				if (!isCat[i][j]) {
					grid[i][j] = grid[i-1][j] + grid[i][j-1];
				}
			}
		}
		System.out.println(grid[row][col]);
	}
}