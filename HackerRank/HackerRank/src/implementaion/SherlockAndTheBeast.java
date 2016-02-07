package implementaion;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndTheBeast {
	
	public static String getPerfectNumber(int val) {
		if(val < 3) {
			return "-1";
		}
		int ftemp = val;
		while(ftemp % 3 != 0) {
			ftemp -= 5;
		}
		if(ftemp % 3 != 0) return "-1";
		StringBuilder sb = new StringBuilder();
		int f = ftemp;
		int t= val - f;
		for(int i = 0; i < f; i++) {
			sb.append("5");
		}
		for(int i = 0; i < t; i++) {
			sb.append("3");
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		in.nextLine();
		while(cnt-- > 0) {
			int val = in.nextInt();
			String result = getPerfectNumber(val);
			System.out.println(result);
		}
		in.close();

	}

}
