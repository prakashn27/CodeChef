import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class FCTRL2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();	//skip the remainig part of the line
		while(t-- > 0) {
			int a = in.nextInt();
			BigInteger res = BigInteger.ONE;
			for(int i = 1; i <= a; i++) {
				res = res.multiply(BigInteger.valueOf(i));
			}
			System.out.println(res);	
		}
	}
}
