import java.util.*;

public class KAMIL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 10;
		while(t != 0) {
			int out = 1;
			String str = sc.nextLine();
			for(char a : str.toUpperCase().toCharArray()) {
				if ( a == 'T' || a == 'D' || a == 'F' || a == 'L')
					out = out*2;
			}
			System.out.println(out);
			t--;
		}
	}
}
