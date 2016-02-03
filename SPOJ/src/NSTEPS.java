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
				int x = in.nextInt();
				int y = in.nextInt();
				in.nextLine();
				if((x == y) || (x-2==y)){
                    if(x%2 == 0){
                        System.out.println(x+y);
                    }
                    else{
                        System.out.println(x+y-1);
                    }
                }
                else{
                    System.out.println("No Number");
                }
			}
			
		} catch(Exception e) {
			
		}
		

	}

}
