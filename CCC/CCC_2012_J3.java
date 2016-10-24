import java.util.*;

public class CCC_2012_J3 {
	public static Scanner kbd = new Scanner (System.in);
	
	public static void main (String[] args) {
		int n = kbd.nextInt();
		char [][] pattern = {{'*', 'x', '*'}, {' ', 'x', 'x'} , {'x', ' ', 'x'}};
		char [][] board = new char[3*n][3*n];
		
		for (int i = 0; i < 3*n; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < n; k++) {
					board[i][j*n+k] = pattern[i/n][j];
				}
			}
		}
		for (int i = 0; i < 3*n; i++) {
			for  (int j = 0; j < 3*n; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}