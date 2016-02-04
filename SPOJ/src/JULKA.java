import java.math.BigInteger;
import java.util.Scanner;

public class JULKA {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int t = 10;
			while(t-- >0) {
				BigInteger a = in.nextBigInteger();
				in.nextLine();
				BigInteger b = in.nextBigInteger();
				in.nextLine();
				BigInteger temp = a.subtract(b);
				BigInteger val = temp.divide(BigInteger.valueOf(2));
				System.out.println(a.subtract(val));
				System.out.println(val);
			}
			in.close();
		}
		catch (Exception ex) {
			
		}
		
		

	}

}
