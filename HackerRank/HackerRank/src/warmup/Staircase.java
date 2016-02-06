package warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb;
		for(int step = 1; step <= n; step++) {
			sb = new StringBuilder();
			for(int i = 1; i <= n - step; i++) {
//				add space
				sb.append(" ");
			}
			for(int i = 1; i <= step; i++) {
				sb.append("#");
			}
			System.out.println(sb.toString());
		}
		
		sc.close();
	}

}
