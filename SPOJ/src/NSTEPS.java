import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;

/**
 * @author prakashn
 *
 */
public class NSTEPS {

	/**
	 * @param args
	 */
	static void p(Object o) { System.out.println(o); }
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			in.nextLine();	
			while(t-- > 0) {
				int a = in.nextInt();
				int b = in.nextInt();
				in.nextLine();
				if((a == b) || (a - 2 == b)) {
//					boolean a_even = a % 2 == 0;
//					boolean b_even = b % 2 == 0;
					if(a % 2 == 0) {
						System.out.println(a+b);
					} else {
						System.out.println(a+b-1);
					}	
				} else {
					System.out.println("No Number");
				}
			}
			in.close();
			
		} catch(Exception e) {
			
		}	
		

	}

}
