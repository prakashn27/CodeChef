package implementaion;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		in.nextLine();
		while(cnt-- > 0) {
			try {
				int a = in.nextInt();
				in.nextLine();
				int res = 1;
				for(int i = 0; i < a/2; i++) {
					res = res * 2;
					res = res + 1;
				}
				if(a % 2 == 1) {
					res = res * 2;
				}
				System.out.println(res);
				
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		in.close();

	}

}
