import java.util.*;

public class CCC_2011_S4 {
	public static Scanner kbd = new Scanner(System.in);
	public static int[]blood = new int[8], pat = new int[8], blood2 = new int[8], pat2 = new int[8];
			//O- O+ A- A+ B- B+ AB- AB+
			//0  1  2  3  4  5  6   7
	public static void main(String[] args) {
		int total = 0, total2 = 0;
		for (int i = 0; i < 8; i++) {
			blood[i] = kbd.nextInt();
			blood2[i] = blood[i];
		}
		for (int i = 0; i < 8; i++) {
			pat[i] = kbd.nextInt();
			pat2[i] = pat[i];
		}
		//Type O blood
		total += donate(0,0);
		total += donate(1,1) + donate(0,1);
		//A- and B- blood
		total += donate(2,2) + donate(0,2);
		total += donate(4,4) + donate(0,4);
		//A+ and B+ blood
		total += donate(3,3) + donate(1,3);
		total += donate(5,5) + donate(1,5);
		total += donate(2,3) + donate(0,3);
		total += donate(4,5) + donate(0,5);
		//AB-
		total += donate(6,6) + donate(4,6) + donate(2,6) + donate(0,6);
		//Rest goes into AB+
		total += donate(7,7) + donate(6,7) + donate(5,7) + donate(4,7) + donate(3,7) + donate(2,7) + donate(1,7) + donate(0,7);
		
		for (int i = 0; i < 8; i++) {
			blood[i] = blood2[i];
			pat[i] = pat2[i];
		}
		//Method 2. Type O blood
		total2 += donate(0,0);
		total2 += donate(1,1) + donate(0,1);
		//A- and B- blood
		total2 += donate(2,2) + donate(0,2);
		total2 += donate(4,4) + donate(0,4);
		//A+ and B+ blood
		total2 += donate(3,3) + donate(2,3);
		total2 += donate(5,5) + donate(4,5);
		total2 += donate(1,3) + donate(0,3);
		total2 += donate(1,5) + donate(0,5);
		//AB-
		total2 += donate(6,6) + donate(4,6) + donate(2,6) + donate(0,6);
		//Rest goes into AB+
		total2 += donate(7,7) + donate(6,7) + donate(5,7) + donate(4,7) + donate(3,7) + donate(2,7) + donate(1,7) + donate(0,7);		
		
		System.out.println(Math.max(total, total2));
	}
	public static int donate(int b, int p) {
		int ans;
		if (blood[b]>=pat[p]) {
			blood[b] = blood[b]-pat[p];
			ans = pat[p];
			pat[p]=0;
		} else {
			pat[p] = pat[p]-blood[b];
			ans = blood[b];
			blood[b]=0;
		}
		return ans;
	}
}