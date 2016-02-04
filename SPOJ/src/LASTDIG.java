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
			int b = in.nextInt();
			in.nextLine();
			if(b == 1) {
				System.out.println(a);
				continue;
			}
			for(int i = 1; i <= 4; i++) {
				pattern[i] = (int) (Math.pow(a,i)) % 10;
				//System.out.println(a + "^" + i + " : " +  (Math.pow(a,i)) % 10);
			}
			int temp = b%4;
			int res = pattern[temp];
			System.out.println(res);
		}
		in.close();
	}

}
