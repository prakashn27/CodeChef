import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FASHION {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		in.nextLine();
		while(count-- > 0) {
			int boys_cnt = in.nextInt();
			in.nextLine();
			int girls_cnt = boys_cnt;
			ArrayList<Integer> b = new ArrayList<Integer>(boys_cnt);
			ArrayList<Integer> g = new ArrayList<Integer>(girls_cnt);
			while(boys_cnt-- > 0) {
				b.add(in.nextInt());
			}
			in.nextLine();
			while(girls_cnt-- > 0) {
				g.add(in.nextInt());
			}
			in.nextLine();
			Collections.sort(b);
			Collections.reverse(b);
			Collections.sort(g);
			Collections.reverse(g);
			int temp, res = 0;
			for(int i = 0; i < b.size(); i++) {
				temp = b.get(i) * g.get(i);
//				System.out.println("temp is " + temp);
				res += temp;
			}
//			System.out.println(b);
//			System.out.println(g);
			System.out.println(res);
		}
		in.close();
		

	}

}
