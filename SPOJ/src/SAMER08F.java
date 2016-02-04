import java.util.Scanner;

/**
 * 
 */

/**
 * @author prakashn
 *
 */
public class SAMER08F {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			while(true) {
				int t = in.nextInt();
				in.nextLine();
				if(t == 0) {
					break;
				}
				int res = (t * (t + 1) * (2 * t + 1)) / 6;
				System.out.println(res);
			}
			in.close();
		} catch(Exception e) {
			
		}
	}

}
