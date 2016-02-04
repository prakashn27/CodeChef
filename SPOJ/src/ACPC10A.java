import java.util.Scanner;

/**
 * @author prakashn
 *
 */
public class ACPC10A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			while(true) {
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();
				in.nextLine();
				if(a == 0 && b == 0 && c == 0) {
					break;
				}
				if(b - a == c - b) {
					// AP
					int res = c + (c - b);
					System.out.println("AP " + res);
				} else {
					//GP
					int res = c * (c / b);
					System.out.println("GP " + res);
				}
			}
		} catch(Exception ex) {
			
		}

	}

}
