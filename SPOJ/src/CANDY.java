import java.util.Scanner;

public class CANDY {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int cnt = in.nextInt();
			in.nextLine();
			if(cnt == -1) {
				break;
			}
			int[] candies = new int[cnt];
			int total = 0;
			while(cnt-- > 0) {
				candies[cnt] = in.nextInt();
				in.nextLine();
				total += candies[cnt];
			}
			if(total % candies.length != 0) {
				//not divisible
				System.out.println("-1");
			} else {
				int res = 0;
				int avg = total / candies.length;
				for(int i = 0; i < candies.length; i++) {
					if(candies[i] < avg) {
						res++;
					}
				}
				System.out.println(res);
			}
		}

	}

}
