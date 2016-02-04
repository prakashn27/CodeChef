import java.util.Scanner;

public class LASTDIG {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		in.nextLine();
		int[] pattern = new int[5];
		pattern[0] = 0;
		
		while(cnt-- > 0) {
			int a = in.nextInt();
			long b = in.nextLong();
			if(b == 0){System.out.println(1); continue;}
            if(a == 0){System.out.println(0); continue;}
			in.nextLine();
			if(b == 1) {
				System.out.println(a);
				continue;
			}
			b %= 4;
			if(b == 0) b = 4;
			int res = (int) Math.pow(a, b) % 10;
			System.out.println(res);
		}
		in.close();
	}

}
