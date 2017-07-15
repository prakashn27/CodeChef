package implementaion;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		while(cnt-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double a_root = Math.sqrt(a);
			double b_root = Math.sqrt(b);
//			System.out.println(a_root + " : " + b_root);
			int result = 0;
			if((int)a_root == (int)b_root) {
				System.out.println("0");
				continue;
			}
			for(double i = a_root; i <= b_root; i++) {
				result++;
			}
			System.out.println(result);
		}
		sc.close();

	}

}
